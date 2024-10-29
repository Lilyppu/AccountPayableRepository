package com.AccountPayable.Models;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ap_trn_mstr")
public class ApTrnMstr {

	@Column(name="vou_ad_code", length=20)
	private String apTrnMstrVouAdCode;
	
	@Column(name="vou_ad_type", length=10)
	private String apTrnMstrVouAdType;
	
	@Column(name="vou_ad_bank", length=20)
	private String apTrnMstrVouAdBank;
	
	@Column(name="vou_office", length=20)
	private String apTrnMstrVouOffice;
	
	@Column(name="ac_acc", length=20)
	private String apTrnMstrAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String apTrnMstrAcSub;
	
	@Column(name="vou_nbr", length=20)
	private String apTrnMstrVouNbr;
	
	@Temporal(TemporalType.DATE)
	@Column(name="vou_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnMstrVouDate;
	
	@Column(name="vou_remarks", length=200)
	private String apTrnMstrVouRemarks;
	
	@Column(name="vou_trn_type", length=20)
	private String apTrnMstrVouTrnType;
	
	@Column(name="journal_on_approve", length=1)
	private String apTrnMstrJournalOnApprove;
	
	@Temporal(TemporalType.DATE)
	@Column(name="approve_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnMstrApproveDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="due_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnMstrDueDate;
	
	@Column(name="vou_curr", length=10)
	private String apTrnMstrVouCurr;
	
	@Column(name="vou_amt")
	private BigDecimal apTrnMstrVouAmt;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_pv_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnMstrLastPvDate;
	
	@Column(name="last_pv_no", length=20)
	private String apTrnMstrLastPvNo;
	
	@Column(name="last_pv_amt")
	private BigDecimal apTrnMstrLastPvAmt;
	
	@Column(name="his_month_pv_amt")
	private BigDecimal apTrnMstrThisMonthPvAmt;
	
	@Column(name="ytd_pv_amt")
	private BigDecimal apTrnMstrYtdPvAmt;
	
	@Column(name="vou_outs_amt")
	private BigDecimal apTrnMstrVouOutsAmt;
	
	@Column(name="ac_status", length=2)
	private String apTrnMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apTrnMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apTrnMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apTrnMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apTrnMstrAcDateUpd;
}
