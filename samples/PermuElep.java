
import java.util.*;

public class PermuElep {
	
	public String logicfunc(int N,int[] numarray){
		int numberofinversions=0;
		int numberoflocalinversions=0;
		Set<Integer> afterremovingduplication= new TreeSet<Integer>();
		for(int i=0;i<numarray.length;i++){
			afterremovingduplication.add(numarray[i]);
			if((i < numarray.length-1) && (numarray[i]> numarray[i+1]) ){
				numberoflocalinversions += 1;
			}
		}
		int num=afterremovingduplication.size();
		while(num>0){
			numberofinversions += num;
			num--;
		}
		System.out.println(numberofinversions+"<--->"+numberoflocalinversions);
		if(numberofinversions == numberoflocalinversions)
			return "YES";
		else
			return "NO";
		
		
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		PermuElep pe=new PermuElep();
        while(t-- > 0){
        	int N=scan.nextInt();
        	int[] numarray=new int[N];
        	for(int i=0;i<N;i++){
    			numarray[i]=scan.nextInt();
    		}
        	System.out.println(pe.logicfunc(N,numarray));
        }	

	}

}
