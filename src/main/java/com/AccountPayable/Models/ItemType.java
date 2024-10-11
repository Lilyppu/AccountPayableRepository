package com.AccountPayable.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item_type")
public class ItemType {
	@Id
	@Column(name="itty_id", nullable = false)
	private Integer ittyId;
	
	@Column(name="itty_desc", length=80)
	private String ittyDesc;
	
	@Column(name="itty_create_user", length=15)
	private String ittyCreateUser;
	
	@Column(name="itty_create_date")
	private Date ittyCreateDate;
	
	@Column(name="itty_update_user", length=15)
	private String ittyUpdateUser;
	
	@Column(name="itty_update_date")
	private Date ittyUpdateDate;
}
