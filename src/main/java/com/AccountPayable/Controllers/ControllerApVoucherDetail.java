package com.AccountPayable.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ApVoucherDetail;
import com.AccountPayable.Services.ServiceApVoucherDetail;

@RestController
public class ControllerApVoucherDetail {
	@Autowired
	ServiceApVoucherDetail serviceApVoucherDetail;
	
	@GetMapping("/AccountPayable/getlistvoucherdetail")
	public List<ApVoucherDetail> getListVoucherDetailByVouNbr(String apVouDetVouNbr) {
		return serviceApVoucherDetail.getListVoucherDetailByVouNbr(apVouDetVouNbr);
	}
	
	@GetMapping("/AccountPayable/getvoucherdetailbyid")
	public Optional<ApVoucherDetail> getVoucherDetailById(String apVouDetVouNbr, Integer apVouDetVouSeqNo) {
		return serviceApVoucherDetail.getVoucherDetailById(apVouDetVouNbr, apVouDetVouSeqNo);
	}
}
