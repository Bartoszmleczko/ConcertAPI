package com.springapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Concert")
public class Concert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="concert_id",unique = true)
			private int concert_id;
	
	@Column(name="concert_name")
	private String concert_name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="band_id")
	private Band band;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="date_id")
			private Dates date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="genre_id")
	private Genres genre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="venue_id")
	private Venues venue;

	
	public Concert() {
		super();
	}
	

	public Concert(String concert_name) {
		super();
		this.concert_name = concert_name;
	}


	


	public int getConcert_id() {
		return concert_id;
	}


	public void setConcert_id(int concert_id) {
		this.concert_id = concert_id;
	}


	public String getConcert_name() {
		return concert_name;
	}


	public void setConcert_name(String concert_name) {
		this.concert_name = concert_name;
	}



	public Band getBand() {
		return band;
	}


	public void setBand(Band band) {
		this.band = band;
	}


	public Dates getDate() {
		return date;
	}


	public void setDate(Dates date) {
		this.date = date;
	}


	public Genres getGenre() {
		return genre;
	}


	public void setGenre(Genres genre) {
		this.genre = genre;
	}


	public Venues getVenue() {
		return venue;
	}


	public void setVenue(Venues venue) {
		this.venue = venue;
	}

	
	
	
			
			
}
