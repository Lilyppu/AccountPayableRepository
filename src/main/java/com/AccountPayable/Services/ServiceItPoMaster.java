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
	
	public ItPoMaster getItPoMasterById(String itPoMstrPoNbr) {
		Optional<ItPoMaster> itPoMaster = repoItPoMaster.findById(itPoMstrPoNbr);
		return itPoMaster.get();
	}
	
	public String saveUpdatePoMaster(ItPoMaster itPoMaster) {
		repoItPoMaster.save(itPoMaster);
		return "Save Successfully";
	}
	
	public String deletePoMaster(String itPoMstrPoNbr) {
		repoItPoMaster.deleteById(itPoMstrPoNbr);
		return "Delete Successfully";
	}
}
