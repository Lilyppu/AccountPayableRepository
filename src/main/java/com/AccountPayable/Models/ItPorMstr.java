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
@Table(name = "it_por_mstr")
public class ItPorMstr {
	@Id
	@Column(name="por_nbr", length=20, nullable = false)
	private String itPorMstrPorNbr;
	
	@Temporal(TemporalType.DATE)
	@Column(name="por_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date itPorMstrPorDate;
	
	@Column(name="por_remarks", length=200)
	private String itPorMstrPorRemarks;
	
	@Column(name="po_it_type", length=20)
	private String itPorMstrPoItType;

	@Column(name="po_office", length=20)
	private String itPorMstrPoOffice;

	@Column(name="po_site", length=20)
	private String itPorMstrPoSite;
	
	@Column(name="po_loc", length=20)
	private String itPorMstrPoLoc;
	
	@Column(name="po_vehicle_no", length=20)
	private String itPorMstrPoVehicleNo;
	
	@Column(name="por_type", length=20)
	private String itPorMstrPorType;
	
	@Column(name="po_nbr", length=20)
	private String itPorMstrPoNbr;
	
	@Column(name="po_vat_paid_by_buyer", length=1)
	private String itPorMstrPoVatPaidByBuyer;
	
	@Column(name="po_tax_paid_by_supplier", length=1)
	private String itPorMstrPoTaxPaidBySupplier;
	
	@Column(name="po_ad_type", length=10)
	private String itPorMstrPoAdType;
	
	@Column(name="po_ad_code", length=20)
	private String itPorMstrPoAdCode;
	
	@Column(name="po_term")
	private Integer itPorMstrPoTerm;
	
	@Column(name="po_entity", length=20)
	private String itPorMstrPoEntity;
	
	@Column(name="po_curr", length=10)
	private String itPorMstrPoCurr;
	
	@Column(name="po_grs_amt")
	private BigDecimal itPorMstrPoGrsAmt;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal itPorMstrPoDiscPctTotal;
	
	@Column(name="po_net_amt")
	private BigDecimal itPorMstrPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal itPorMstrPoBaseTaxAmt;
	
	@Column(name="po_vat_amt")
	private BigDecimal itPorMstrPoVatAmt;
	
	@Column(name="po_tax_amt")
	private BigDecimal itPorMstrPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal itPorMstrPoNetAftTax;
	
	@Column(name="po_reff_um", length=20)
	private String itPorMstrPoReffUm;
	
	@Column(name="po_um_amt")
	private BigDecimal itPorMstrPoUmAmt;
	
	@Column(name="po_net_aft_um")
	private BigDecimal itPorMstrPoNetAftUm;
	
	@Column(name="po_approve_id", length=20)
	private String itPorMstrPoApproveId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="po_approve_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date itPorMstrPoApproveDate;
	
	@Column(name="po_approve_stat", length=2)
	private String itPorMstrPoApproveStat;
	
	@Column(name="po_print_ctr")
	private Integer itPorMstrPoPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String itPorMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String itPorMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date itPoMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String itPorMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date itPoMstrAcDateUpd;

}
