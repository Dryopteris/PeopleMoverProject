package com.kirby.wiki;

public class Location {
	private String name;
	private String address;
	private double lat;
	private double lng;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lon) {
		this.lng = lon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String formatted_address) {
		this.address = formatted_address;
	}
	
	

}
