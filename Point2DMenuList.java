package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;
public class TestPointArray1 {
	
	public static int menuList(Scanner sc) {
		System.out.println("Menu/");
		System.out.println("1.Display detils of specific points");
		System.out.println("2.Display X and Y coordinated of all points");
		System.out.println("3.Check is Equal or not");
		System.out.println("4.Exit");
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of points you want to plot : ");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		int counter = 0;
		System.out.println("Enter the points:");
		for(int i=0; i<points.length; i++) {
			System.out.println("Enter x and y for point "+i+" -> ");
			points[counter++] = new Point2D(sc.nextDouble(),sc.nextDouble());
		}
		int choice;
		
		while((choice = menuList(sc)) != 4) {
			switch(choice) {
			
			case 1 : System.out.println("Input the index : ");
					 int index = sc.nextInt();
					 if(index >= 0 && index < points.length) {
						 System.out.println("point at index "+index + " -> "+points[index].getDetails());
					 }else {
						 System.out.println("Invalid index, pls retryyy!");
					 }
					 break;
					 
			case 2 : System.out.println("All point to plot ->");
					 for(Point2D pts : points) {
						 if(pts != null) {
							 System.out.println(pts.getDetails());
						 }else {
							 System.out.println("Points are not added");
						 }
					 }
					 break;
					 
			case 3 : System.out.println("enter index of two points:");
					 int index1  = sc.nextInt();
					 int index2  = sc.nextInt();
					 if((0 <= index1 && index1< points.length) &&(0 <=index2&& index2< points.length)) {
						 if(points[index1].isEqual(points[index2])) {
							 System.out.println("The points are at same location");
						 }else {
							 System.out.println("the points are at different location");
							 System.out.println("The distance between points are : "+points[index1].calDistance(points[index2]));
						 }
					 }else {
						 System.out.println("Invalid index");
					 }
					 break;
					 
			default : System.out.println("Invalid choice!");
						return;
			}
		}
		
		System.out.println("Exiting...");
		sc.close();
		
		
	}
}
