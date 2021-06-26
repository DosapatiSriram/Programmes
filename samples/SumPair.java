

import java.util.*;


public class SumPair {

	public static int numberofpairs(List<Integer> a,int k){
		int count=0,count_half=0;
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i< a.size();i++){
			if(2*a.get(i)==k && set.contains(a.get(i)) && count_half==0){
				count_half++;
			}else if(set.contains(k-a.get(i)) && !set.contains(a.get(i))){
				count++;
			} 
			set.add(a.get(i));
		}
		return count+count_half;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<Integer> list=new ArrayList<Integer>();
           list.add(1);
           
           list.add(1);
           list.add(2);
           list.add(3);
          // list.add(1);
           list.add(5);
           //list.add(5);
           //list.add(5);
           list.add(8);
           list.add(7);
           list.add(9);
           list.add(9);
           list.add(9);
           int k=10;
           
           System.out.println(numberofpairs(list,k));
	}

}
