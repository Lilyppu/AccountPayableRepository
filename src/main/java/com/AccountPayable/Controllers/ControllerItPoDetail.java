package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Services.ServiceItPoDetail;

@RestController
public class ControllerItPoDetail {

	@Autowired
	ServiceItPoDetail serviceItPoDetail;
	
	@GetMapping("/AccountPayable/getlistallpodetail")
	public List<ItPoDetail> getListAllItPoDetail() {
		return serviceItPoDetail.getListAllItPoDetail();
	}
	
	@GetMapping("/AccountPayable/getlistpodetailbyponbr")
	public List<ItPoDetail> getListItPoDetailByPoNbr(String itPoDetPoNbr) {
		return serviceItPoDetail.getListItPoDetailByPoNbr(itPoDetPoNbr);
	}
	
	@GetMapping("/AccountPayable/getitpodetail")
	public ItPoDetail getItPoDetailById(String itPoDetPoNbr, Integer itPoDetPoSeqNo) {
		return serviceItPoDetail.getListItPoDetailById(itPoDetPoNbr, itPoDetPoSeqNo);
	}
	
	@PostMapping("/AccountPayable/insertupdatepodetail")
	public String savePoDetail(@RequestBody ItPoDetail itPoDetail) {
		return serviceItPoDetail.saveUpdatePoDetail(itPoDetail);
	}
	
	@GetMapping("/AccountPayable/deletepodetail")
	public String deletePoDetail(String itPoDetPoNbr, Integer itPoDetPoSeqNo) {
		serviceItPoDetail.deletePoDetail(itPoDetPoNbr, itPoDetPoSeqNo);
		return "Delete Successfully";
	}
}
