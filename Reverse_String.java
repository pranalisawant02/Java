package demo01;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="Hello World";
		StringBuilder stringBuilder = new StringBuilder(originalString);
		String reversedString= stringBuilder.reverse().toString();
		System.out.println("Original String:"+originalString);
		System.out.println("Reversed String:"+reversedString);
		
	}

}
