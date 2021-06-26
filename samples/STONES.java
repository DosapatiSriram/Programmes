

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STONES {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         STONES stones=new STONES();
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 //int testcases=Integer.parseInt(br.readLine());
		 int ans=stones.assignInputs(br);
		 //br.print(ans);
	}
	
	public int assignInputs(BufferedReader br) throws IOException{
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-- < 0){
		 String J=br.readLine();
		 String M=br.readLine();
         
		}
		
		return 0;
	}

}
