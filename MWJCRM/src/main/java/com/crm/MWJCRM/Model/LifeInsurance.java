package com.crm.MWJCRM.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "lifeinsurance")
public class LifeInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nominee_name;
	private Date premium_due_date;
	private String paymentmode;
	private String nominee_relation;
	private String plan_name;

	public LifeInsurance() {

	}

	public LifeInsurance(int id, String nominee_name, Date premium_due_date, String paymentmode,
			String nominee_relation, String plan_name) {
		super();
		this.id = id;
		this.nominee_name = nominee_name;
		this.premium_due_date = premium_due_date;
		this.paymentmode = paymentmode;
		this.nominee_relation = nominee_relation;
		this.plan_name = plan_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNominee_name() {
		return nominee_name;
	}

	public void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}

	public Date getPremium_due_date() {
		return premium_due_date;
	}

	public void setPremium_due_date(Date premium_due_date) {
		this.premium_due_date = premium_due_date;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public String getNominee_relation() {
		return nominee_relation;
	}

	public void setNominee_relation(String nominee_relation) {
		this.nominee_relation = nominee_relation;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

}
