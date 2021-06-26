
import java.util.*;
import java.io.*;

public class TWTCLOSE{
 
  

  
  public static void main(String[] args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Set<String> list=new HashSet<String>();
     String[] temp = br.readLine().split(" ");
     int N=Integer.parseInt(temp[0]);
     int K=Integer.parseInt(temp[1]);
     while(K-->0){
//        printans(br.readLine(),list);
          String inp=br.readLine();
        if(inp.equals("CLOSEALL")){
             list=new HashSet<String>();
        }else if(list.contains(inp.split(" ")[1])){
             list.remove(inp.split(" ")[1]);
        }else{
             list.add(inp.split(" ")[1]);
        }
        System.out.println(list.size());
     }
  }
}
