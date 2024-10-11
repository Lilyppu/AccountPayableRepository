package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ItemGroup;
import com.AccountPayable.Repository.ItemGroupRepository;

@Service
public class ServiceItemGroup {
	@Autowired
	ItemGroupRepository repoItemGroup;
	
	public List<ItemGroup> getListItemGroup() {
		return repoItemGroup.findAll();
	}
	
	public ItemGroup getItemGroupById(Integer itgrId) {
		Optional<ItemGroup> itemGroup = repoItemGroup.findById(itgrId);
		return itemGroup.get();
	}
	
	public String saveItemGroup(ItemGroup itemGroup) {
		repoItemGroup.save(itemGroup);
		return "Save Successfully";
	}
	
	public String deleteItemGroup(Integer itgrId) {
		repoItemGroup.deleteById(itgrId);
		return "Delete Successfully";
	}
}
