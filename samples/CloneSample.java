

public class CloneSample{
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employee emp=new Employee("jchddvd",242355,3235235,"asuiciasc@gmail.com",200,4);
		Employee emp2=(Employee)emp.clone();
		
		System.out.println(emp2.getEmailid());
	}
}
