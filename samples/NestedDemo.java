

public class NestedDemo {
	
	class NestedDemo2{
		public String method_name(){
			return "Hi ";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedDemo nesd=new NestedDemo();
		NestedDemo.NestedDemo2 nesd2=nesd.new NestedDemo2();
		System.out.println(nesd2.method_name());

	}

}
