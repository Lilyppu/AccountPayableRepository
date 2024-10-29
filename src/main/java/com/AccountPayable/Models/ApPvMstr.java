package com.AccountPayable.Models;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "ap_pv_mstr")
public class ApPvMstr {

	@Id
	@Column(name="pv_no", length=20, nullable = false)
	private String apPvMstrPvNo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pv_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apPvMstrPvDate;
	
	@Column(name="pv_office", length=20)
	private String apPvMstrPvOffice;
	
	@Column(name="pv_descr", length=100)
	private String apPvMstrPvDescr;
	
	@Column(name="pv_type", length=20)
	private String apPvMstrPvType;
	
	@Column(name="pv_trn_type", length=20)
	private String apPvMstrPvTrnType;
	
	@Column(name="pv_reff_no", length=20)
	private String apPvMstrPvReffNo;
	
	@Column(name="pv_reff_rv", length=20)
	private String apPvMstrPvReffRv;
	
	@Column(name="pv_ad_type", length=10)
	private String apPvMstrPvAdType;
	
	@Column(name="pv_ad_code", length=20)
	private String apPvMstrPvAdCode;
	
	@Column(name="pv_ad_bank", length=10)
	private String apPvMstrPvAdBank;
	
	@Column(name="pv_paid_via", length=10)
	private String apPvMstrPvPaidVia;
	
	@Column(name="pv_bank_accnt", length=20)
	private String apPvMstrPvBankAccnt;
	
	@Column(name="pv_bank_code", length=10)
	private String apPvMstrPvBankCode;
	
	@Column(name="pv_gl_accnt", length=20)
	private String apPvMstrPvGlAccnt;
	
	@Column(name="ac_acc", length=20)
	private String apPvMstrAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String apPvMstrAcSub;
	
	@Column(name="ac_cc", length=20)
	private String apPvMstrAcCc;
	
	@Column(name="ac_pl", length=20)
	private String apPvMstrAcPl;
	
	@Column(name="ac_pj", length=20)
	private String apPvMstrAcPj;
	
	@Column(name="pv_curr", length=10)
	private String apPvMstrPvCurr;
	
	@Column(name="pv_tot_amt")
	private BigDecimal apPvMstrPvTotAmt;
	
	@Column(name="pv_reff_um", length=20)
	private String apPvMstrPvReffUm;
	
	@Column(name="pv_amt_um")
	private BigDecimal apPvMstrPvAmtUm;
	
	@Column(name="pv_paid_id", length=20)
	private String apPvMstrPvPaidId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pv_paid_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apPvMstrPvPaidDate;
	
	@Column(name="pv_paid_stat", length=20)
	private String apPvMstrPvPaidStat;
	
	@Column(name="pv_doc_no", length=20)
	private String apPvMstrPvDocNo;
	
	@Column(name="pv_print_ctr")
	private Integer apPvMstrPvPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String apPvMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apPvMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apPvMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apPvMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apPvMstrAcDateUpd;
}
