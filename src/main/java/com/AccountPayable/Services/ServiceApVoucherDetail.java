package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ApVoucherDetail;
import com.AccountPayable.Repository.ApVoucherDetailRepository;

@Service
public class ServiceApVoucherDetail {
	@Autowired
	ApVoucherDetailRepository repoApVoucherDetail;
	
	public List<ApVoucherDetail> getListVoucherDetailByVouNbr(String apVouDetVouNbr) {
		return repoApVoucherDetail.findByApVouDetVouNbr(apVouDetVouNbr);
	}
	
	public Optional<ApVoucherDetail> getVoucherDetailById(String apVouDetVouNbr, Integer apVouDetVouSeqNo) {
		return repoApVoucherDetail.findByApVouDetVouNbrAndApVouDetVouSeqNo(apVouDetVouNbr, apVouDetVouSeqNo);
	}
}
