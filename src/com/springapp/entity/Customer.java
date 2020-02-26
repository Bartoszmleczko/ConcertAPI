package com.springapp.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="customer_id")
		private int customer_id;
		@NotNull(message = "Puste pole!")
		@Pattern(regexp="admin", message ="Zły login")
		@Column(name="email")
		private String email;
		@NotNull(message = "Puste pole!")
		@Pattern(regexp="admin", message ="Złe hasło")
		@Column(name="password")
		private String password;
		
		@OneToMany(mappedBy="customer",cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
		private List<Tickets> tickets;
		
		
		
		public Customer() {
			super();
		}

		public Customer(@NotNull String email,@NotNull String password) {
			super();
			this.email = email;
			this.password = password;
		}

		public int getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Tickets> getTickets() {
			return tickets;
		}

		public void setTickets(List<Tickets> tickets) {
			this.tickets = tickets;
		}
		
		

}
