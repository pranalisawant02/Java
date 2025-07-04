package demo02;

class A{
	public void showRecord()
	{
		System.out.println("A.showRecord()");
	}
	public void printRecord()
	{
		System.out.println("A.printRecord()");
	}
}
	
class B extends A{
	public void printRecord()
	{	//super.printRecord(); //using super keyword
		System.out.println("B.printRecord()");
	}
	public void displayRecord()
	{
		System.out.println("B.displayRecord()");
	}
}

public class Program {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref = new B( );//upcasting
		System.out.println("-----upcasting-----");
		ref.showRecord();
		ref.printRecord();
		//ref.displayRecord();//compile Error
		B b=(B)ref;//Downcasting
		System.out.println("-----downcasting-----");
		b.printRecord();
		b.displayRecord();
		
	}
	*/
	/*public static void main(String[] args) {
		A ref=new A();
		ref.showRecord();
		ref.printRecord();
	
	}*/
	
	public static void main(String[] args)
	{
		B b=new B();
		b.printRecord();
		b.displayRecord();
		b.showRecord();
	}
}
