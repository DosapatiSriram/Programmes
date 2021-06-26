
import java.io.*;

public class ProperWords {

	
	static long properWords(long N){
		
		return Math.round(Math.pow(26,N))-Math.round(Math.pow(5,N))-Math.round(Math.pow(21,N));
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			long N=Long.parseLong(br.readLine());
			long out_=properWords(N);
			System.out.println(out_);
			
		}
		

	}

}
