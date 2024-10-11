package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.ItemGroup;

@Repository
public interface ItemGroupRepository extends JpaRepository<ItemGroup, Integer> {

}
