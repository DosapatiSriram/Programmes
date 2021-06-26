

import java.util.Arrays;
import java.util.Scanner;

class Lapindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- > 0){
		String complete=scan.next();
		String fsthalf=complete.substring(0, complete.length()/2);
		String scndhalf="";
		if(complete.length()%2==0){
			scndhalf=complete.substring(complete.length()/2,complete.length());
		}else{
			scndhalf=complete.substring(complete.length()/2+1,complete.length());
		}
		int[] fsthalfcharArray=new int[255];
		int[] scndhalfcharArray=new int[255];
		for(int i=0;i<fsthalf.length();i++){
			fsthalfcharArray[(int)fsthalf.charAt(i)]+=1;
		}
		for(int i=0;i<scndhalf.length();i++){
			scndhalfcharArray[(int)scndhalf.charAt(i)]+=1;
		}
		if(Arrays.equals(fsthalfcharArray,scndhalfcharArray)){
			System.out.println("YES");
		}else
			System.out.println("NO");
		}
		
      scan.close();
	}

}
