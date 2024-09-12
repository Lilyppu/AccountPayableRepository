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
	private String itPoMstrPoNbr;
	
	@Column(name="po_date")
	private Date itPoMstrPoDate;
	
	@Column(name="po_remarks", length=200)
	private String itPoMstrPoRemarks;
	
	@Column(name="po_it_type", length=20)
	private String itPoMstrPoItType;
	
	@Column(name="po_office", length=20)
	private String itPoMstrPoOffice;
	
	@Column(name="po_site", length=20)
	private String itPoMstrPoSite;
	
	@Column(name="reff_nbr", length=20)
	private String itPoMstrReffNbr;
	
	@Column(name="po_vat_paid_by_buyer", length=1)
	private String itPoMstrPoVatPaidByBuyer;
	
	@Column(name="po_tax_paid_by_supplier", length=1)
	private String itPoMstrPoTaxPaidBySupplier;
	
	@Column(name="po_ad_type", length=10)
	private String itPoMstrPoAdType;
	
	@Column(name="po_ad_code", length=20)
	private String itPoMstrPoAdCode;
	
	@Column(name="po_term")
	private Integer itPoMstrPoTerm;
	
	@Column(name="po_entity", length=20)
	private String itPoMstrPoEntity; 
	
	@Column(name="po_curr", length=10)
	private String itPoMstrPoCurr;
	
	@Column(name="po_grs_amt")
	private BigDecimal itPoMstrPoGrsAmt; 
	
	@Column(name="po_disc_pct_total")
	private BigDecimal itPoMstrPoDiscPctTotal; 
	
	@Column(name="po_net_amt")
	private BigDecimal itPoMstrPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal itPoMstrPoBaseTaxAmt; 
	
	@Column(name="po_vat_amt")
	private BigDecimal itPoMstrPoVatAmt;
	
	@Column(name="po_tax_amt")
	private BigDecimal itPoMstrPoTaxAmt; 
	
	@Column(name="po_net_aft_tax")
	private BigDecimal itPoMstrPoNetAftTax; 
	
	@Column(name="po_reff_um", length=20)
	private String itPoMstrPoReffUm;
	
	@Column(name="po_um_amt")
	private BigDecimal itPoMstrPoUmAmt;
	
	@Column(name="po_net_aft_um")
	private BigDecimal itPoMstrPoNetAftUm; 
	
	@Column(name="po_approve_id", length=20)
	private String itPoMstrPoApproveId;
	
	@Column(name="po_approve_date")
	private Date itPoMstrPoApproveDate; 
	
	@Column(name="po_approve_stat", length=2)
	private String itPoMstrPoApproveStat; 
	
	@Column(name="po_print_ctr")
	private Integer itPoMstrPoPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String itPoMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String itPoMstrAcUserCre; 
	
	@Column(name="ac_date_cre")
	private Date itPoMstrAcDateCre; 
	
	@Column(name="ac_user_upd", length=15)
	private String itPoMstrAcUseUpd; 
	
	@Column(name="ac_date_upd")
	private Date itPoMstrAcDateUpd;
}
