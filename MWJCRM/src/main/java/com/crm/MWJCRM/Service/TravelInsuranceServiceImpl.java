package com.crm.MWJCRM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.MWJCRM.Model.TravelInsurance;
import com.crm.MWJCRM.Repository.TravelInsuranceRepository;

@Service
public class TravelInsuranceServiceImpl implements TravelInsuranceService {

	@Autowired
	private TravelInsuranceRepository travelinsurancerepository;

	@Override
	public TravelInsurance saveTravelInsurance(TravelInsurance travelinsurance) {
		return travelinsurancerepository.save(travelinsurance);
	}

}
