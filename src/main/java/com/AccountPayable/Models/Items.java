package com.AccountPayable.Models;

import java.math.BigDecimal;
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
@Table(name = "items")
public class Items {
	@Id
	@Column(name="item_id", nullable = false)
	private Integer itemId;
	
	@Column(name="item_itgr_id")
	private Integer itemItgrId;
	
	@Column(name="item_itty_id")
	private Integer itemIttyId;
	
	@Column(name="item_desc", length=80)
	private String itemDesc;
	
	@Column(name="item_price")
	private BigDecimal itemPrice;
	
	@Column(name="item_kurs", length=5)
	private String itemKurs;
	
	@Column(name="item_satuan", length=10)
	private String itemSatuan;
	
	@Column(name="item_status", length=2)
	private String itemStatus;
	
	@Column(name="item_create_user", length=15)
	private String itemCreateUser;
	
	@Column(name="item_create_date")
	private Date itemCreateDate;
	
	@Column(name="item_update_user", length=15)
	private String itemUpdateUser;
	
	@Column(name="item_update_date")
	private Date itemUpdateDate;
}
