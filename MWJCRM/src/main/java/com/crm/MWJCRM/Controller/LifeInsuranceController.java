package com.crm.MWJCRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.MWJCRM.Model.LifeInsurance;
import com.crm.MWJCRM.Service.LifeInsuranceService;

@RestController
@RequestMapping("/lifeinsurance")
public class LifeInsuranceController {

	@Autowired
	private LifeInsuranceService lifeinsuranceservice;

	@PostMapping("/save")
	public ResponseEntity<LifeInsurance> saveLifeInsurance(@RequestBody LifeInsurance lifeinsurace) {
		LifeInsurance insurance = lifeinsuranceservice.savelifeinsurances(lifeinsurace);
		return new ResponseEntity<LifeInsurance>(insurance, HttpStatus.OK);
	}

}
