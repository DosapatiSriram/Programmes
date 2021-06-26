
import java.io.*;
import java.util.*;

import org.apache.poi.util.SystemOutLogger;
public class SpiralMatrix {

	public static void printSpiral(int[][] array,int a,int b,int n,int size1){
		if(n/2==a && n/2==b && n%2!=0){
			System.out.println(array[a][b]);
			return ;
		}else if(n/2==a && n/2==b){
			return ;
		}
		for(int i=a;i<size1;i++){
			System.out.print(array[a][i]+" ");
		}
		
		for(int i=a+1;i<size1;i++){
			System.out.print(array[i][size1-1]+" ");
		}
		
		for(int i=size1-2;i>=a;i--){
			System.out.print(array[size1-1][i]+" ");
		}
		
		for(int i=size1-2;i>a;i--){
			System.out.print(array[i][a]+" ");
		}
		
		printSpiral(array,a+1,b+1,n,size1-1);
	}
	
	public static void printReverseSpiral(int[][] array,int a,int b,int n,int size,LinkedList<Integer> list){
		
		/*if(!(a+n < size) || !(b+n < size)){
			return;
		}*/
		
		try{
			for(int i=b+n-1;b-i<=n;i--){
				System.out.print(array[a+n][i]+" ");
				list.add(array[a+n][i]);
			}
			
			for(int i=a+n-1;a-i<=n;i--){
				System.out.print(array[i][b-n]+" ");
				list.add(array[i][b-n]);
			}
			
			for(int i=b-n+1;i-b<=n;i++){
				System.out.print(array[a-n][i]+" ");
				list.add(array[a-n][i]);
			}
			
			for(int i=a-n+1;i<=a+n;i++){
				System.out.print(array[i][b+n]+" ");
				list.add(array[i][b+n]);
			}
		}catch(Exception e){
			list.stream().forEach(System.out::println);
			
			return;
		}
		
		printReverseSpiral(array,a,b,n+1,size,list);
		
	}
	
	public static void printSpiralRighttoLeft(int[][] array,int a,int b,int size){
		
		if(size/2==a){
			return;
		}	
	 	
		for(int i=b;i>=a;i--){
			System.out.print(array[a][i]+" ");
		}
		
		for(int i=a+1;i<=b;i++){
			System.out.print(array[i][a]+" ");
		}
		
		for(int i=a+1;i<b;i++){
			System.out.print(array[b][i]+" ");
		}
		
		for(int i=b;i>a;i--){
			System.out.print(array[i][b]+" ");
		}
	 
		printSpiralRighttoLeft(array,a+1,b-1,size);
	}
	
	public static void printdiagonal(int[][] array,int n){
		
		String complete="";boolean flag=true;
		List<Integer> list=new LinkedList<Integer>();
		Stack<Integer> stack=new Stack<Integer>();
	    for(int i=0;i<n;i++){
	    	int a=i,b=0;
	    	String zigzagpart="";
	    	while(a>=0){
	    		if(flag){
	    			zigzagpart += array[a][b]+" ";
	    			list.add(array[a][b]);
	    		}else{
	    			zigzagpart = array[a][b]+" "+zigzagpart;
	    			stack.push(array[a][b]);
	    		}
	    		a=a-1;
	    		b=b+1;
	    	}
	    	flag = !flag;
	    	
	    	complete += zigzagpart;
	    	while(stack.size() != 0){
	    		list.add(stack.pop());
	    	}
	    	
	    }
	    System.out.println(complete);
	    list.stream().forEach(i -> System.out.print(i+" "));
	    for(int i=1;i<n;i++){
	    	int a=n-1,b=i;
	    	while( b<n){
	    		System.out.print(array[a][b]+" ");
	    		a=a-1;
	    		b=b+1;
	    	}
	    }
	
	
	}
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          int size=Integer.parseInt(br.readLine());
          int[][] matrix=new int[size][size];
          for(int i=0;i<size;i++){
        	  String eachRow=br.readLine();
        	  for(int j=0;j<size;j++){
        		  matrix[i][j]=Integer.parseInt(eachRow.split(" ")[j]);
        	  }
          }
          /*for(int i=0;i<size;i++){
        	  for(int j=0;j<size;j++){
        		  System.out.print(matrix[i][j]+" ");
        	  }
        	  System.out.println();
          }*/
          
          //printSpiral(matrix,0,0,size,size);
          LinkedList<Integer> list=new LinkedList<Integer>();
         // printReverseSpiral(matrix,2,2,1,size,list);
          //printSpiralRighttoLeft(matrix,0,4,size);
          printdiagonal(matrix,size);
	}

}
