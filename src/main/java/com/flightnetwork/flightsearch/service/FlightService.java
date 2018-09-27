package com.flightnetwork.flightsearch.service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import com.flightnetwork.flightsearch.model.Flight;
import com.opencsv.CSVReader;

public class FlightService {
	
	private ArrayList<Flight> flightList = new ArrayList<>();
	public FlightService() {
	
		flightList.add(new Flight("Air India","BOM","PNQ",2000));
		flightList.add(new Flight("Air India","PNQ","BOM",2200));
		flightList.add(new Flight("Indigo","PNQ","BOM",2000));
		flightList.add(new Flight("Air India","PNQ","DELHI",5000));
		flightList.add(new Flight("Air India","PNQ","DELHI",4500));
		
		
//		String file = "src/Flightdata.csv";
//		try { 
//			  
//	        FileReader filereader = new FileReader(file); 
//	  
//	        CSVReader csvReader = new CSVReader(filereader); 
//	        String[] nextRecord; 
//	  
//	        while ((nextRecord = csvReader.readNext()) != null) { 
//	            for (String cell : nextRecord) { 	               
//	            	 String[] values = cell.split(",");
//	            	 
//	            	Flight flight = new Flight(values[0],values[1],values[2],Integer.parseInt(values[3]));
//	            	
//	            	flightList.add(flight);
//	            } 
//	            System.out.println("Hello"); 
//	        } 
//	    } 
//	    catch (Exception e) { 
//	        e.printStackTrace(); 
//	    } 
		
		
	}
	
	public ArrayList<Flight> getFlights(String origin, String destination) {
		
		ArrayList<Flight> resultFlightList = new ArrayList<>(); 
		
		for(int i=0;i<flightList.size();i++)
		{
			Flight flight = flightList.get(i);
			
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
			{
				 resultFlightList.add(flight);
			}
		}
		Collections.sort(resultFlightList);
		
		if(resultFlightList.isEmpty())
		{
			Flight flight = new Flight();
			
			flight.setName("No Flight available for this root");
			
			resultFlightList.add(flight);
		}
	return resultFlightList;		
	}
}
