package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.Supplier;
import com.AccountPayable.Repository.SupplierRepository;

@Service
public class ServiceSupplier {

	@Autowired
	SupplierRepository repoSupplier;
	
	public List<Supplier> getListAllSupplier() {
		return repoSupplier.findAll();
	}
	
	public Supplier getSupplierById(String supCode) {
		Optional<Supplier> supplier = repoSupplier.findById(supCode);
		return supplier.get();
	}
	
	public String saveUpdateSupplier(Supplier supplier) {
		repoSupplier.save(supplier);
		return "Save Successfully";
	}
	
	public String deleteSupplier(String supCode) {
		repoSupplier.deleteById(supCode);
		return "Delete Successfully";
	}
}
