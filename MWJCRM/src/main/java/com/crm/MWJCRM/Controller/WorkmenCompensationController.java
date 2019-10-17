package com.crm.MWJCRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.MWJCRM.Model.WorkmenCompensation;
import com.crm.MWJCRM.Service.WorkmenCompensationService;

@RestController
@RequestMapping("/workmencompensation")
public class WorkmenCompensationController {

	@Autowired
	private WorkmenCompensationService workmencompensationservice;

	@PostMapping("/save")
	public ResponseEntity<WorkmenCompensation> saveWorkmenCompensation(
			@RequestBody WorkmenCompensation workmencompensaton) {
		WorkmenCompensation compensation = workmencompensationservice.saveWorkmenCompensation(workmencompensaton);
		return new ResponseEntity<WorkmenCompensation>(compensation, HttpStatus.OK);
	}
}
