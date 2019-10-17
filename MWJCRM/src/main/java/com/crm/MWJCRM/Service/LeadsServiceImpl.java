package com.crm.MWJCRM.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.MWJCRM.Model.Leads;
import com.crm.MWJCRM.Repository.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {

	@Autowired
	private LeadsRepository lrepo;

	@Override
	public Leads saveLead(Leads leads) {
		List<Leads> list = lrepo.findAll();
		for (Leads lead : list) {
			if (lead.getOffice_no().equalsIgnoreCase(leads.getOffice_no())) {
				System.out.println("sorry u have entered invalid no");
				break;
			}
		}

		return lrepo.save(leads);
	}

}
