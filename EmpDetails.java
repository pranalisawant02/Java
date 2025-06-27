package demo1;
import java.util.Scanner;
class Employee{
	
	//data feilds
	String name;
	int age;
	double salary;
	
	Employee()
	{
		//parameterless ctor
	}
	
	Employee(String name,int age,double salary)
	{
		//parameterized ctor
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	//getter fun
	public String getName()
	{
		return name;
	}
	//setter fun
	public String setName(String name)
	{
		return this.name=name;
	}
	//get age
	public int getAge()
	{
		return age;
	}
	//set age
	public int setAge(int age)
	{
		return this.age=age;
	}
	//get salary
	public double getSalary()
	{
		return salary;
	}
	//set salary
	public double setSalary(double salary)
	{
		return this.salary=salary;
	}
}
//Tester class
class TestEmployee{
	Employee emp=new Employee();//instantiation
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		emp.setName(sc.nextLine());
		System.out.print("Enter age:");
		emp.setAge(sc.nextInt());
		System.out.print("Enter salary:");
		emp.setSalary(sc.nextDouble());
	}
	public void printRecord()
	{
		System.out.println("Name:"+emp.getName());
		System.out.println("Age:"+emp.getAge());
		System.out.println("Salary:"+emp.getSalary());
	}
}
	
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee temp=new TestEmployee();
		temp.acceptRecord();
		temp.printRecord();
		
	}

}
