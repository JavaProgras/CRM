package com.crm.MWJCRM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.MWJCRM.Model.WorkmenCompensation;
import com.crm.MWJCRM.Repository.WorkmenCompensationRepository;

@Service
public class WorkmenCompensationServiceImpl implements WorkmenCompensationService {
	@Autowired
	private WorkmenCompensationRepository workmencompensationrepository;

	@Override
	public WorkmenCompensation saveWorkmenCompensation(WorkmenCompensation workmencompensation) {
		return workmencompensationrepository.save(workmencompensation);
	}
}
