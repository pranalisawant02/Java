package demo02;
import java.util.Scanner;

class Shape{
	protected float area;
	public void acceptRecord() {
		//TODO
	}
	public void calArea()
	{
		//TODO
	}
	public void printRecord()
	{
		System.out.println("Area: "+area);
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	@Override
	public void acceptRecord()
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter length:");
		length=sc.nextFloat();
		System.out.print("Enter breadth:");
		breadth=sc.nextFloat();
		
	}
	@Override
	public void calArea()
	{
		area=length*breadth;
	}
	
}

class Circle extends Shape{
	private float radius;
	@Override
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextFloat();
	}
	@Override
	public void calArea()
	{
		area=(float)(Math.PI*radius*radius);
	}
	
}
public class Program2 {
	public static int menuList()
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		int choice;
		while ((choice=menuList())!=0) {
			Shape shape=null;
			switch(choice)
			{
			case 1:
				shape=new Rectangle();//upcasting
				break;

			case 2:
				shape=new Circle();//upcasting
				break;
				
			default:
				System.err.println("Invalid choice!");
				break;
		}
			if(shape!=null)
			{
				shape.acceptRecord();
				shape.calArea();
				shape.printRecord();//dynamic method dispatch ----calling subclass method on superclass ref----
			}

	}

}
}
