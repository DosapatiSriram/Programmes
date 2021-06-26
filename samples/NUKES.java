

import java.util.Scanner;

class NUKES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     int A=scan.nextInt();
	     int N=scan.nextInt();
	     int K=scan.nextInt();
	     int[] chambers=new int[K];
	     //System.out.println("chambers[0]"+chambers[0]);
	     for(int i=0;i<A;i++){
	    	 chambers[0] += 1;
	        for(int j=0;j<K;j++){
	           
	           if(chambers[j]>N && j!=K-1){
	              chambers[j+1] +=1;
	              chambers[j]=0;
	           }else if(chambers[j]>N && j == K-1){
	              chambers[j]=0;
	           }else{
	               break;
	           }
	        	   
	        }
	     }
	     for(int i=0;i<K;i++){
	    	 System.out.print(chambers[i]+" ");
	     }
		scan.close();
	}

}
