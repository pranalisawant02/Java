
package demo1;
import java.util.Scanner;
public class DoubleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter FIRST number:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Error:its invalid number");
		}
		else {
            double num1=sc.nextDouble();
		System.out.print(" enter SECOND number");
		if(!sc.hasNextDouble())
		{
			System.out.println("Error:its invalid number");
		}
		else
		{
			double num2=sc.nextDouble();
			double average=(num1+num2)/2;
			System.out.println("average is:"+average);
		}
		
		}

	}
}
