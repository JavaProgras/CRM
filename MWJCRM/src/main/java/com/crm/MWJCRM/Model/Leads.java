package com.crm.MWJCRM.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Leads {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ucc_no;
	private String company_name;
	private Long mobileno;
	private String office_no;
	private String address;
	private String first_name;
	private String last_name;;
	private String natureof_job;
	private Date dob;
	private String customer_category;

	public Leads() {

	}

	public Leads(int id, String ucc_no, String company_name, Long mobileno, String office_no, String address,
			String first_name, String last_name, String natureof_job, Date dob, String customer_category) {
		super();
		this.id = id;
		this.ucc_no = ucc_no;
		this.company_name = company_name;
		this.mobileno = mobileno;
		this.office_no = office_no;
		this.address = address;
		this.first_name = first_name;
		this.last_name = last_name;
		this.natureof_job = natureof_job;
		this.dob = dob;
		this.customer_category = customer_category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUcc_no() {
		return ucc_no;
	}

	public void setUcc_no(String ucc_no) {
		this.ucc_no = ucc_no;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public String getOffice_no() {
		return office_no;
	}

	public void setOffice_no(String office_no) {
		this.office_no = office_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNatureof_job() {
		return natureof_job;
	}

	public void setNatureof_job(String natureof_job) {
		this.natureof_job = natureof_job;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCustomer_category() {
		return customer_category;
	}

	public void setCustomer_category(String customer_category) {
		this.customer_category = customer_category;
	}

}
