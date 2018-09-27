package com.flightnetwork.flightsearch.database;


import java.util.ArrayList;
import com.flightnetwork.flightsearch.model.Flight;

public class DatabaseClass {

	private static ArrayList<Flight> flightList = new ArrayList<>();
	
	public static ArrayList<Flight> getFlights() {
		return flightList;
	}
}
