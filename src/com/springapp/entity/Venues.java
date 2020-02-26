package com.springapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="venues")
public class Venues {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="venue_id")
		private int venue_id;
		@Column(name="venue_name")
		private String venue_name;
		@Column(name="max_capacity")
		private Integer max_capacity;
		@OneToMany(mappedBy = "venue",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
		private List<Concert> concerts;

		@ManyToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
		@Fetch(value = FetchMode.SUBSELECT)
		@JoinTable(
		        name = "Venues_Sectors", 
		        joinColumns = { @JoinColumn(name = "venue_id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "sector_id") }
		    )
		private List<Sectors> sectors;

		public Venues() {
			super();
		}

		public Venues(String venue_name) {
			super();
			this.venue_name = venue_name;

		}

		public int getVenue_id() {
			return venue_id;
		}

		public void setVenue_id(int venue_id) {
			this.venue_id = venue_id;
		}

		public String getVenue_name() {
			return venue_name;
		}

		public void setVenue_name(String venue_name) {
			this.venue_name = venue_name;
		}

		public List<Concert> getConcerts() {
			return concerts;
		}

		public void setConcerts(List<Concert> concerts) {
			this.concerts = concerts;
		}

		public List<Sectors> getSectors() {
			return sectors;
		}

		public void setSectors(List<Sectors> sectors) {
			this.sectors = sectors;
		}

		public int getMax_capacity() {
			return max_capacity;
		}

		public void setMax_capacity(int max_capacity) {
			this.max_capacity = max_capacity;
		}
		
		
}
