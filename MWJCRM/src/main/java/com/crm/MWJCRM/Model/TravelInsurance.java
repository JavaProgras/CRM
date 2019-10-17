package com.crm.MWJCRM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "travelinsurance")
public class TravelInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int no_of_datsTravelling;
	private String place_ofTravelling;

	public TravelInsurance() {

	}

	public TravelInsurance(int id, int no_of_datsTravelling, String place_ofTravelling) {
		super();
		this.id = id;
		this.no_of_datsTravelling = no_of_datsTravelling;
		this.place_ofTravelling = place_ofTravelling;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNo_of_datsTravelling() {
		return no_of_datsTravelling;
	}

	public void setNo_of_datsTravelling(int no_of_datsTravelling) {
		this.no_of_datsTravelling = no_of_datsTravelling;
	}

	public String getPlace_ofTravelling() {
		return place_ofTravelling;
	}

	public void setPlace_ofTravelling(String place_ofTravelling) {
		this.place_ofTravelling = place_ofTravelling;
	}

}
