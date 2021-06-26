

import java.io.*;
import java.util.*;

public class SumofSubArrays {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			String[] n_k=br.readLine().split(" ");
			int n=Integer.parseInt(n_k[0]);
			int k=Integer.parseInt(n_k[1]);
			String[] arr=br.readLine().split(" ");
			//printwithlist(arr,n,k);
			print(arr,n,k);
		}

	}
	
	static void print(String[] arr,int n,int k){
	    long starttime=System.nanoTime();   
		int count=0;
		int subarray_count=0;
		boolean exists=false;
		for(int i=0;i<n;i++){
	    	if(Integer.parseInt(arr[i])<k){
	    		subarray_count++;
	    	}else if(Integer.parseInt(arr[i])==k){
	    		exists=true;
	    		subarray_count++;
	    	}else{
	    		if(exists){
	    			count += subarray_count;
	    		}
	    		subarray_count=0;
    			exists=false;
	    	}
	    }
		if(exists){
			count += subarray_count;
		}
		System.out.println(count);
		long endtime=System.nanoTime();
		System.out.println(endtime-starttime);
	}
	
	public static void printwithlist(String[] arr,int n,int k){
		int count=0;
		long starttime=System.nanoTime();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(Integer.parseInt(arr[i])<=k){
				list.add(Integer.parseInt(arr[i]));
			}else{
				if(list.contains(k)){
					count += list.size();
				}
				list=new ArrayList<Integer>();
			}
		}
		if(list.contains(k) && list.size() !=0){
			count += list.size();
		}
		System.out.println(count);
		long endtime=System.nanoTime();
		System.out.println(endtime-starttime);
	}

}
