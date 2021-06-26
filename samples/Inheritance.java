

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Inheritance {
	static{System.out.println("Static Initializer block in super class");}
	{System.out.println("initializer" );}
	//String name="abc";
	int id=10;
 protected  String add(int a, int b) throws Exception{
	 System.out.println("In super class");
	 return a+b+"";
 }
 Inheritance(){
	 System.out.println("Constructor in parent class");
 }
	
	private  int emp;
	private static String name;
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
 
 /* public static void main(String[] args){
	  Inheritance obj=new Inheritance();
	  Map<Inheritance,Integer> map=new HashMap<Inheritance,Integer>();
	  map.put(obj,obj.id);
	  System.out.println(map.get(obj));
  }*/
	
	
	
	
}




