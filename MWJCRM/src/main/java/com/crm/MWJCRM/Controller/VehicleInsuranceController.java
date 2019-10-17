package com.crm.MWJCRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.MWJCRM.Model.VehicleInsurance;
import com.crm.MWJCRM.Service.VehicleInsuranceService;

@RestController
@RequestMapping("/vehicleinsurance")
public class VehicleInsuranceController {

	@Autowired
	private VehicleInsuranceService vehicleinsuranceservice;

	@PostMapping("/save")
	public ResponseEntity<VehicleInsurance> saveLifeInsurance(@RequestBody VehicleInsurance vehicleinsurace) {
		VehicleInsurance insurance = vehicleinsuranceservice.saveVehicleInsurance(vehicleinsurace);
		return new ResponseEntity<VehicleInsurance>(insurance, HttpStatus.OK);
	}
}
