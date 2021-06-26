

import java.io.*;

public class ThreeFiveMin {

	public static int sumOfDigits(int value){
		int sum=0;
		while(value!=0){
			sum += value%10;
			value=value/10;
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int l=Integer.parseInt(br.readLine());
      int r=Integer.parseInt(br.readLine());
      int temp=l;
      while(l<=temp && temp <= r){
    	  //System.out.println("loop started");
    	  if(temp % 5 ==0){
    		  if(sumOfDigits(temp) % 3 ==0){
    			  System.out.println(temp);
    			  break;
    		  }else{
    			  System.out.println(temp);
    			  break;
    		  }
    		  
    	  }else if(sumOfDigits(temp) % 3 ==0){
    		  System.out.println(temp);
    		  break;
    	  }
    	  temp++;
      }
      System.out.println("Program completed");
	}

}
