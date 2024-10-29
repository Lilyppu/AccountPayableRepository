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
@Table(name = "ap_type_mstr")
public class ApTypeMstr {

	@Id
	@Column(name="trn_type", length=20, nullable = false)
	private String ApTypeMstrTrnType;
	
	@Column(name="trn_descr", length=50)
	private String ApTypeMstrTrnDescr;
	
	@Column(name="ap_acc", length=20)
	private String ApTypeMstrApAcc;
	
	@Column(name="auto_trans", length=1)
	private String ApTypeMstrAutoTrans;
	
	@Column(name="ac_type1", length=20)
	private String ApTypeMstrAcType1;
	
	@Column(name="ac_type2", length=20)
	private String ApTypeMstrAcType2;
	
	@Column(name="ac_type3", length=20)
	private String ApTypeMstrAcType3;
	
	@Column(name="ac_type4", length=20)
	private String ApTypeMstrAcType4;
	
	@Column(name="ac_type5", length=20)
	private String ApTypeMstrAcType5;
	
	@Column(name="auto_doc", length=1)
	private String ApTypeMstrAutoDoc;
	
	@Column(name="auto_ver", length=1)
	private String ApTypeMstrAutoVer;
	
	@Column(name="auto_apr", length=1)
	private String ApTypeMstrAutoApr;
	
	@Column(name="journal_on_approve", length=1)
	private String ApTypeMstrJournalOnApprove;
	
	@Column(name="auto_paid", length=1)
	private String ApTypeMstrAutoPaid;
	
	@Column(name="ac_status", length=2)
	private String ApTypeMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String ApTypeMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date ApTypeMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String ApTypeMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date ApTypeMstrAcDateUpd;
}
