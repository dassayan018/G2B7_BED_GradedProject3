package com.gl.ticketmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ticketmgmt.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
