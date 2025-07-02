package demo05;
import java.util.Scanner;

public class CreditLimitcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter account number:");
		int acc_num=sc.nextInt();
		
		System.out.print("Enter balance at the beginning of the month: ");
		int balance=sc.nextInt();
		
		System.out.print("Enter total of all items charged by the customer this month ");
		int TotalItemsCharged=sc.nextInt();
		
		System.out.print("Enter total of all credits applied to the customer’s account this month: ");
		int TotalCredits=sc.nextInt();
		
		System.out.print("Enter allowed credit limit:");
		int creditLimit=sc.nextInt();
		
		//calculations
		
			int new_balance=balance+TotalItemsCharged-TotalCredits;
			if(new_balance>creditLimit)
			{
				System.out.println("New balance:"+new_balance+", Credit Limit:"+creditLimit);
				System.out.println("Credit Limit exceeded!");
			}
			
		
		
	}

}
