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
@Table(name="band")
public class Band {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="band_id")
			private int band_id;
	@Column(name="band_name")
			private String band_name;
	@Column(name="description")
	private String description;
	@Column(name="band_img")
	private String band_img;
	@Column(name="tour_desc")
	private String tour_desc;
	@OneToMany(mappedBy = "band",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Concert> concerts;
	public Band() {
		super();
	}


	public Band(String name, String description) {
		super();
		this.band_name = name;
		this.description = description;
	}



	public int getBand_id() {
		return band_id;
	}


	public void setBand_id(int band_id) {
		this.band_id = band_id;
	}


	public String getBand_name() {
		return band_name;
	}


	public void setBand_name(String band_name) {
		this.band_name = band_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Concert> getConcerts() {
		return concerts;
	}


	public void setConcerts(List<Concert> concerts) {
		this.concerts = concerts;
	}


	public String getBand_img() {
		return band_img;
	}


	public void setBand_img(String band_img) {
		this.band_img = band_img;
	}


	public String getTour_desc() {
		return tour_desc;
	}


	public void setTour_desc(String tour_desc) {
		this.tour_desc = tour_desc;
	}




	
			
}
