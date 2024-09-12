package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ItPoMaster;
import com.AccountPayable.Repository.ItPoMasterRepository;

@Service
public class ServiceItPoMaster {

	@Autowired
	ItPoMasterRepository repoItPoMaster;
	
	public List<ItPoMaster> getListItPoMaster() {
		return repoItPoMaster.findAll();
	}
	
	public ItPoMaster getItPoMasterById(String poNbr) {
		Optional<ItPoMaster> itPoMaster = repoItPoMaster.findById(poNbr);
		return itPoMaster.get();
	}
}
