package com.gl.ticketmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gl.ticketmgmt.entity.Ticket;
import com.gl.ticketmgmt.service.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	TicketService tktService;

	public TicketController (TicketService tktService) {
		super();
		this.tktService = tktService;
	}
	
	@GetMapping("/tickets")
	public String getAllTickets(Model model) {
		System.out.println("in the get all controller");
		List<Ticket>ticket = tktService.findAll();
		for (Ticket ticket1 : ticket) {
			System.out.println(ticket1.getTicketTitle());
		}
		model.addAttribute("ticket",ticket);
		return "list-tkt";
		
	}
	
	
	

}
