package com.springapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="genres")
public class Genres {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="genre_id")
	private int genre_id;
	@Column(name="genre_name")
	private String genre_name;

	
	@OneToMany(mappedBy = "genre",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}, fetch = FetchType.EAGER)
	private List<Concert> concerts;


	public Genres() {
		super();
	}


	public Genres(String genre_name) {
		super();
		this.genre_name = genre_name;

	}


	public int getGenre_id() {
		return genre_id;
	}


	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}


	public String getGenre_name() {
		return genre_name;
	}


	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}


	public List<Concert> getConcerts() {
		return concerts;
	}


	public void setConcerts(List<Concert> concerts) {
		this.concerts = concerts;
	}
	
	
	
}
