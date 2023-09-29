package com.gl.ticketmgmt.service;

import java.util.List;
import java.util.Optional;

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
		Optional<Ticket> result= ticketRepo.findById(id);
		Ticket theTicket=null;
		if(result.isPresent())
		{
			theTicket=result.get();
		}
		else
		{
			throw new RuntimeException("Didnot find the EmployeeID:"+ id);
		}
		return theTicket;
	}

	@Override
	public void save(Ticket theTkt) {
		ticketRepo.save(theTkt);

	}

	@Override
	public void deleteById(int tktId) {
		ticketRepo.deleteById(tktId);

	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

}
