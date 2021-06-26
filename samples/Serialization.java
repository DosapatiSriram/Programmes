

import java.io.*;

public class Serialization{
	
    
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
      
		
		Employee emp=new Employee("abc",1148765,25000,"skjdjasf@gmail.com",2000,4);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
		oos.writeObject(emp);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("employee.txt")));
		Employee emp1=(Employee) ois.readObject();
		System.out.println(emp1.getBonus());
		System.out.println(emp1.getEmailid());
		
		oos.close();
		ois.close();
		
		System.out.println(emp.hashCode());
		System.out.print(emp1.hashCode());
	}

}
