package com.crm.MWJCRM.Model;

import javax.persistence.*;

@Entity
@Table(name = "workmencompensation")
public class WorkmenCompensation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int no_of_workers;
	private String place_of_travelling;

	public WorkmenCompensation() {

	}

	public WorkmenCompensation(int id, int no_of_workers, String place_of_travelling) {
		super();
		this.id = id;
		this.no_of_workers = no_of_workers;
		this.place_of_travelling = place_of_travelling;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNo_of_workers() {
		return no_of_workers;
	}

	public void setNo_of_workers(int no_of_workers) {
		this.no_of_workers = no_of_workers;
	}

	public String getPlace_of_travelling() {
		return place_of_travelling;
	}

	public void setPlace_of_travelling(String place_of_travelling) {
		this.place_of_travelling = place_of_travelling;
	}

}
