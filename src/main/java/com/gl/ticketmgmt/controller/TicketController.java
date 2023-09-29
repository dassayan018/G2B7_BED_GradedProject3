package com.gl.ticketmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.gl.ticketmgmt.entity.Ticket;
import com.gl.ticketmgmt.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	TicketService tktService;

	public TicketController(TicketService tktService) {
		super();
		this.tktService = tktService;
	}

	@GetMapping("/tickets")
	public String getAllTickets(Model model) {
		System.out.println("in the get all controller");
		List<Ticket> ticket = tktService.findAll();
//		for (Ticket ticket1 : ticket) {
//			System.out.println(ticket1.getTicketCreatedOn());
//		}
		model.addAttribute("ticket", ticket);
		return "list-tkt";

	}

	@GetMapping("/addTicket")
	public String createticketForm(Model model) {
		System.out.println("in add controller");

		// create employee object to hold employee form data
		Ticket ticket = new Ticket();
		model.addAttribute("ticket", ticket);
		return "add-ticket";
	}

	@PostMapping("/tickets")
	public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
		System.out.println("in save controller");
		tktService.save(ticket);
		System.out.println("ticket saved");
		return "redirect:/tickets";
	}

	@GetMapping("/tickets/edit/{id}")
	public String editTicketForm(@PathVariable int id, Model model) {
		System.out.println("in edit controller");
		Ticket ticket = tktService.findByID(id);
		if (ticket == null) {
			System.out.println("Ticket not found for id: " + id);
			return "error";
		}
		System.out.println("Found ticket with id: " + id);
//		model.addAttribute("ticket", tktService.findByID(id));
		model.addAttribute("ticket", ticket);
		return "edit_ticket";
	}

	@PostMapping("/tickets/{id}")
	public String updateTicket(@PathVariable int id, @ModelAttribute("ticket") Ticket ticket, Model model) {

		// get employee from database by id
		Ticket existingTicket = tktService.findByID(id);
		existingTicket.setId(id);
		existingTicket.setTicketTitle(ticket.getTicketTitle());
		existingTicket.setTicketShortDes(ticket.getTicketShortDes());
		existingTicket.setTicketCreatedOn(ticket.getTicketCreatedOn());

		// save updated employee object
		tktService.updateTicket(existingTicket);
		return "redirect:/tickets";
	}
	
	@GetMapping("/tickets/{id}")
	public String deleteTicket(@PathVariable int id) {
		tktService.deleteById(id);
		return "redirect:/tickets";
	}

}
