package com.BikkatIT.MakeMyTripClintApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
@Id
	private int tid;
	
	private long tpnr;
	
	private String ticketStatus;
	
	private double tprice;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getTprice() {
		return tprice;
	}

	public void setTprice(double tprice) {
		this.tprice = tprice;
	}

	public long getTpnr() {
		return tpnr;
	}

	public void setTpnr(long tpnr) {
		this.tpnr = tpnr;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", tpnr=" + tpnr + ", ticketStatus=" + ticketStatus + ", tprice=" + tprice + "]";
	}

	
	
	
}
