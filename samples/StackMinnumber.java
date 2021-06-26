
import java.io.*;
import java.util.*;

public class StackMinnumber {

	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack=new Stack<String>();
		Stack<String> minstack=new Stack<String>();
		String presentcommand="";
		StackMinnumber obj=new StackMinnumber();
        while((presentcommand=br.readLine()) != "" ){
        	String min="";
        	try{
        		min=minstack.peek();
        	}catch(EmptyStackException e){
        		min="99999999";
        	}
        	String[] eachline=presentcommand.split(" ");
        	if(eachline[0].equals("push")){
        		stack.push(eachline[1]);
        		if(Integer.parseInt(eachline[1])< Integer.parseInt(min)){
        			min=eachline[1];
        			minstack.push(eachline[1]);
        		}
        		
        	}else if(eachline[0].equals("pop")){
        		String str=stack.pop();
        		//System.out.println("pop --> "+str);
        		if(Integer.parseInt(str) == Integer.parseInt(min)){
        			minstack.pop();
        			try{
        			min=minstack.peek();
        			}catch(EmptyStackException e){
        				min="Empty";
        			}
        			//System.out.println("minstack elem --> "+minstack.elementAt(0));
        		} 
        		
        	}
        	
        	System.out.println(min);
        }
	}

}
