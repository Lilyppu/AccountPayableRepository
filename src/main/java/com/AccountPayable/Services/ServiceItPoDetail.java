package com.AccountPayable.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Repository.ItPoDetailRepository;

@Service
public class ServiceItPoDetail {
	
	@Autowired
	ItPoDetailRepository repoItPoDetail;
	
	public List<ItPoDetail> getListAllItPoDetail() {
		return repoItPoDetail.findAll();
	}
	
	public List<ItPoDetail> getListItPoDetailByPoNbr(String itPoDetPoNbr) {
		return repoItPoDetail.findByItPoDetPoNbr(itPoDetPoNbr);
	}
	
	public ItPoDetail getListItPoDetailById(String itPoDetPoNbr, Integer itPoDetPoSeqNo) {
		return repoItPoDetail.findByItPoDetPoNbrAndItPoDetPoSeqNo(itPoDetPoNbr, itPoDetPoSeqNo).get();
	}
	
	public String saveUpdatePoDetail(ItPoDetail itPoDetail) {
		repoItPoDetail.save(itPoDetail);
		return "Save Successfully";
	}
	
	public String deletePoDetail(String itPoDetPoNbr, Integer itPoDetPoSeqNo) {
		repoItPoDetail.deletePoDetailById(itPoDetPoNbr, itPoDetPoSeqNo);
		return "Delete Successfully";
	}
	
	public Integer getMaxSeqPoDetail(String po_nbr) {
		return repoItPoDetail.getMaxSeqPoDetail(po_nbr);
	}
}
