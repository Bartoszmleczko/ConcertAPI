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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="sectors")
public class Sectors {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="sector_id")
			private int sector_id;
			@Column(name="sector_name")
			private String sector_name;
			@Column(name="sector_capacity")
			private int sector_capacity;
			@Column(name="sector_price")
			private int sector_price;
			@ManyToMany(cascade = {CascadeType.ALL},mappedBy = "sectors")
			@Fetch(value = FetchMode.SUBSELECT)
			private List<Venues> venues;

			public Sectors(String sector_name, int sector_capacity, int sector_price) {
				super();
				this.sector_name = sector_name;
				this.sector_capacity = sector_capacity;
				this.sector_price = sector_price;
			}

			public Sectors() {
				super();
			}

			public int getSector_id() {
				return sector_id;
			}

			public void setSector_id(int sector_id) {
				this.sector_id = sector_id;
			}

			public String getSector_name() {
				return sector_name;
			}

			public void setSector_name(String sector_name) {
				this.sector_name = sector_name;
			}

			public int getSector_capacity() {
				return sector_capacity;
			}

			public void setSector_capacity(int sector_capacity) {
				this.sector_capacity = sector_capacity;
			}

			public int getSector_price() {
				return sector_price;
			}

			public void setSector_price(int sector_price) {
				this.sector_price = sector_price;
			}

			public List<Venues> getVenues() {
				return venues;
			}

			public void setVenues(List<Venues> venues) {
				this.venues = venues;
			}


			
				
}
