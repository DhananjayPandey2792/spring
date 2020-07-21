package com.springautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class City {

	private String cityName;
	private int cityRadius;
	@Autowired
	private Address adr;
	public void setcityName(String cityName) {
		this.cityName=cityName;
		
		
	}
	public void setcityRadius(int cityRadius) {
		this.cityRadius=cityRadius;
		
		
	}
	public City(String cityName, int cityRadius, Address adr) {
		super();
		this.cityName = cityName;
		this.cityRadius = cityRadius;
		this.adr = adr;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	
	public String toString() {
		return "City [cityName=" + cityName + ", cityRadius=" + cityRadius + ", adr=" + adr + "]";
	}
	public void setAddress(Address adr) {
		this.adr=adr;
		
		
	}
	public String getcityName() {
		return cityName;
	}
	public int getcityRadius() {
		return cityRadius;
	}
	public Address getAddress() {
		return adr;
	}
}
