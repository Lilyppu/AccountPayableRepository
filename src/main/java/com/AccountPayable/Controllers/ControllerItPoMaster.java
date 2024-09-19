package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ItPoMaster;
import com.AccountPayable.Services.ServiceItPoMaster;

@RestController
public class ControllerItPoMaster {
	@Autowired
	ServiceItPoMaster serviceItPoMaster;
	
	@GetMapping("/AccountPayable/getlistitpomaster")
	public List<ItPoMaster> getListItPoMaster() {
		return serviceItPoMaster.getListItPoMaster();
	}
	
	@GetMapping("/AccountPayable/getitpomaster")
	public ItPoMaster getItPoMasterById(String itPoMstrPoNbr) {
		return serviceItPoMaster.getItPoMasterById(itPoMstrPoNbr);
	}
	
	@PostMapping("/AccountPayable/insertupdatepomaster")
	public String savePoMaster(@RequestBody ItPoMaster itPoMaster) {
		return serviceItPoMaster.saveUpdatePoMaster(itPoMaster);
	}
	
	@PostMapping("/AccountPayable/deletepomaster")
	public String deletePoMaster(String itPoMstrPoNbr) {
		return serviceItPoMaster.deletePoMaster(itPoMstrPoNbr);
	}
}
