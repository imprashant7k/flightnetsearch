package com.flightnetwork.flightsearch.model;


public class Flight implements Comparable<Flight> {

	
	private String name;
	private String origin;
	private String destination;
	private int price;
	
	
	public Flight() {
		
	}
	
    public Flight(String name, String origin, String destination,int price) {
    	
    	this.name=name;
    	this.origin= origin;
    	this.destination=destination;
    	this.price = price;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Flight flight) {
		// TODO Auto-generated method stub
		int compareprice = ((Flight)flight).getPrice();
		
		return this.price - compareprice;
	}

}
