package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.Items;
import com.AccountPayable.Services.ServiceItems;

@RestController
public class ControllerItems {
	@Autowired
	ServiceItems serviceItems;
	
	@GetMapping("/AccountPayable/getlistitems")
	public List<Items> getListItems() {
		return serviceItems.getListItems();
	}
	
	@GetMapping("/AccountPayable/getitemsbyid")
	public Items getItemsById(Integer itemId) {
		return serviceItems.getItemsById(itemId);
	}
	
	@PostMapping("/AccountPayable/saveitems")
	public String saveItems(@RequestBody Items items) {
		return serviceItems.saveItems(items);
	}
	
	@DeleteMapping("/AccountPayable/deleteitems")
	public String deleteItems(Integer itemId) {
		return serviceItems.deleteItems(itemId);
	}
}
