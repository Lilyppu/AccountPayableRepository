package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.ItemType;
import com.AccountPayable.Repository.ItemTypeRepository;

@Service
public class ServiceItemType {
	@Autowired
	ItemTypeRepository repoItemType;
	
	public List<ItemType> getListItemType() {
		return repoItemType.findAll();
	}
	
	public ItemType getItemTypeById(Integer ittyId) {
		Optional<ItemType> itemType = repoItemType.findById(ittyId);
		return itemType.get();
	}
	
	public String saveItemType(ItemType itemType) {
		repoItemType.save(itemType);
		return "Save Successfully";
	}
	
	public String deleteItemType(Integer ittyId) {
		repoItemType.deleteById(ittyId);
		return "Delete Successfully";
	}
}
