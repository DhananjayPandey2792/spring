package com.springautowire;

public class Address {
	
	private String streetName;
	private String houseName;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getHouseName() {
		return houseName;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseName=" + houseName + "]";
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}


}
