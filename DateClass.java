//Assignment 02 Que 1

package demo01;
import java.util.Calendar;
import java.util.Scanner;
class Date{
	//feilds
	private int day;
	private int month;
	private int year;
	//parameterless ctor
	public Date()
	{
		//this(01,01,2000);//contructor chaining
//		Calendar c= Calendar.getInstance();
//		day=c.get(Calendar.DATE);
//		month=c.get(Calendar.MONTH)+1;
//		year=c.get(Calendar.YEAR);
		
	}
	//parameterized ctor
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//getter fun & setter function
	//get day
	public int getDay()
	{
		return day;
	}
	//set day
	public int setDay(int day)
	{
		return this.day=day;
	}
	//get month
	public int getMonth()
	{
		return month=month;
	}
	//set month
	public int setMonth(int month)
	{
		return this.month=month;
	}
	//get year
	public int getYear()
	{
		return year;
	}
	//set year
	public int setYear(int year)
	{
		return this.year=year;
	}
	//display date
	void displayDate()
	{
		System.out.println( +day+ "/" + month+ "/" +year);
	}
	
}
//Tester class
class TestDate{
	
	Date d1=new Date();
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day:");
		d1.setDay(sc.nextInt());
		System.out.print("Enter month:");
		d1.setMonth(sc.nextInt());
		System.out.print("Enter year");
		d1.setYear(sc.nextInt());
		
	}
	public void updateRecord()
	{
		d1.setDay(30);
		d1.setMonth(6);
		d1.setYear(2025);
		
	}
	public void printRecord()
	{
		System.out.println("Day:"+d1.getDay());
		System.out.println("Month:"+d1.getMonth());
		System.out.println("Year:"+d1.getYear());
		d1.displayDate();
	}
}
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDate TD=new TestDate();
		//TD.printRecord();
		TD.acceptRecord();
		System.out.println("Original date:");
		TD.printRecord();
		TD.updateRecord();
		System.out.println("Updated date:");
		TD.printRecord();

	}

}
