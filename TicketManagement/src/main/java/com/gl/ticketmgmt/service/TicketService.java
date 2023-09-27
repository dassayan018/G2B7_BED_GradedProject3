package com.gl.ticketmgmt.service;

import java.util.List;

import com.gl.ticketmgmt.entity.Ticket;

public interface TicketService {
	
	public List<Ticket> findAll();

	public Ticket findByID(int id);

	public void save(Ticket theTkt);

	public void deleteById(int tktId);

	Ticket updateTicket(Ticket ticket);

}
