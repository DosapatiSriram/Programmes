
import java.io.*;
import java.util.*;
import java.util.Set;
public class UniqueStrings {

	public static int printNoofUniqueStrings(int a,String[] input){
		Set<String> set=new HashSet<String>();
		for(int i=0;i<input.length-1;i++){
			String[] pass1=input[i].split("");
			String pass1_even="";
			String pass1_odd="";
			for(int p=0,q=1;p<pass1.length-1;p=p+2,q=q+2){
				pass1_even += pass1[p];
				pass1_odd +=  pass1[q];
			}
			if(pass1.length %2 !=0){
				pass1_even += pass1[pass1.length-1]; 
			}
			char[] pass1_even_array=pass1_even.toCharArray();
			Arrays.sort(pass1_even_array);
			pass1_even=new String(pass1_even_array);
			char[] pass1_odd_array=pass1_odd.toCharArray();
			Arrays.sort(pass1_odd_array);
			pass1_odd=new String(pass1_odd_array);
			System.out.println(" pass1 even "+pass1_even);
			System.out.println(" pass1 old "+pass1_odd);
			for(int j=i+1;j<input.length;j++){
				if(input[i].length()!=input[j].length()){
					set.add(input[i]);
					set.add(input[j]);
					continue;
				}
				String[] pass2=input[j].split("");
				String pass2_even="";
				String pass2_odd="";
				for(int p=0,q=1;p<pass2.length-1;p=p+2,q=q+2){
					pass2_even += pass2[p];
					pass2_odd +=  pass2[q];
				}
				if(pass2.length %2 !=0){
					pass2_even += pass2[pass2.length-1]; 
				}
				char[] pass2_even_array=pass2_even.toCharArray();
				Arrays.sort(pass2_even_array);
				pass2_even=new String(pass2_even_array);
				char[] pass2_odd_array=pass2_odd.toCharArray();
				Arrays.sort(pass2_odd_array);
				pass2_odd=new String(pass2_odd_array);
				System.out.println(" pass2 even "+pass2_even);
				System.out.println(" pass2 old "+pass2_odd);
				
				if(pass1_even.equals(pass2_even) && pass1_odd.equals(pass2_odd)){
					set.add(pass1_even+pass1_odd);
				}else{
					set.add(pass1_even+pass1_odd);
					set.add(pass2_even+pass2_odd);
				}
			}
		}
		
		
		return set.size();
	}
	
	public static int printAnswer(int size,String[] input){
		Set<String> set=new HashSet<String>();
		for(int i=0;i<input.length;i++){
			String[] pass1=input[i].split("");
			String pass1_even="";
			String pass1_odd="";
			boolean even=true;
			for(int p=0;p<pass1.length;p++){
				if(even){
					pass1_even += pass1[p];
					even = !even;
				}else{
					pass1_odd += pass1[p];
					even = !even;
				}
			}
			
			
			char[] pass1_even_array=pass1_even.toCharArray();
			Arrays.sort(pass1_even_array);
			pass1_even=new String(pass1_even_array);
			char[] pass1_odd_array=pass1_odd.toCharArray();
			Arrays.sort(pass1_odd_array);
			pass1_odd=new String(pass1_odd_array);
			System.out.println(" pass1 even "+pass1_even);
			System.out.println(" pass1 old "+pass1_odd);
			set.add(pass1_even+pass1_odd);
		}
		return set.size();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] strings=br.readLine().split(",");
       //System.out.println( printNoofUniqueStrings(n,strings));
        System.out.println(printAnswer(n,strings));
        
        /*List<String> list=new LinkedList<String>();
        //list.add("def");
        //list.add("abc");
        //list.remove("abc");
        //list.add(0, "abc");
        
        list.add("2");
        list.add("5");
        list.add("9");
        
        list.remove("5");
        list.add(0,"5");
        
        for(String a:list){
        	System.out.println(a);
        }*/
	}

}
