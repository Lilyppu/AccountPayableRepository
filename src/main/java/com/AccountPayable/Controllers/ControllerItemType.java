package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ItemType;
import com.AccountPayable.Services.ServiceItemType;

@RestController
public class ControllerItemType {
	@Autowired
	ServiceItemType serviceItemType;
	
	@GetMapping("/AccountPayable/getlistitemtype")
	public List<ItemType> getListItemType() {
		return serviceItemType.getListItemType();
	}
	
	@GetMapping("/AccountPayable/getitemtypebyid")
	public ItemType getItemTypeById(Integer ittyId) {
		return serviceItemType.getItemTypeById(ittyId);
	}
	
	@PostMapping("/AccountPayable/saveitemtype")
	public String saveItemType(@RequestBody ItemType itemType) {
		return serviceItemType.saveItemType(itemType);
	}
	
	@DeleteMapping("/AccountPayable/deleteitemtype")
	public String deleteItemType(Integer ittyId) {
		return serviceItemType.deleteItemType(ittyId);
	}
}
