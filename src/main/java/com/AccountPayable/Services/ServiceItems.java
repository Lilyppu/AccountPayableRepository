package com.AccountPayable.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountPayable.Models.Items;
import com.AccountPayable.Repository.ItemsRepository;

@Service
public class ServiceItems {
	@Autowired
	ItemsRepository repoItems;
	
	public List<Items> getListItems() {
		return repoItems.findAll();
	}
	
	public Items getItemsById(Integer itemId) {
		Optional<Items> items = repoItems.findById(itemId);
		return items.get();
	}
	
	public String saveItems(Items items) {
		repoItems.save(items);
		return "Save Successfully";
	}
	
	public String deleteItems(Integer itemId) {
		repoItems.deleteById(itemId);
		return "Delete Successfully";
	}
}
