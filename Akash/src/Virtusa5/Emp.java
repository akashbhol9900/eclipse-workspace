package Virtusa5;

public class Emp {
 
	private int empcode;
	
	private String name;
	
	private String position;
	
	private int sal;
	
	private Address address;
	
	public Emp() {
		
		
		
	}

	public Emp(int empcode, String name, String position, int sal, Address address) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.position = position;
		this.sal = sal;
		this.address = address;
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Address getAddress() {
		
		Address address = new Address();
		
		address.getCityname();
		address.getStreetname();
		address.getPincode();
		
		
		
		return address;
	}

	public void setAddress(Address address) {
		
		this.address = address;
	}

	
 
}
