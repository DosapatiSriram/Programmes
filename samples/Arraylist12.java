


import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist12 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp=new Scanner(System.in);
	        int n=Integer.parseInt(inp.next());
	        ArrayList[]<Integer> arrays=new ArrayList[]<Integer>;
	        int[] numbers=new int[5];
	        
	        for(int i=0;i<n;i++)
	        {
	        	int d=inp.nextInt();
	        	arrays[i]=new ArrayList();
	        	for(int j=0;j<d;j++)
	        	{
	        		arrays[i].add(inp.nextInt());
	        	}
	        }
	        int q=Integer.parseInt(inp.next());
	        for(int i=0;i<q;i++)
	            {
	              int x=inp.nextInt();
	              int y=inp.nextInt();
	              try
	              {System.out.println(arrays[x-1].get(y-1));}
	              catch(Exception e)
	              {System.out.println("ERROR!");}
	        }
	        
	        ListNode listnode=new ListNode();
	        while(inp.)
	        {
	           String s=in.nextLine();
	        }
		
		
		
	}

}
