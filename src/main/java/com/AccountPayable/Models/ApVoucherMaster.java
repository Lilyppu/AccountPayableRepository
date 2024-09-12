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
@Table(name = "AP_VOU_MSTR")
public class ApVoucherMaster {
	@Id
	@Column(name="vou_nbr", length=20, nullable = false)
	private String apVouMstrNbr;
	
	@Column(name="vou_date")
	private Date apVouMstrDate;
	
	@Column(name="vou_remarks", length=200)
	private String apVouMstrRemarks;
	
	@Column(name="vou_it_type", length=20)
	private String apVouMstrItType;
	
	@Column(name="vou_office", length=20)
	private String apVouMstrOffice;
	
	@Column(name="vou_trn_type", length=20)
	private String apVouMstrTrnType;
	
	@Column(name="po_nbr", length=20)
	private String apVouMstrPoNbr;
	
	@Column(name="reff_deposit", length=20)
	private String apVouMstrReffDeposit;
	
	@Column(name="journal_on_approve", length=1)
	private String apVouMstrJournalOnApprove;
	
	@Column(name="po_vat_paid_by_buyer", length=1)
	private String apVouMstrPoVatPaidByBuyer;
	
	@Column(name="po_tax_paid_by_supplier", length=1)
	private String apVouMstrPoTaxPaidBySupplier;
	
	@Column(name="paid_by_ho", length=1)
	private String apVouMstrPaidByHo;
	
	@Column(name="paid_via_bank", length=1)
	private String apVouMstrPaidViaBank;
	
	@Column(name="paid_auto", length=1)
	private String apVouMstrPaidAuto;
	
	@Column(name="pv_bank", length=20)
	private String apVouMstrPvBank;
	
	@Column(name="pv_bank_acct", length=30)
	private String apVouMstrPvBankAcct;
	
	@Column(name="vou_ad_type", length=10)
	private String apVouMstrAdType;
	
	@Column(name="vou_ad_code", length=20)
	private String apVouMstrAdCode;
	
	@Column(name="po_term")
	private Integer apVouMstrPoTerm;
	
	@Column(name="vou_due_date")
	private Date apVouMstrDueDate;
	
	@Column(name="ad_bank", length=20)
	private String apVouMstrAdBank;
	
	@Column(name="ad_bank_acc", length=30)
	private String apVouMstrAdBankAcc;
	
	@Column(name="ad_acc_name", length=50)
	private String apVouMstrAdAccName;
	
	@Column(name="ad_bank_branch", length=50)
	private String apVouMstrAdBankBranch;
	
	@Column(name="po_entity", length=20)
	private String apVouMstrPoEntity;
	
	@Column(name="po_office", length=20)
	private String apVouMstrPoOffice;
	
	@Column(name="po_curr", length=10)
	private String apVouMstrPoCurr;
	
	@Column(name="po_grs_amt")
	private BigDecimal apVouMstrPoGrsAmt;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal apVouMstrPoDiscPctTotal;
	
	@Column(name="po_net_amt")
	private BigDecimal apVouMstrPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal apVouMstrPoBaseTaxAmt;
	
	@Column(name="po_vat_amt")
	private BigDecimal apVouMstrPoVatAmt;
	
	@Column(name="po_tax_amt")
	private BigDecimal apVouMstrPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal apVouMstrPoNetAftTax;
	
	@Column(name="po_reff_um", length=20)
	private String apVouMstrPoReffUm;
	
	@Column(name="po_um_amt")
	private BigDecimal apVouMstrPoUmAmt;
	
	@Column(name="po_net_aft_um")
	private BigDecimal apVouMstrPoNetAftUm;
	
	@Column(name="po_doccheck_id", length=20)
	private String apVouMstrPoDoccheckId;
	
	@Column(name="po_doccheck_date")
	private Date apVouMstrPoDoccheckDate;
	
	@Column(name="po_doccheck_stat", length=2)
	private String apVouMstrPoDoccheckStat;
	
	@Column(name="po_verify_id", length=20)
	private String apVouMstrPoVerifyId;
	
	@Column(name="po_verify_date")
	private Date apVouMstrPoVerifyDate;
	
	@Column(name="po_verify_stat", length=2)
	private String apVouMstrPoVerifyStat;
	
	@Column(name="po_approve_id", length=20)
	private String apVouMstrPoApproveId;
	
	@Column(name="po_approve_date")
	private Date apVouMstrPoApproveDate;
	
	@Column(name="po_approve_stat", length=2)
	private String apVouMstrPoApproveStat;
	
	@Column(name="po_paid_id", length=20)
	private String apVouMstrPoPaidId;
	
	@Column(name="po_paid_date")
	private Date apVouMstrPoPaidDate;
	
	@Column(name="po_paid_stat", length=2)
	private String apVouMstrPoPaidStat;
	
	@Column(name="pv_no", length=20)
	private String apVouMstrPvNo;
	
	@Column(name="pv_doc_no", length=20)
	private String apVouMstrPvDocNo;
	
	@Column(name="pv_procedure_name", length=200)
	private String apVouMstrPvProcedureName;
	
	@Column(name="po_print_ctr")
	private Integer apVouMstrPoPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String apVouMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apVouMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apVouMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apVouMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apVouMstrAcDateUpd;
}
