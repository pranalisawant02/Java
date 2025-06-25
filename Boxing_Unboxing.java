package demo2;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		//converting primitive to wrapper =Boxing
		Integer b=new Integer(a);
		Integer c=a;//autoboxing
		//converting wrapper to primitive =unboxing
		int d=b.intValue();
		int e=b;//autounbpxing
		
		System.out.println("a:"+a+", b:"+b+", c:"+c+", d:"+d+", e:"+e);
		
	}

}
