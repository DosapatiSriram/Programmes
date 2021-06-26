

import java.util.ArrayList;
import java.util.Scanner;

public class Lowercaseconver {
   
	public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		    String str=scan.nextLine();
		    String[] arrstr=str.split(",");
		   
			for(String i : arrstr){
				System.out.println(i.toLowerCase().replaceAll(" ", ""));
				
			}
			scan.close();
	}
}
