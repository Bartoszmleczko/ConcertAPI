package com.springapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tickets")
public class Tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int ticket_id;
	@NotNull(message = "To pole nie moze być puste")
	@Min(value = 1,message = "1 bilet")
	@Column(name="ticket_number")
	private int ticket_number;
	
	@Column(name="ticket_price")
	private int ticket_price;
	@NotNull
	@Column(name="tic_sector_name")
	private String ticSectorName;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="concert_id")
	private Concert concert;

	public Tickets() {
		super();
	}
	
	public Tickets(@NotNull int ticket_number, int ticket_price,@NotNull String ticSectorName) {
		super();

		this.ticket_number = ticket_number;
		this.ticket_price = ticket_price;
		this.ticSectorName = ticSectorName;
	}



	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Concert getConcert() {
		return concert;
	}

	public void setConcert(Concert concert) {
		this.concert = concert;
	}

	public int getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(int ticket_number) {
		this.ticket_number = ticket_number;
	}

	public int getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}

	public String getTicSectorName() {
		return ticSectorName;
	}

	public void setTicSectorName(String ticSectorName) {
		this.ticSectorName = ticSectorName;
	}
	
	
}
