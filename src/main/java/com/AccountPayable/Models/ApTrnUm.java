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
@Table(name = "ap_trn_um")
public class ApTrnUm {

	@Column(name="vou_ad_code", length=20)
	private String apTrnUmVouAdCode;
	
	@Column(name="reff_nbr", length=20)
	private String apTrnUmReffNbr;
	
	@Temporal(TemporalType.DATE)
	@Column(name="reff_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnUmReffDate;
	
	@Column(name="curr", length=20)
	private String apTrnUmCurr;
	
	@Column(name="um_amt")
	private BigDecimal apTrnUmUmAmt;
	
	@Column(name="used_um_amt_temp")
	private BigDecimal apTrnUmUsedUmAmtTemp;
	
	@Column(name="used_um_amt")
	private BigDecimal apTrnUmUsedUmAmt;
	
	@Column(name="this_month_used_um_amt")
	private BigDecimal apTrnUmThisMonthUsedUmAmt;
	
	@Column(name="last_used_amt")
	private BigDecimal apTrnUmLastUsedAmt;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_used_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date apTrnUmLastUsedDate;
	
	@Column(name="last_used_doc_nbr", length=20)
	private String apTrnUmLastUsedDocNbr;
	
	@Column(name="ac_ent", length=20)
	private String apTrnUmAcEnt;
	
	@Column(name="ac_off", length=20)
	private String apTrnUmAcOff;
	
	@Column(name="ac_acc", length=20)
	private String apTrnUmAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String apTrnUmAcSub;
	
	@Column(name="ac_cc", length=20)
	private String apTrnUmAcCc;
	
	@Column(name="ac_pl", length=20)
	private String apTrnUmAcPl;
	
	@Column(name="ac_pj", length=20)
	private String apTrnUmAcPj;
	
	@Column(name="ac_status", length=2)
	private String apTrnUmAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apTrnUmAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apTrnUmAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apTrnUmAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apTrnUmAcDateUpd;
}
