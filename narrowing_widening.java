package demo2;

public class Program3 {
	//=====widening=====//
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       byte b=11;
       short s=b;//widening
       System.out.println("b:"+b+", a:"+s);
       */
       //=====narrowing=====//
   	public static void main(String[] args) {
   		// TODO Auto-generated method stub
          short b=11;
          byte s=(byte)b;//narrowing
          System.out.println("b:"+b+", a:"+s);
          
	}

}
