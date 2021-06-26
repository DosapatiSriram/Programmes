

import java.util.*;

class ERROR{
 public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int testCases=scan.nextInt();
    while(testCases-- >0){
      String str=scan.nextLine();
      char[] charArrays=new char[1000];
      charArrays=str.toCharArray();
      System.out.println(charArrays);
     aa: for(int i=0;i<charArrays.length-2;i++){
        if((charArrays[i]=='0'&&charArrays[i+1]=='1'&&charArrays[i+2]=='0') || (charArrays[i]=='1'&&charArrays[i+1]=='0'&&charArrays[i+2]=='1')){
          System.out.println("Good");
          break aa;
        }
         //System.out.println("Bad");
      }
      System.out.println("Bad");
    
    }
 
 }
}   
