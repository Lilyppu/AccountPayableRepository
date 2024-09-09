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
@Table(name = "it_po_mstr")
public class ItPoMaster {
	@Id
	@Column(name="po_nbr", length=20, nullable = false)
	private String ItPoMstrPoNbr;
	
	@Column(name="po_date")
	private Date ItPoMstrPoDate;
	
	@Column(name="po_remarks", length=200)
	private String ItPoMstrPoRemarks;
	
	@Column(name="po_it_type", length=20)
	private String ItPoMstrPoItType;
	
	@Column(name="po_office", length=20)
	private String ItPoMstrPoOffice;
	
	@Column(name="po_site", length=20)
	private String ItPoMstrPoSite;
	
	@Column(name="reff_nbr", length=20)
	private String ItPoMstrReffNbr;
	
	@Column(name="po_vat_paid_by_buyer", length=1)
	private String ItPoMstrPoVatPaidByBuyer;
	
	@Column(name="po_tax_paid_by_supplier", length=1)
	private String ItPoMstrPoTaxPaidBySupplier;
	
	@Column(name="po_ad_type", length=10)
	private String ItPoMstrPoAdType;
	
	@Column(name="po_ad_code", length=20)
	private String ItPoMstrPoAdCode;
	
	@Column(name="po_term")
	private Integer ItPoMstrPoTerm;
	
	@Column(name="po_entity", length=20)
	private String ItPoMstrPoEntity; 
	
	@Column(name="po_curr", length=10)
	private String ItPoMstrPoCurr;
	
	@Column(name="po_grs_amt")
	private BigDecimal ItPoMstrPoGrsAmt; 
	
	@Column(name="po_disc_pct_total")
	private BigDecimal ItPoMstrPoDiscPctTotal; 
	
	@Column(name="po_net_amt")
	private BigDecimal ItPoMstrPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal ItPoMstrPoBaseTaxAmt; 
	
	@Column(name="po_vat_amt")
	private BigDecimal ItPoMstrPoVatAmt;
	
	@Column(name="po_tax_amt")
	private BigDecimal ItPoMstrPoTaxAmt; 
	
	@Column(name="po_net_aft_tax")
	private BigDecimal ItPoMstrPoNetAftTax; 
	
	@Column(name="po_reff_um", length=20)
	private String ItPoMstrPoReffUm;
	
	@Column(name="po_um_amt")
	private BigDecimal ItPoMstrPoUmAmt;
	
	@Column(name="po_net_aft_um")
	private BigDecimal ItPoMstrPoNetAftUm; 
	
	@Column(name="po_approve_id", length=20)
	private String ItPoMstrPoApproveId;
	
	@Column(name="po_approve_date")
	private Date ItPoMstrPoApproveDate; 
	
	@Column(name="po_approve_stat", length=2)
	private String ItPoMstrPoApproveStat; 
	
	@Column(name="po_print_ctr")
	private Integer ItPoMstrPoPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String ItPoMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String ItPoMstrAcUserCre; 
	
	@Column(name="ac_date_cr")
	private Date ItPoMstrAcDateCre; 
	
	@Column(name="ac_user_upd", length=15)
	private String ItPoMstrAcUseUpd; 
	
	@Column(name="ac_date_upd")
	private Date ItPoMstrAcDateUpd;
}
