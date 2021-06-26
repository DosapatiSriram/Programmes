

import java.util.*;

public class SmartestoneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] input={"A>B","B>C","C>D","A>C","A>D","B>D","C>D","A>D","B>C","A>D","B>C"};
		//String[] input={"D>C","C>B","B>A","C>A","D>A","D>B","B>A","C>A","D>A"};
		//String[] input={"C>A","A>D","D>B","C>D","A>B","C>B","D>B","C>A","C>D"};
		String[] input={"C>A","C>E","C>D","C>B","A>E","A>D","A>B","E>D","E>B","D>B","C>D","C>A","C>D","A>D","A>B"};
		//String[] input={"A>B","A>B","A>B","A>B","A>B","B>A"};
		//C A E D B
		Set<String> set=new HashSet<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		//Arrays.sort(input);
		
		String firstperson;
		String lastperson = null;
		for (String string : input) {
			if(!set.contains(string)){
				set.add(string);
				firstperson=string.split(">")[0];
				String secondperson=string.split(">")[1];
				if(!(map.get(firstperson) == null))
				  map.put(firstperson,map.get(firstperson)+1);
				else
				  map.put(firstperson,1);
				
				if(!map.containsKey(secondperson)){
					lastperson=secondperson;
				}
			}
		}
		//System.out.println(set);
		String[] list=new String[map.size()];
		
		for(String str:map.keySet()){
			list[map.size()-map.get(str)]=str;
		}
		
		for(String person:list){
			System.out.println(person);
		}
		  System.out.println(lastperson);
	}

}
