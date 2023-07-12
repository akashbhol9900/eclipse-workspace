package com.virtusa;

public class Manager {
	private String name;
	private String buissnessUnit;
	
	public Manager(String name, String buissnessUnit) {
		super();
		this.name = name;
		this.buissnessUnit = buissnessUnit;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", buissnessUnit=" + buissnessUnit + "]";
	}
	
	
}
