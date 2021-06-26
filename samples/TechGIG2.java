
import java.util.*;

public class TechGIG2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int lenWord=scan.nextInt();
		int lenStr=scan.nextInt();
		int count=0;
		String word=scan.next();
		String str=scan.next();
		System.out.println("word----"+word);
		char[] word1=word.toCharArray();
		//System.out.println("word1----"+word1);
		Arrays.sort(word1);
		String temp="";
		char[] temp1=temp.toCharArray();
		for(int i=0;i<=str.length()-word.length();i++){
			temp=str.substring(i,i+word.length());
			System.out.println("temp----"+temp);
			temp1=temp.toCharArray();
			//System.out.println("temp1----"+temp1);
			Arrays.sort(temp1);
			String newstr=new String(temp1);
			System.out.println("newstr---"+newstr);
			if(Arrays.equals(word1, temp1)){
				count++;
			}
			System.out.println("count----"+count);
		}
		System.out.println(count);
		
	}

}
