package com.BikkatIT.MakeMyTripClintApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkatIT.MakeMyTripClintApp.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
