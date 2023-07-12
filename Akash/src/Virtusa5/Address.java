package Virtusa5;

public class Address {
private String cityname;
private String streetname;
private String pincode;

public Address()
{
	
}

public Address(String cityname, String streetname, String pincode) {
	super();
	this.cityname = cityname;
	this.streetname = streetname;
	this.pincode = pincode;
}

public String getCityname() {
	return cityname;
}

public void setCityname(String cityname) {
	this.cityname = cityname;
}

public String getStreetname() {
	return streetname;
}

public void setStreetname(String streetname) {
	this.streetname = streetname;
}

public  String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}


}
