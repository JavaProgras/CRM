package com.crm.MWJCRM.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "velicleinsurance")
public class VehicleInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Long idv;
	private Long cc_no;
	private Long ncb_amt;
	private Date year_of_manufacturing;
	private String vehicle_model;
	private String vehicle_registration_no;
	private String chasis_number;
	private String engine_number;
	private int fuel;

	public VehicleInsurance() {

	}

	public VehicleInsurance(int id, Long idv, Long cc_no, Long ncb_amt, Date year_of_manufacturing,
			String vehicle_model, String vehicle_registration_no, String chasis_number, String engine_number,
			int fuel) {
		super();
		this.id = id;
		this.idv = idv;
		this.cc_no = cc_no;
		this.ncb_amt = ncb_amt;
		this.year_of_manufacturing = year_of_manufacturing;
		this.vehicle_model = vehicle_model;
		this.vehicle_registration_no = vehicle_registration_no;
		this.chasis_number = chasis_number;
		this.engine_number = engine_number;
		this.fuel = fuel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getIdv() {
		return idv;
	}

	public void setIdv(Long idv) {
		this.idv = idv;
	}

	public Long getCc_no() {
		return cc_no;
	}

	public void setCc_no(Long cc_no) {
		this.cc_no = cc_no;
	}

	public Long getNcb_amt() {
		return ncb_amt;
	}

	public void setNcb_amt(Long ncb_amt) {
		this.ncb_amt = ncb_amt;
	}

	public Date getYear_of_manufacturing() {
		return year_of_manufacturing;
	}

	public void setYear_of_manufacturing(Date year_of_manufacturing) {
		this.year_of_manufacturing = year_of_manufacturing;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public String getVehicle_registration_no() {
		return vehicle_registration_no;
	}

	public void setVehicle_registration_no(String vehicle_registration_no) {
		this.vehicle_registration_no = vehicle_registration_no;
	}

	public String getChasis_number() {
		return chasis_number;
	}

	public void setChasis_number(String chasis_number) {
		this.chasis_number = chasis_number;
	}

	public String getEngine_number() {
		return engine_number;
	}

	public void setEngine_number(String engine_number) {
		this.engine_number = engine_number;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}
