package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.Supplier;
import com.AccountPayable.Services.ServiceSupplier;

@RestController
public class ControllerSupplier {

	@Autowired
	ServiceSupplier serviceSupplier;
	
	@GetMapping("/AccountPayable/getlistsupplier")
	public List<Supplier> getListSupplier() {
		return serviceSupplier.getListAllSupplier();
	}
	
	@GetMapping("/AccountPayable/getsupplierbyid")
	public Supplier getSupplierById(String supCode) {
		return serviceSupplier.getSupplierById(supCode);
	}
	
	@PostMapping("/AccountPayable/savesupplier")
	public String saveSupplier(@RequestBody Supplier supplier) {
		return serviceSupplier.saveUpdateSupplier(supplier);
	}
	
	@DeleteMapping("/AccountPayable/deletesupplier")
	public String deleteSupplier(String supCode) {
		return serviceSupplier.deleteSupplier(supCode);
	}
}
