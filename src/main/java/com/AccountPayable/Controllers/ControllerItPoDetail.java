package com.AccountPayable.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Services.ServiceItPoDetail;

@RestController
public class ControllerItPoDetail {
	@Autowired
	ServiceItPoDetail serviceItPoDetail;
	
	@GetMapping("/AccountPayable/getlistitpodetail")
	public List<ItPoDetail> getListItPoDetailByPoNbr(String poNbr) {
		return serviceItPoDetail.getListItPoDetailByPoNbr(poNbr);
	}
	
	@GetMapping("/AccountPayable/getitpodetail")
	public ItPoDetail getItPoDetailById(String ItPoDetPoNbr, Integer ItPoDetPoSeqNo) {
		
		return serviceItPoDetail.getItPoDetailById(ItPoDetPoNbr, ItPoDetPoSeqNo);
	}
}
