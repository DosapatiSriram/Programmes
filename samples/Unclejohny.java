
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Unclejohny {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
         ArrayList<Integer> list=new ArrayList<Integer>();
         while(t>0){
        	 
             int n=Integer.parseInt(br.readLine());
             String[] arr=br.readLine().split(" ");
             int m=Integer.parseInt(br.readLine());
             int x=Integer.parseInt(arr[m-1]);
             
             Arrays.sort(arr);
             for(int i=0;i<arr.length;i++){
                 if(Integer.parseInt(arr[i])==x){
                	 
                	 list.add(i+1);
                     break;
                 }
             }
             t--;
	    }
        for(int i:list){
        	System.out.println(i);
        }

    }
}
