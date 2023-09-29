package com.gl.ticketmgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "ticket_Title")
	private String ticketTitle;
	@Column(name = "ticket_Short_Des")
	private String ticketShortDes;
	@Column(name = "ticket_Created_On")
	private String ticketCreatedOn;

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

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Ticket(String ticketTitle, String ticketShortDes, String ticketCreatedOn) {
		super();
		this.ticketTitle = ticketTitle;
		this.ticketShortDes = ticketShortDes;
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Ticket() {
		super();
	}
	
	

}
