
import java.util.*;

public class GOODSET {

	public static void morethan2(int n){
		 int[] numbers=new int[n];
		 int sum=0;
		 for(int i=0;i<500;i++){
			 sum+=i;
			 
		 }
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0){
          int n=scan.nextInt();
         
          if(n==1 ){
        	  System.out.println((int)Math.round((Math.random()*100))%10);
          }else if(n==2){
        	  System.out.println((int)Math.round((Math.random()*100))%10+" "+(int)Math.round((Math.random()*100))%10);
          }else{
        	  morethan2(n);
          }
          
        }
		scan.close();
	}

}
