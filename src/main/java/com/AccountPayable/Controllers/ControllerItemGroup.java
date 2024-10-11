package com.AccountPayable.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AccountPayable.Models.ItemGroup;
import com.AccountPayable.Services.ServiceItemGroup;

@RestController
public class ControllerItemGroup {
	@Autowired
	ServiceItemGroup serviceItemGroup;
	
	@GetMapping("/AccountPayable/getlistitemgroup")
	public List<ItemGroup> getListItemGroup() {
		return serviceItemGroup.getListItemGroup();
	}
	
	@GetMapping("/AccountPayable/getitemgroupbyid")
	public ItemGroup getItemGroupById(Integer itgrId) {
		return serviceItemGroup.getItemGroupById(itgrId);
	}
	
	@PostMapping("/AccountPayable/saveitemgroup")
	public String saveItemGroup(@RequestBody ItemGroup itemgroup) {
		return serviceItemGroup.saveItemGroup(itemgroup);
	}
	
	@DeleteMapping("/AccountPayable/deleteitemgroup")
	public String deleteItemGroup(Integer itgrId) {
		return serviceItemGroup.deleteItemGroup(itgrId);
	}
}
