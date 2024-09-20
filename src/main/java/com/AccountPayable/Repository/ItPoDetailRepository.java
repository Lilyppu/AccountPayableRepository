package com.AccountPayable.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ItPoDetail;
import com.AccountPayable.Models.ItPoDetailCompKey;

import jakarta.transaction.Transactional;

@Repository
public interface ItPoDetailRepository extends JpaRepository<ItPoDetail, ItPoDetailCompKey> {
	
	public List<ItPoDetail> findByItPoDetPoNbr(String itPoDetPoNbr);
	
	public Optional<ItPoDetail> findByItPoDetPoNbrAndItPoDetPoSeqNo(String itPoDetPoNbr, Integer itPoDetPoSeqNo);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM it_po_det p WHERE p.po_nbr = ?1 AND p.po_seq_no = ?2", nativeQuery = true)
    int deletePoDetailById(String po_nbr, Integer seq_no);
}
