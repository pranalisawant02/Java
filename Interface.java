package demo02;

interface Printable{
	//feilds= public,static,final 
	int number=10;
	//methods= public,abstract
	void print();//only declarations in interface
}
class Test implements Printable{
	@Override
	public void print()
	{
		System.out.println("Number:"+Printable.number);
	}
}
public class Program4 {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.print();
		//polymorphic declaration(upcasting)
		Printable p=new Test();
		p.print();
	}
}
