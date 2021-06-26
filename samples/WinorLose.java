

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class WinorLose {
    public static void main(String args[] ) throws IOException {

    	//Write code here
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int testcases=Integer.parseInt(br.readLine());
    while(testcases-->0){
        boolean flag=true;
        int N=Integer.parseInt(br.readLine());
        String[] villains=br.readLine().split(" ");
        String[] players=br.readLine().split(" ");
        for(int i=0;i<players.length;i++){
         for(int j=0;j<villains.length;j++){
          if(Integer.parseInt(villains[j])<Integer.parseInt(players[i])){
              flag=true;
              continue;
          }else{
              flag=false;
              break;
          }
         }
        }
        if(flag){
            System.out.println("WIN");
        }else{
            System.out.println("LOSE");
        }

    }

    

   }
}
