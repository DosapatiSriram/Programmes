

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAssis {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String res1="";
        for(int i=0;i<t;i++){
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);     
            int m=Integer.parseInt(s[1]);            
            String completed=br.readLine();            
            String s1="";
            for(int j=1;j<=n;j++){
            	if(!(completed.contains(String.valueOf(j)))){
            		s1 += j+" ";	
            	} 
            }
           
            String[] s2=s1.trim().split(" ");
            String chef="",ass="";
            for(int j=0;j<s2.length;j++){
            	if(j%2==0)
            		chef += s2[j]+" ";
            	else
            		ass += s2[j]+" ";
            }
            if(chef.equals(""))
            	chef=" ";
            if(ass.equals(""))
            	ass=" ";
              
            res1 += chef+","+ass+",";
          }
              String[] res=res1.split(",");
              for(String i:res){
            	  System.out.println(i);
              }
              
            
       	}
}
