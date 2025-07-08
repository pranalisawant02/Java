package demo07;

public class Vehicle {
	private int vehicleId;
	private String model;
	String type;
	double price;
	//paramterless ctor
	Vehicle(){}
	//parameterized ctor
	public Vehicle(int vehicleId, String model, String type, double price) {
		super();
		this.vehicleId = vehicleId;
		this.model = model;
		this.type = type;
		this.price = price;
	}
	//getter & setter functions
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//toString method
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}
	
}
