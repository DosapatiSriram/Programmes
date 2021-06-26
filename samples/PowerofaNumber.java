

public class PowerofaNumber {

	public static long power(int a,int n){
		if(n==0){
			return 1;
		}
		long temp=power(a,n/2);
		if(n%2==0){
			return temp*temp;
		}else{
			return a*temp*temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;int n=0;
		System.out.println(power(a,n));
	}

}
