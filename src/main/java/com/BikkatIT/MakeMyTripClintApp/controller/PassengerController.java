package com.BikkatIT.MakeMyTripClintApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkatIT.MakeMyTripClintApp.model.Passenger;
import com.BikkatIT.MakeMyTripClintApp.model.Ticket;
import com.BikkatIT.MakeMyTripClintApp.service.PassengerServiceI;

@RestController
public class PassengerController {
	@Autowired
	private PassengerServiceI passengerServiceI;
	@PostMapping(value = "/bookticket" ,consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> bookticket(@RequestBody Passenger ps){
	
		Ticket bookticket = passengerServiceI.bookticket(ps);
		return new ResponseEntity<Ticket>(bookticket,HttpStatus.CREATED);
		
		
	}
	
	@PostMapping(value = "/bookticketweb" ,consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> bookticketweb(@RequestBody Passenger ps){
	
		Ticket bookticket = passengerServiceI.bookticketwebclint(ps);
		return new ResponseEntity<Ticket>(bookticket,HttpStatus.CREATED);
		
		
	}

}
