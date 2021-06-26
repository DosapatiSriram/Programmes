
import java.io.*;
import java.util.*;

public class MinCostMatrix {
static int[][] range_1;
static Map<String,Integer> map=new HashMap<String,Integer>();
static Map<String,Integer> map_path=new HashMap<String,Integer>();

	
	public static int getMinCost(int[][] arr,int[][] ran,int m,int n){
		
		if(m==0 && n >=0){
			return ran[m][n];
		}else if(m>=0 && n==0){
			return ran[m][n];
		}
		
		ran[m][n]=arr[m][n]+Math.min(Math.min(getMinCost(arr,ran,m,n-1),getMinCost(arr,ran,m-1,n)),getMinCost(arr,ran,m-1,n-1));
		return ran[m][n];
		
	}
	
	public  Integer getMinCostOptimised(int[][] arr,int[][] ran,int a,int b){
		
		if(map.containsKey(a+","+b) ){
			return map.get(a+","+b);
		}
		
		if(getMinCostOptimised(arr,ran,a-1,b) <= getMinCostOptimised(arr,ran,a,b-1)){
		       if(getMinCostOptimised(arr,ran,a-1,b) <= getMinCostOptimised(arr,ran,a-1,b-1)){
		    	   map.put(a+","+b, getMinCostOptimised(arr,ran,a-1,b)+arr[a][b]);
		       }else{
		    	   map.put(a+","+b, getMinCostOptimised(arr,ran,a-1,b-1)+arr[a][b]);
		       }	
		}else{
			   if(getMinCostOptimised(arr,ran,a,b-1) <= getMinCostOptimised(arr,ran,a-1,b-1)){
		    	   map.put(a+","+b, getMinCostOptimised(arr,ran,a,b-1)+arr[a][b]);
		       }else{
		    	   map.put(a+","+b, getMinCostOptimised(arr,ran,a-1,b-1)+arr[a][b]);
		       }
		}
		
		//map.put(a+","+b, arr[a][b]+Math.min(Math.min(getMinCostOptimised(arr,ran,a,b-1),getMinCostOptimised(arr,ran,a-1,b)),getMinCostOptimised(arr,ran,a-1,b-1)));
		
		return map.get(a+","+b);
	}
	
	public int getNopaths(int a,int b){
		
		if(map_path.containsKey(a+","+b)){
			return map_path.get(a+","+b);
		}
		
		int top=map.get((a-1)+","+(b));
		int left=map.get((a)+","+(b-1));
		int dig=map.get((a-1)+","+(b-1));
		
		if(top== left && top==dig){
			//map_path.put(a+","+b, map_path.get((a-1)+","+(b))+map_path.get((a)+","+(b-1))+map_path.get((a-1)+","+(b-1)));
			map_path.put(a+","+b, getNopaths(a-1,b)+getNopaths(a,b-1)+getNopaths(a-1,b-1));
		}else if(top== left && dig > top){
			//map_path.put(a+","+b, map_path.get((a-1)+","+(b))+map_path.get((a)+","+(b-1)));
			map_path.put(a+","+b, getNopaths(a-1,b)+getNopaths(a,b-1));
		}else if(top== dig && left > top){
			//map_path.put(a+","+b, map_path.get((a-1)+","+(b))+map_path.get((a-1)+","+(b-1)));
			map_path.put(a+","+b, getNopaths(a-1,b)+getNopaths(a-1,b-1));
		}else if(left==dig && top > left){
			//map_path.put(a+","+b, map_path.get((a)+","+(b-1))+map_path.get((a-1)+","+(b-1)));
			map_path.put(a+","+b, getNopaths(a,b-1)+getNopaths(a-1,b-1));			
		}else{
			map_path.put(a+","+b, 1);
		}
		
		
		return map_path.get(a+","+b);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] m_n=br.readLine().split(" ");
		int m=Integer.parseInt(m_n[0]);
		int n=Integer.parseInt(m_n[1]);
        int[][] matrix=new int[m][n];
        int[][] range=new int[m][n];
        //range_1=range;
        //System.out.println(range_1.length);
        for(int i=0;i<m;i++){
        	String[] eachrow=br.readLine().split(" ");
        	for(int j=0;j<n;j++){
        		matrix[i][j]= Integer.parseInt(eachrow[j]);
        	}
        }
        int sum=0;
        for(int i=0;i<n;i++){
        	 sum+=matrix[0][i];
        	 range[0][i]=sum;
        	 map.put("0,"+i,sum);
        	 map_path.put("0,"+i, 1);
        }
        sum=0;
        for(int i=1;i<m;i++){
	       	 sum+=matrix[i][0];
	       	 range[i][0]=sum;
	       	 map.put(i+",0", sum);
	       	map_path.put(i+",0", 1);
        }
        
        //System.out.println(getMinCost(matrix,range,m-1,n-1));
        
        MinCostMatrix obj=new MinCostMatrix();
        System.out.println(obj.getMinCostOptimised(matrix,range,m-1,n-1));
        System.out.println(obj.getNopaths(m-1, n-1));
        
	}

}
