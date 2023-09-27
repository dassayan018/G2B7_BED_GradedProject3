package com.gl.ticketmgmt.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ticketTitle;
	private String ticketShortDes;
	private Date ticketCreatedOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketShortDes() {
		return ticketShortDes;
	}

	public void setTicketShortDes(String ticketShortDes) {
		this.ticketShortDes = ticketShortDes;
	}

	public Date getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(Date ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Ticket(String ticketTitle, String ticketShortDes, Date ticketCreatedOn) {
		super();
		this.ticketTitle = ticketTitle;
		this.ticketShortDes = ticketShortDes;
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Ticket() {
		super();
	}
	
	

}
