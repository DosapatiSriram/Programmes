

import java.util.Scanner;

public class HorseDiff {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t>0){
	      int n=scan.nextInt();
	      int[] arr=new int[n];
	      for(int i=0;i<n;i++){
	          arr[i]=scan.nextInt();
	      }
	      int temp=0,min=0;
	     
		if(arr[1]>arr[0])
	      {min=arr[1]-arr[0];}
	      else 
	      {  min=arr[0]-arr[1];}
	      for(int i=0;i<n;i++){
	          for(int j=i+1;j<n;j++){
	              if(arr[j]>arr[i])
	                  temp=arr[j]-arr[i];
	              else
	                  temp=arr[i]-arr[j];
	          if(temp<=min)
		              min=temp;
	          }
	          
	      }
	      System.out.println(min);
	       t--;
	    }

	}

}
