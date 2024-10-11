package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ItemType;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {

}
