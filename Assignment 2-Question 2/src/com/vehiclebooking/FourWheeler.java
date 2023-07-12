package com.vehiclebooking;


public class FourWheeler  extends Passenger implements VechicleManagement{

	private String model="INNOVA";
	private  double price=100;
	private int seatingcapacity=4;
	public FourWheeler()
	{
		
	}
	public FourWheeler(String model, double price, int seatingcapacity) {
		super();
		this.model = model;
		this.price = price;
		this.seatingcapacity = seatingcapacity;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSeatingcapacity() {
		return seatingcapacity;
	}
	public void setSeatingcapacity(int seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}
//	public void rent()
//	{
//		//FourWheeler f=new FourWheeler();
////		if(model.equals(vachicletype))
////		{
////			
////		}
////		return("akash");
//		System.out.println("Details of the Fourwheeler");
//		System.out.println(model+" "+price+" "+seatingcapacity);
//	}

	}



