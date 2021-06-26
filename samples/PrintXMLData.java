

import java.util.*;

public class PrintXMLData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sb=new String("<head><one><a>jcwc</a><three attr='456' attr=abc attr='def'>121</three></one><two>264</two></head>");
      Stack<String> stack=new Stack<String>();
      ArrayList<String> list=new ArrayList<String>();
      
      while(!sb.equals("")){
	      int i=sb.indexOf("<");
	      if(i!=0){
	    	  list.add(sb.substring(0,i));
	      }
	      //System.out.println("i -- "+i);
	      //System.out.println("substring -- "+sb.substring(i+1));
	      int j=sb.indexOf(">");
	      //System.out.println("j -- "+j);
	      
	      String xml=sb.substring(i+1,j);
	      if(xml.substring(0,1).equals("/")){
	    	  if(!stack.pop().equals(xml.substring(1))){
	    		System.out.println("XML Pattern mismatch ..!");
	    		return;
	    	  }
	    	  
	      }else if((xml.indexOf(" ")>-1)){
	    	  String[] attributes=xml.split(" ");
	    	  for(int p=1;p<attributes.length;p++){
	    		  list.add(attributes[p].split("=")[1]);
	    	  }
	    	  
	    	  //attributes.forEach(i -> list.add(i));
	    	  stack.push(attributes[0]);
	      }else{
	    	  stack.push(xml);
	      }
	      //System.out.println("xml -- "+ xml);
	      
	      sb=sb.substring(j+1);
	      
	      //System.out.println("sb --> "+sb);
      }
      
      list.stream().forEach(System.out::println);
      
      
      
	}

}
