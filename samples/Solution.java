
import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {
    int testcases;
    int count=1;
    public void readTestcase(BufferedReader br) throws IOException{
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        testcases=Integer.parseInt(br.readLine());
        
    }
    public void readInput(BufferedReader br) throws IOException{
    	String str="TITLE";
       //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(testcases-- >0){
            int noOfRows=Integer.parseInt(br.readLine());
            System.out.println("case #"+count++);
            str=str.toLowerCase();
            System.out.println(str);
            for(int i=0;i<noOfRows;i++){
                for(int j=0;j<noOfRows;j++){
                    if(j>=noOfRows-1-i)
                    	System.out.print("* ");
                    else
                    	System.out.print("  ");
                	
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Solution sol=new Solution();
        sol.readTestcase(br);
        sol.readInput(br);
    }
}