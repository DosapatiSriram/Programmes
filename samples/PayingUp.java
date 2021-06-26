
import java.util.*;
public class PayingUp {
   
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//ArrayList<String> list=new ArrayList<String>();
		int t=scan.nextInt();
		while(t-->0){
			int sum=0;
			int n=scan.nextInt();
			
			int m=scan.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=scan.nextInt();
			}
			Arrays.sort(arr);
			int r=0;
			for(int i=n-1;i>=0;i--){
				sum=sum+arr[i];
				if(sum>m){
					sum=sum-arr[i];
				    if(i==0){
				    	System.out.println("No");
				    	break;
				    	}
				}
				else if(sum<m){
					if(i==0){
						System.out.println("No");
						break;
					}
					}
				else if(sum==m){
					System.out.println("Yes");
					break;
					}
				
			
			}
		}
            
	}

}
