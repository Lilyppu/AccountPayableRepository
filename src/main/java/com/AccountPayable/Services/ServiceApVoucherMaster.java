package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ApVoucherMaster;
import com.AccountPayable.Repository.ApVoucherMasterRepository;

@Service
public class ServiceApVoucherMaster {
	
	@Autowired
	ApVoucherMasterRepository repoApVoucherMaster;
	
	public List<ApVoucherMaster> getListApVoucherMaster() {
		return repoApVoucherMaster.findAll();
	}
	
	public ApVoucherMaster getApVoucherMasterById(String voucherNbr) {
		Optional<ApVoucherMaster> apVoucherMaster = repoApVoucherMaster.findById(voucherNbr);
		return apVoucherMaster.get();
	}
}
