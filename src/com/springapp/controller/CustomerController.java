package com.springapp.controller;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springapp.dao.DatesDAO;
import com.springapp.entity.Band;
import com.springapp.entity.Concert;
import com.springapp.entity.Customer;
import com.springapp.entity.Dates;
import com.springapp.entity.Genres;
import com.springapp.entity.Person;
import com.springapp.entity.Sectors;
import com.springapp.entity.Tickets;
import com.springapp.entity.Venues;
import com.springapp.service.BandService;
import com.springapp.service.ConcertService;
import com.springapp.service.CustomerService;
import com.springapp.service.DatesService;
import com.springapp.service.GenresService;
import com.springapp.service.GenresServiceImpl;
import com.springapp.service.PersonService;
import com.springapp.service.SectorsService;
import com.springapp.service.TicketsService;
import com.springapp.service.VenuesService;
import com.sun.istack.NotNull;




@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private GenresService genreServ;
	@Autowired
	private CustomerService custServ;
	@Autowired
	private TicketsService ticketService;
	@Autowired
	private BandService bandServ;
	@Autowired
	private DatesService dateServ;
	@Autowired
	private VenuesService venueServ;
	@Autowired
	private SectorsService sectorServ;
	@Autowired
	private ConcertService concertServ;
	@Autowired
	private PersonService personServ;
	

	@RequestMapping("/login")
	public String getLogin(Model theModel) {

		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		
		
		return "index1";
		
	}
	
	
	@RequestMapping("/validateLogin")
	public String validateLogin(Model theModel,@Valid @ModelAttribute("customer") Customer customer,BindingResult result) {
		if(result.hasErrors()) {
			return "index1";
		}
		else {
			Person person = personServ.getPerson(1);
			
			
			List<Tickets> ticketList = ticketService.getTickets();
			List<Concert> concerts = concertServ.getConcertsLimit();
			List<Venues> venues = venueServ.getVenues();
			for(Venues v : venues) {
				int cap = venueServ.getSpace(v);
				v.setMax_capacity(cap);
				venueServ.saveVenue(v);
			}
			theModel.addAttribute("concerts", concerts);
			theModel.addAttribute("ticketList", ticketList);
			theModel.addAttribute("person", person);
			return "redirect:/customer/mainPage";	
		}
	}
	
	
	@RequestMapping("/mainPage")
	public String getPersonalizedView(Model theModel) {
		

			Person person = personServ.getPerson(1);
			
			
			List<Tickets> ticketList = ticketService.getTickets();
			List<Concert> concerts = concertServ.getConcertsLimit();
			List<Venues> venues = venueServ.getVenues();
			for(Venues v : venues) {
				int cap = venueServ.getSpace(v);
				v.setMax_capacity(cap);
				venueServ.saveVenue(v);
			}
			theModel.addAttribute("concerts", concerts);
			theModel.addAttribute("ticketList", ticketList);
			theModel.addAttribute("person", person);
			return "mainPage";	


	}
	

	
	
	@RequestMapping("/genresConcerts")
	public String showGenresConcerts(Model theModel) {
		
		List<Genres> genresList = genreServ.getGenres();
		theModel.addAttribute("genresList", genresList);
		
		
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		
		return "genres-concerts";
	}
	
	@RequestMapping("/addBandForm")
	public String showBandForm(Model theModel) {
		
		Band band = new Band();

		theModel.addAttribute("band", band);
	
		
		Dates date = new Dates();
		theModel.addAttribute("date1", date);
		
		return "band-form";
	}
	
	
	
	
	@RequestMapping("/saveBand1")
	public String saveBan(Model theModel,@ModelAttribute("band") Band band1,@ModelAttribute("date") Dates date1){

		bandServ.saveBand(band1);

		//dateServ.saveDate(date1);
		return "redirect:/customer/mainPage";
	}
	
	
	@RequestMapping("/addDateForm")
	public String showDateForm(Model theModel) {
		Dates date = new Dates();
		theModel.addAttribute("date1", date);
	
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		return "date-form";
	}
	
	
	
	
	@RequestMapping("/saveDate")
	public String saveDate(Model theModel,@ModelAttribute("date") Dates date1){

		dateServ.saveDate(date1);
		

		return "redirect:/customer/mainPage";
	}
	
	
	
	
	
	@RequestMapping("/venueForm")
	public String venueForm(Model theModel) {
		
		Venues venue = new Venues();
		theModel.addAttribute("venue", venue);
		
		return "venue-form";
	}
	
	@RequestMapping("/saveVenue")
	public String saveVenue(@ModelAttribute("venue") Venues venue,@RequestParam("venueType") Integer id) {
		List<Sectors> sectors = new ArrayList<>();
		if(id ==1)
		{
			Sectors sec = new Sectors("Klub",300,80);
			sectors.add(sec);
		}
		else {

			Sectors sec1 = new Sectors("Plyta",1000,150);
			Sectors sec2 = new Sectors("Trybuny",1300,100);
			Sectors sec3 = new Sectors("Strefa VIP",30,1000);
			sectors.add(sec1);
			sectors.add(sec2);
			sectors.add(sec3);

		}
		venue.setSectors(sectors);
		venueServ.saveVenue(venue);

		
		
		return "redirect:/customer/mainPage";
	}
	

	
	
	
	@RequestMapping("/concertForm")
	public String concertForm(Model theModel) {
		
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		Concert concert = new Concert();
		List<Band> bands = bandServ.getBands();
		
		List<Dates> dates = dateServ.getDates();
		List<Dates> dates2 = new ArrayList<>();
		for(Dates d : dates) {
			if(d.getConcerts()!=null) {
				dates2.add(d);
			}
		}
		List<Venues> venues = venueServ.getVenues();
		List<Genres> genres = genreServ.getGenres();
		theModel.addAttribute("concert", concert);
		theModel.addAttribute("listBands", bands);
		theModel.addAttribute("listDates", dates2);
		theModel.addAttribute("listVenues", venues );
		theModel.addAttribute("listGenres", genres );
		return "concert-form";
	}
	
	
	
	
	@RequestMapping("/saveConcert")
	public String saveConcert(@ModelAttribute("concert") Concert concert,@RequestParam("bandDrop") Integer bandID,
			@RequestParam("dateDrop") Integer dateID ,
			@RequestParam("venueDrop") Integer venueID,
			@RequestParam("genreDrop") Integer genreID) {

			Band band = bandServ.getBand(bandID);
			Dates date=dateServ.getDate(dateID);
			Venues venue = venueServ.getVenue(venueID);
			Genres genre=genreServ.getGenre(genreID);
			concert.setGenre(genre);

			concert.setDate(date);
			
			concert.setVenue(venue);
			
			concert.setBand(band);
			
			concertServ.saveConcert(concert);
		
		
		return "redirect:/customer/mainPage";
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/datesConcerts")
	public String showDatesConcerts(Model theModel) {
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		List<Dates> datesList = dateServ.getDates();
		theModel.addAttribute("datesList", datesList);
		
		return "dates-concerts";
	}
	
	
	
	@RequestMapping("/venuesConcerts")
	public String showVenuesConcerts(Model theModel) {
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		List<Venues> venuesList = venueServ.getVenues();
		theModel.addAttribute("venuesList", venuesList);
		
		return "venues-concerts";
	}
	
	
	@RequestMapping("/showTicketForm")
	public String showTicketForm(Model theModel,@RequestParam("concertId2") Integer concertId) {

		Person person = personServ.getPerson(1);
		System.out.println(concertId);
		Concert concert = concertServ.getConcert(concertId);
		Venues venue = concert.getVenue();
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		theModel.addAttribute("concert",concert);
		theModel.addAttribute("venue",venue);
		theModel.addAttribute("person",person);

		return "ticket-form";
	}
	
	

	@RequestMapping("/saveTicket")
	public String saveTicket(Model theModel,@Valid @ModelAttribute("person") Person person,BindingResult result,
			@RequestParam(name="sectorsDrop",required = true) Integer sect,
	 	
	@Valid @ModelAttribute(name="howManyTicks") Integer ticks,
			@ModelAttribute("concert_id") Integer concertId,@ModelAttribute("venue") Venues venue
			)  {
		
		
		if(result.hasErrors()||ticks<1||ticks>10) {
			System.out.println(concertId);
			Concert concert = concertServ.getConcert(concertId);
			Venues venue1 = concert.getVenue();
			Person person1 = new Person();
			int tick=0;
			List<Tickets> ticketList = ticketService.getTickets();
			theModel.addAttribute("ticketList", ticketList);
			theModel.addAttribute("concert",concert);
			theModel.addAttribute("venue",venue1);
			theModel.addAttribute("tick",tick);
			return "ticket-form";
		}
		
		else {
			System.out.println(ticks);
			Sectors sector = sectorServ.getSector(sect);
			System.out.println(sector.getSector_name());
			System.out.println(concertId);
			Concert concert= concertServ.getConcert(concertId);
			int cap = sector.getSector_capacity()-ticks;
			sector.setSector_capacity(cap);
			sectorServ.saveSector(sector);
			Tickets ticket = new Tickets(ticks, ticks*sector.getSector_price(), sector.getSector_name());
			ticket.setConcert(concert);
			ticketService.saveTickets(ticket);
			List<Tickets> ticketList = ticketService.getTickets();
			theModel.addAttribute("ticketList", ticketList);
			theModel.addAttribute("venue", venue);
			return "redirect:/customer/mainPage";
		}

	}
	
	
	
	
	
	
	@RequestMapping("/deleteTickets")
	public String deleteTickets(){
		

		
		ticketService.deleteTickets();
		return "redirect:/customer/mainPage";
	}
	
	
	
	@RequestMapping("/deleteSingleTicket")
	public String singleTicketDel(@RequestParam("ticketId") Integer ticketId) {
		
		System.out.println(ticketId);
		Tickets tick = ticketService.getTicket(ticketId);
		Venues ven = tick.getConcert().getVenue();
		int cap = ven.getMax_capacity();
		cap += tick.getTicket_number();
		ven.setMax_capacity(cap);
		venueServ.saveVenue(ven);
		ticketService.deleteSingleTicket(ticketId);
		return "redirect:/customer/mainPage";
	}
	
	
	
	@RequestMapping("/showTickets")
	public String showTickets(Model theModel) {
		List<Tickets> ticketList = ticketService.getTickets();
		theModel.addAttribute("ticketList", ticketList);
		List<Tickets> tickets = ticketService.getTickets();
		theModel.addAttribute("tickets", tickets);
		return "ticketsList";
		

	

	

	
}
}