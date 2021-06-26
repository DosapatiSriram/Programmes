

public class Overload {

	public  void method(int a){
		System.out.println("Int");
	}
	
	public  char method(int a,int b){
		System.out.println("Int 2");
		return 'c';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //method(10);
		Overload obj=new Overload();
		System.out.println("In main");
		obj.method(10,12);
		
		
	}

}
