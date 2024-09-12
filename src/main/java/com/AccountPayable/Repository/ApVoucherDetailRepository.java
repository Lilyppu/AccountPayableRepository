package com.AccountPayable.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ApVoucherDetail;
import com.AccountPayable.Models.ApVoucherDetailCompKey;

@Repository
public interface ApVoucherDetailRepository extends JpaRepository<ApVoucherDetail, ApVoucherDetailCompKey> {
	public List<ApVoucherDetail> findByApVouDetVouNbr(String apVouDetVouNbr);
	
	public Optional<ApVoucherDetail> findByApVouDetVouNbrAndApVouDetVouSeqNo(String apVouDetVouNbr, Integer apVouDetVouSeqNo);
}
