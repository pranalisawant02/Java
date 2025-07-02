package demo07;
import java.util.Scanner;

public class DrivingCostCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter miles per day:");
	double totalMiles=sc.nextDouble();
	
	System.out.print("Enter cost per gallon of gasoline:");
	double costPerGallon=sc.nextDouble();
	
	System.out.print("Enter avg miles per gallon:");
	double milesPerGallon=sc.nextDouble();
	
	System.out.print("Enter parking fees per day:");
	double ParkingFees=sc.nextDouble();
	
	System.out.print("Enter tolls per day:");
	double tollsPerDay=sc.nextDouble();
	
	//calculations
	double fuelCost=(totalMiles/milesPerGallon)*costPerGallon;
	double totalCostPerDay=fuelCost+ParkingFees+tollsPerDay;
	
	System.out.println("Estimated daily driving cost:"+totalCostPerDay);
	
	sc.close();
	}

}
