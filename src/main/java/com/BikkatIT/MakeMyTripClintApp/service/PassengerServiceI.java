package com.BikkatIT.MakeMyTripClintApp.service;

import com.BikkatIT.MakeMyTripClintApp.model.Passenger;
import com.BikkatIT.MakeMyTripClintApp.model.Ticket;

public interface PassengerServiceI {
	
	public Ticket bookticket(Passenger ps);
	
	public Ticket bookticketwebclint(Passenger ps);

}
