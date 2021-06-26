

import java.io.FileNotFoundException;
import java.io.*;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.stream.IntStream;

import org.apache.poi.util.SystemOutLogger;

public class Inheritance2 extends Inheritance {
	   	 public String add(int a,int b) throws IOException {
	   		System.out.println("In sub class");
	   		return a+b+"";
	   	}
	   	
	   /*	Inheritance2(){
	   		super();
	   		System.out.println("Constructor in sub class ");
	   	}*/
	   	public static void main(String[] args) throws Exception{
	   		Inheritance obj=new Inheritance();
	   		obj.setEmp(1);
	   		Inheritance obj2=new Inheritance2();
	   		
	   		System.out.println(obj2.add(2,3));
	   		Inheritance sub=new Inheritance2();
	   		Inheritance2 obj3=(Inheritance2)sub;
	   		//System.out.println(obj3.add(2,3));
	   		
	   		
	   		int[] numbers={2,4,3,8,10,4};
	   		
	   		int[] num_=IntStream.of(numbers).filter(n -> n==4).toArray();
	   		
	   		int numb_=IntStream.of(numbers).reduce((n,r) -> r+=n).getAsInt();
	   		List<Integer> _number=Arrays.asList(1,2,3,4,5,4,4);
	   		_number.stream().filter(n -> n>3).peek(System.out::println).count();
	   		_number.stream().filter((n) -> {
               System.out.println("filter -->"+n);
			return true;}).findFirst();
	   		
	   		Map<String,String> map=new HashMap<String,String>();
	   		map.put("hchduvsd", "uhvhdv");
	   		map.put("shchsc", "ashfuouwef");
	   		
	   		//System.out.println(map.get("udshhd"));
	   		//map.getKeys().stream().computeIfPresent(k -> )
	   		
	   		//map.entrySet().stream()
	   		map.entrySet().stream()
	                .filter(i -> "aws.amazon.com".equals(i.getValue()))
	                .map(i -> i.getValue())
	                .collect(Collectors.joining());
	   		
	   		_number.forEach(i -> System.out.println(i));
	   		
	   		List<String> list=new LinkedList<String>();
	   		list.add("1");
	   		list.add("2");
	   		list.add("3");
	   		
	   		list.stream().filter(x -> list.indexOf(x)>2).map(x -> x+1).collect(Collectors.toList());
	   		
	   		try{
	   			throw new FileNotFoundException();
	   		}catch(FileNotFoundException e){
	   		    System.out.println("filenotfoundexception");	
	   		}catch(IOException e){
	   			System.out.println("ioexception");
	   		}
	   		
	   		
	   		//System.out.println(num_[0]+"   "+num_[1]);
	   		
	   		//System.out.println(numb_);
	   		
	   		int[] A={1,2,3,4,5};
	   		
	   		
	   		//List<Integer> list=IntStream.of(A).boxed().collect(Collectors.toList());
	   		int a_=34;
	   		int b=4;
	   		String str__=a_+","+b;
	   		System.out.println("str  -->"+str__);
	   		BigInteger number=new BigInteger("45636364578979");
	   		BigInteger[] arr=new BigInteger[2];
	   		BigInteger two=BigInteger.ONE.add(BigInteger.ONE);
	   		arr=number.divideAndRemainder(two);

	   		ArrayList<Integer> list_=new ArrayList<Integer>(2);
	   		
	   		String str="";
	   		//((number & 1) == 0 ?  odd0s++:odd1s++ ) ;
	   		//System.out.println(arr[0]+" "+arr[1]);
	   		/*
	   		Integer a=new Integer(5);
	   		int i=5;
	   		String s1=new String("abc");
	   		String s2= "abc";
	   		if(s1.equals(s2)){
	   			System.out.println("true");
	   		}*/
	   		
	   		List<String> lst=new ArrayList<String>();
	   		lst.add("qeqwr");
	   		lst.add("sgcsc");
	   		lst.add("shchs");
	   		
	   		for(String a:lst){
	   			//System.out.println(a);
	   		}
	   		
	   		/*Iterator itr=lst.iterator();
	   		while(itr.hasNext()){
	   			if(itr.next().equals("sgcscdf")){
	   				
	   				lst.add("wuwqoii");
	   			}
	   			System.out.println(itr.next());
	   		}*/
	   		
	   		String s1="abc";
	   	    String s2=new String();
	   	    String s3 = new String("abc");
	   	    System.out.println(s1.concat(s2));
	   	    System.out.println(s1);
	   	    String s4 = s3;
	   	    System.out.println("s1: "+System.identityHashCode(s1));
	   	    System.out.println("s2: "+System.identityHashCode(s2));
	   	    System.out.println("s3: "+System.identityHashCode(s3));
	   	    System.out.println("s4: "+System.identityHashCode(s4));
	   	    System.out.println("A"+20+1.4f);
	   	    
	   	    int[] number_=new int[3];
	   	    
	   	    int a=number_[2];
		   	 if(number_[2]==0){
		   		 System.out.println(a);
		   	 }
	   	    
	   	    System.out.println("here !! "+number_[2]);
	   	    
	   	    Singleton singleton=Singleton.getInstance();
	   	    Singleton singleton2=Singleton.getInstance();
	   	    System.out.println(singleton.hashCode()+" "+singleton.getName());
	    	System.out.println(singleton2.hashCode()+" "+singleton.getName());
	   	   
	    	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("Singleton.ser")));
	   	    oos.writeObject(singleton);
	   	    
	   	    ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("singleton.ser")));
	   	    Singleton singleton3=(Singleton)ois.readObject();
	   	    
	   	    System.out.println(singleton3.hashCode()+" "+singleton3.getName());
	   	}
	}

	

