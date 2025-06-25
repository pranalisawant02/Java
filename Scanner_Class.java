package demo2;
import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		String name=sc.nextLine();
		System.out.println("Name:"+ name +" Age:"+age);
		System.out.printf("Name:%s Age:%s\n",name,age);
		
	}

}

