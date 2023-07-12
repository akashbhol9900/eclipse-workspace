package com.vehiclebooking;
//import aboutvachilebooking.VechicleManagement;
public class OtherWheeler implements VechicleManagement {
	 private String model="HeroSplender";
	 private double price=50;
	 private int  seatingcapacity=2;
	 public OtherWheeler()
	 {
		 
	 }
	public OtherWheeler(String model, double price, int seatingcapacity) {
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
	public void rent()
	{
		System.out.println("showing details othervachicle");
		System.out.println(model+" "+price+" "+seatingcapacity);
	}
	 
	}


