package com.AccountPayable.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Models.ItPoDetailCompKey;

public interface ItPoDetailRepository extends JpaRepository<ItPoDetail, ItPoDetailCompKey> {
	
	public List<ItPoDetail> getListItPoDetailByPoNbr(String ItPoDetPoNbr);
	
	public ItPoDetail getItPoDetailByd(String ItPoDetPoNbr, Integer ItPoDetPoSeqNo);
}
