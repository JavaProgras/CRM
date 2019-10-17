package com.crm.MWJCRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.MWJCRM.Model.Leads;
import com.crm.MWJCRM.Service.LeadsService;

@RestController
@RequestMapping("/leads")
public class LeadsController {

	@Autowired
	private LeadsService lservice;

	@PostMapping("/save")
	public Leads saveLead(@RequestBody Leads leads) {
		return lservice.saveLead(leads);
	}

}
