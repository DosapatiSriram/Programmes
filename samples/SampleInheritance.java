

class SuperClass{
	static{System.out.println("Static in super class");}
	{System.out.println("IIB");}
	public void get(){
		System.out.println("in super class");
		return;
	}
}

class Subclass2 extends SuperClass{
	static{System.out.println("Static In subclass 2");}
	{System.out.println("IIB In subclass 2");}
}
public class SampleInheritance extends Subclass2{
	{System.out.println("IIB sub");}
	static{System.out.println("Static in sub class");}
	public  void get(){
		System.out.println("in sub class");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleInheritance spr=new SampleInheritance();
		
		/*new SuperClass(){
                System.out.println("chs");
		};*/
		
		
		
		
	}

}
