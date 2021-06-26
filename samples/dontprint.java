

import java.util.ArrayList;
import java.util.Scanner;

public class dontprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(scan.hasNextInt())
        list.add(scan.nextInt());
        for(Integer i:list){
          if(i!=42)
             System.out.println(i);
           else
             break;
        }
	}

}
