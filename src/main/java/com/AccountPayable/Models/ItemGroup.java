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
@Table(name = "item_group")
public class ItemGroup {
	
	@Id
	@Column(name="itgr_id", nullable = false)
	private Integer itgrId;
	
	@Column(name="itgr_desc", length=80)
	private String itgrDesc;
	
	@Column(name="itgr_create_user", length=15)
	private String itgrCreateUser;
	
	@Column(name="itgr_create_date")
	private Date itgrCreateDate;
	
	@Column(name="itgr_update_user", length=15)
	private String itgrUpdateUser;
	
	@Column(name="itgr_update_date")
	private Date itgrUpdateDate;
}
