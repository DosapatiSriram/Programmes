

import java.util.Scanner;

public class TechGig3 {
     
	static public void collAllExist(int a,int b){
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] arr=new int[n*n][n*n];
		
		for(int i=0;i<n*n;i++){
			for(int j=0;j<n*n;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		int tempRow=0;int tempCol=0;
		for(int i=0;i<n*n;i++){
			for(int j=0;j<n*n;j++){
				if(arr[i][j]==0){
				     collAllExist(i-1,j);	
				}
			}
		}
		
       scan.close();
	}

}
