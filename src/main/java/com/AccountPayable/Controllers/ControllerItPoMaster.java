package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/AccountPayable/getitpomasterbyid")
	public ItPoMaster getItPoMasterById(String poNbr) {
		return serviceItPoMaster.getItPoMasterById(poNbr);
	}
}
