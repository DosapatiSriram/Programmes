

import java.io.Serializable;

public class Employee  implements Serializable,Cloneable{

	
	private static final long serialVersionUID = 2L;
	String name;
	int employeeid;
	int salary;
	transient String emailid;
	int bonus;
	int rating;
	
	Employee(String name,int employeeid,int salary,String emailid,int bonus,int rating){
		this.name=name;
		this.employeeid=employeeid;
		this.salary=salary;
		this.emailid=emailid;
		this.bonus=bonus;
		this.rating=rating;
	}
	
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
