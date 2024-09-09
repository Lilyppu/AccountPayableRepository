package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Models.ItPoDetailCompKey;
import com.AccountPayable.Repository.ItPoDetailRepository;

public class ServiceItPoDetail {
	@Autowired
	ItPoDetailRepository repoItPoDetail;
	
	public List<ItPoDetail> getListItPoDetailByPoNbr(String poNbr) {
		return repoItPoDetail.getListItPoDetailByPoNbr(poNbr);
	}
	
	public ItPoDetail getItPoDetailById(ItPoDetailCompKey Id) {
		Optional<ItPoDetail> itPoDetail = repoItPoDetail.findById(Id);
		return itPoDetail.get();
	}
	
}
