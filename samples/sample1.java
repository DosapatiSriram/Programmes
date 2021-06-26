

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sample1 {
	
	public static void main(String[] args){
		
	//Set set=new HashSet();
	String str="abcde0307|09102019063011|dvjvd|Wed Oct 9 06:30:11 2019|ps -eo user,lstart,cmd --sort=-start_time";
	//set.add(str.split("|"));
	System.out.println(str.split("\\|")[0]);
	System.out.println(str.split("\\|")[1]);
	System.out.println(str.split("\\|")[2]);
	System.out.println(str.split("\\|")[3]);
	System.out.println(str.split("\\|")[4]);
		
   }
}
