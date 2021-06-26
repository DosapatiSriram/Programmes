

import java.util.Scanner;

public class Sum1ndlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner inp=new Scanner(System.in);
        int T=inp.nextInt();
        int[] N=new int[T];
        for(int i=0;i<T;i++)
        {
        	 N[i]=inp.nextInt();
        }
        for(int i=0;i<T;i++)
        { 	
	        
	        int lastdigit=N[i]%10;
	        while(N[i] >=10)
	        {
	        	N[i]=N[i]/10;
	        }
	        int firstdigit=N[i];
	        int sum=firstdigit+lastdigit;
			System.out.println(sum);
        }
	}

}
