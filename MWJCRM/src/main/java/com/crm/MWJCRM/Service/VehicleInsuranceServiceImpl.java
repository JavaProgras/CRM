package com.crm.MWJCRM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.MWJCRM.Model.VehicleInsurance;
import com.crm.MWJCRM.Repository.VehicleInsuranceRepository;

@Service
public class VehicleInsuranceServiceImpl implements VehicleInsuranceService {

	@Autowired
	private VehicleInsuranceRepository vehicleinsurancerepository;

	@Override
	public VehicleInsurance saveVehicleInsurance(VehicleInsurance vehiicleinsurance) {
		return vehicleinsurancerepository.save(vehiicleinsurance);
	}

}
