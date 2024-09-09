package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ApVoucherMaster;
import com.AccountPayable.Services.ServiceApVoucherMaster;

@RestController
public class ControllerApVoucherMaster {
	@Autowired
	ServiceApVoucherMaster serviceApVouMaster;
	
	@GetMapping("/AccountPayable/getlistvouchermaster")
	public List<ApVoucherMaster> getListApVoucherMaster() {
		return serviceApVouMaster.getListApVoucherMaster();
	}
	
	@GetMapping("/AccountPayable/getvouchermasterbyid")
	public ApVoucherMaster getApVoucherMasterById(String vouNbr) {
		return serviceApVouMaster.getApVoucherMasterById(vouNbr);
	}
}
