package com.springapp.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="dates")
public class Dates {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="date_id")
		private int date_id;
		@Column(name="date")
		private String date;
		@OneToMany(mappedBy = "date",cascade ={CascadeType.ALL},fetch = FetchType.EAGER)
		private List<Concert> concerts;
		public Dates(String date) {
			super();
			this.date = date;
		}
		public Dates() {
			super();
		}
		public int getDate_id() {
			return date_id;
		}
		public void setDate_id(int date_id) {
			this.date_id = date_id;
		}
		
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public List<Concert> getConcerts() {
			return concerts;
		}
		public void setConcerts(List<Concert> concerts) {
			this.concerts = concerts;
		}
		@Override
		public String toString() {
			return "Dates [date_id=" + date_id + ", date=" + date + ", concerts=" + concerts + "]";
		}
		
		
		
}
