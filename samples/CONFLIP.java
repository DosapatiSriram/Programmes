

import java.util.Scanner;

public class CONFLIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
	      int t=scan.nextInt();
	      
	      while(t-- > 0){
	    	        
	          int G=scan.nextInt();
	        while(G-->0){
	        	
	             int I=scan.nextInt();
	             int N=scan.nextInt();
	             int Q=scan.nextInt();
		     if(N%2==0){
		        System.out.println(N/2);
		     }else{
		        if(I==Q)
		          System.out.println(N/2);
		         else 
		           System.out.println(N/2+1);
		     }
		     
	       }
	         
	     }
	     scan.close();
	     

	}

}
