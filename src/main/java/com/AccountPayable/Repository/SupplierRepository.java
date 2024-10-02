package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String> {

}
