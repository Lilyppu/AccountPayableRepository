package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ItPoMaster;

@Repository
public interface ItPoMasterRepository extends JpaRepository<ItPoMaster, String> {

}
