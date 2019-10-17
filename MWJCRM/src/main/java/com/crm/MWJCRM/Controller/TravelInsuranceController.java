package com.crm.MWJCRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.MWJCRM.Model.TravelInsurance;
import com.crm.MWJCRM.Service.TravelInsuranceService;

@RestController
@RequestMapping("/travelinsurance")
public class TravelInsuranceController {

	@Autowired
	private TravelInsuranceService travelinsuranceservice;

	@PostMapping("/save")
	public ResponseEntity<TravelInsurance> saveTravelInsurance(@RequestBody TravelInsurance travelinsurance) {
		TravelInsurance insurance = travelinsuranceservice.saveTravelInsurance(travelinsurance);
		return new ResponseEntity<TravelInsurance>(insurance, HttpStatus.OK);
	}
}
