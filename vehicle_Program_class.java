package demo07;
import java.util.Collections;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//writeVehicles();
		readVehicles();

	}
	public static void readVehicles() {
		List<Vehicle> list=new ArrayList<Vehicle>();
		
		try(FileInputStream fin=new FileInputStream("Vehicles.db")){
			try(DataInputStream din=new DataInputStream(fin)){
				while(true) {
					Vehicle v=new Vehicle();
					v.setVehicleId(din.readInt());
					v.setModel(din.readUTF());
					v.setType(din.readUTF());
					v.setPrice(din.readDouble());
					if(v.getPrice()>0) {
						list.add(v);
					}
					else
					{
						System.out.println("Skipping vehicles with vehicleId:"+v.getVehicleId()+" vehiclePrice:"+v.getPrice());
						System.out.println();
					}
				}
				}//din.close();
			}//fin.close();
			catch (Exception e) {
				//Do nothing
			}
			list.forEach(e->System.out.println(e));
			
	class PriceComparator implements Comparator<Vehicle>{
		@Override
		public int compare(Vehicle x,Vehicle y) {
			int diff=(int)(y.getPrice()-x.getPrice());
			return diff;
		}
	}
	PriceComparator priceComparator=new PriceComparator();
	
	Collections.sort(list,priceComparator);
	
	System.out.println("Sorted on price:");
		
	}
	public static void writeVehicles() {
			List<Vehicle> list=new ArrayList<>();
			list.add(new Vehicle(1, "M5","BMW",700000.00));
			list.add(new Vehicle(2, "Q7","AUDI",600000.00));
			list.add(new Vehicle(3, "S3","Supra",-500000.00));
			list.add(new Vehicle(4, "x10","TATA",400000.00));
			list.add(new Vehicle(5, "X5","BMW",300000.00));
			
			try(FileOutputStream fout=new FileOutputStream("Vehicles.db")){
				try(DataOutputStream dout=new DataOutputStream(fout)){
					for(Vehicle v : list) {
						if(v.getPrice()>0) {
						dout.writeInt(v.getVehicleId());
						dout.writeUTF(v.getModel());
						dout.writeUTF(v.getType());
						dout.writeDouble(v.getPrice());
						}
					}
				}//dout.close();
				
				System.out.println("Vehicles closed...");
			}//fout.close();
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	



