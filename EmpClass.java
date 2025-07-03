package demo01;
import java.util.Scanner;

public class Employee extends Person{
	private int ID;
	private String dept;
	private double salary;
	private MyDate dateOfJoining; //Association
	
	
	Employee(){
		//parameterless ctor
	}
	//parametrized ctor
	Employee(int Id,String dept,double salary,MyDate dateOfJoining){
		this.ID=ID;
		this.dept=dept;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
	}
	
	//getter & setter functions
	public int getID(){
		return ID;
	}
	public void setID(int ID){
		this.ID=ID;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	//overriding toString method()
	@Override
	public String toString()
	{
		return "ID:"+this.ID+", Dept:"+this.dept+", Salary:"+this.salary+", Date of joining:"+this.dateOfJoining;
	}
	
}
