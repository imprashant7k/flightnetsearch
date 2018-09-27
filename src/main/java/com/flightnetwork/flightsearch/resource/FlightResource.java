package com.flightnetwork.flightsearch.resource;
import com.flightnetwork.flightsearch.model.Flight;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flightnetwork.flightsearch.service.FlightService;


@Path("search")
public class FlightResource {
	
	FlightService flightService = new FlightService();

	@GET
    @Path("/{origin}/{destination}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> getResponse(@PathParam("origin") String origin, @PathParam("destination") String destination ) {
     
    	return flightService.getFlights(origin, destination);
    }
	 
}
