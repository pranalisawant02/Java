package demo01;

public class Person {
	private String name;
	private MyDate dateOfBirth; //association
	
	Person()
	{
		//parameterless ctor
	}
	//parametrized constructor
	Person(String name,MyDate dateOfBirth)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	//getters and setters
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString()
	{
		return "Name:"+this.name+", DOB:"+this.dateOfBirth;
	}
}
