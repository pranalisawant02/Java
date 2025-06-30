package com.app.geometry;

public class Point2D {
	//feilds
	private double x;
	private double y;
	//paramterless ctor
	Point2D()
	{
		//todo
	}
	//parametrized ctor
	public Point2D(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	//get details
	public String getDetails() {
		return "("+ x+ ","+y+")";
	}
	//Equalto method
	public boolean isEqual(Point2D pt)
	{
		return this.x==pt.x && this.y==pt.y;
	}
	//calculate distance
	public double calDistance(Point2D pt)
	{
		return Math.sqrt(Math.pow(this.x - pt.x, 2)
				+Math.pow(this.y - pt.y, 2));
	}
}
//test class 
package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;
public class TestPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x & y for point1:");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		Point2D pt1=new Point2D(x1,y1);
		
		System.out.println("Enter x & y for point2:");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		Point2D pt2=new Point2D(x2,y2);
	
	pt1.getDetails();
	pt2.getDetails();
	
	if(pt1.isEqual(pt2))
	{
		System.out.println("Given Points are at the same location");
	}
	else 
	{
		System.out.println("Points are at different location");
		System.out.println("the distance from two points is:"+
		pt1.calDistance(pt2));
	}
}
}


