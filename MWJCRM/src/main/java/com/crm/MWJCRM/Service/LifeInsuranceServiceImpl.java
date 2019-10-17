package com.crm.MWJCRM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.MWJCRM.Model.LifeInsurance;
import com.crm.MWJCRM.Repository.LifeInsuranceRepository;

@Service
public class LifeInsuranceServiceImpl implements LifeInsuranceService {

	@Autowired
	private LifeInsuranceRepository lifeinsurancerepository;

	@Override
	public LifeInsurance savelifeinsurances(LifeInsurance lifeinsurance) {
		return lifeinsurancerepository.save(lifeinsurance);
	}

}
