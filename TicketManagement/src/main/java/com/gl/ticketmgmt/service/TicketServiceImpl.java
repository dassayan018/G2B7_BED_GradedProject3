package com.gl.ticketmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ticketmgmt.entity.Ticket;
import com.gl.ticketmgmt.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepository ticketRepo;

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return ticketRepo.findAll();
	}

	@Override
	public Ticket findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ticket theTkt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int tktId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

}
