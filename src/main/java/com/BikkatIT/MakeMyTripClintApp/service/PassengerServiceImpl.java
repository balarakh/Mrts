package com.BikkatIT.MakeMyTripClintApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkatIT.MakeMyTripClintApp.model.Passenger;
import com.BikkatIT.MakeMyTripClintApp.model.Ticket;
import com.BikkatIT.MakeMyTripClintApp.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerServiceI {
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Ticket bookticket(Passenger ps) {
	
	Passenger save = passengerRepository.save(ps);
	
	String url="http://localhost:9191/bookticket";
	
	RestTemplate rt=new RestTemplate();
	ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, ps, Ticket.class);
	
	Ticket ticket = postForEntity.getBody(); 
	
		
		return ticket;
	}

	@Override
	public Ticket bookticketwebclint(Passenger ps) {
		String url1="http://localhost:9191/bookticket";
		
		WebClient webClient=WebClient.create();
		
		Ticket ticket=(Ticket) webClient.post().
				uri(url1).contentType(MediaType.APPLICATION_JSON).
				accept(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(ps)).
				retrieve().
				bodyToMono(Ticket.class).
				block();
		
		return ticket;
		
		
		
		
	}

}
