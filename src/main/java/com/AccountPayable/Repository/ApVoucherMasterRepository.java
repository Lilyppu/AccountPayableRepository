package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ApVoucherMaster;

@Repository
public interface ApVoucherMasterRepository extends JpaRepository<ApVoucherMaster, String> {

}
