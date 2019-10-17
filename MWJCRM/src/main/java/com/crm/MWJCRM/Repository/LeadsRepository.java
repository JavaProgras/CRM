package com.crm.MWJCRM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.MWJCRM.Model.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Integer> {

}
