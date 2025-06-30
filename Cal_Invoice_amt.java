package demo01;
import java.util.Scanner;

class Invoice{
	//feilds
	String part_num;
	String part_des;
	int quantity;
	double price;//price per item
	//parameterless ctor
	Invoice()
	{
		//ToDo
	}
	//parameterized ctor
	Invoice(String part_num,String part_des,int quantity,double price)
	{
		this.part_num=part_num;
		this.part_des=part_des;
		setQuantity(quantity);  // Will turn -ve values  into 0
		setPrice(price);        
	}

//getter fun
//get part number
public String getPartNum()
{
	return part_num;
}
//set part number
public void setPartNum(String part_num)
{
	this.part_num=part_num;
}
//get part description
public String getPartDes()
{
	return part_des;
}
//set part description
public void setPartdes(String part_des)
{
	this.part_des=part_des;
}
//get quantity
public int getQuantity()
{
	return quantity;
}
//set quantity
public void setQuantity(int quantity)
{
	if (quantity > 0) {
	    this.quantity = quantity;
	} else {
	    this.quantity = 0;
	}
}
//get price
public double getPrice()
{
	return price;
}
//set price
public void setPrice(double price)
{
	if(price>0.0) {
		this.price=price;
	}
	else
	{
		this.price=0.0;
	}
	
}
//calculate invoice amount
public double getInvoiceAmount() {
    return quantity * price;
}
}

//Test class
class TestInvoice{
	Invoice invoice =new Invoice();
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Part Number:");
		invoice.setPartNum(sc.nextLine());
		System.out.print("Enter Part Description:");
		invoice.setPartNum(sc.nextLine());
		System.out.print("Enter Quantity:");
		invoice.setQuantity(sc.nextInt());
		System.out.print("Enter Price:");
		invoice.setPrice(sc.nextDouble());
	}
	
	public void printRecord()
	{
		System.out.println("Part Number: " + invoice.getPartNum());
	    System.out.println("Part Description: " + invoice.getPartDes());
	    System.out.println("Quantity: " + invoice.getQuantity());
	    System.out.println("Price per Item: ₹" + invoice.getPrice());
	    System.out.println("Total Invoice Amount: ₹" + invoice.getInvoiceAmount());
	    System.out.println("------------------------------------------------");
	}
}
public class Program02 {

public static void main(String[] args) {
   // Create test invoice objects
	TestInvoice TI=new TestInvoice();
	TI.acceptRecord();
	TI.printRecord();
}
}
