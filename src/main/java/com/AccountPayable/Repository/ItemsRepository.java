package com.AccountPayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AccountPayable.Models.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
