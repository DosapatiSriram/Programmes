

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			String[] strArr=new String[2];
			strArr=str.split(", ");
			char[] temp=new char[255];
			char[] temp1=new char[255];
			
			  temp=strArr[0].replace(" ", "").toLowerCase().toCharArray();
			  Arrays.sort(temp);
			  temp1=strArr[1].replace(" ", "").toLowerCase().toCharArray();
			  Arrays.sort(temp1);
			  if(Arrays.equals(temp, temp1)){
				  System.out.println("Valid Pattern");
			  }else
				  System.out.println("InValid Pattern");
			
			
		}

	}

}
