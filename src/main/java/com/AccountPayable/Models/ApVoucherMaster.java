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
	private String ApVouMstrNbr;
	
	@Column(name="vou_date")
	private Date ApVouMstrDate;
	
	@Column(name="vou_remarks", length=20)
	private String ApVouMstrRemarks;
	
	@Column(name="vou_it_type", length=20)
	private String ApVouMstrTtType;
	
	@Column(name="vou_office", length=20)
	private String ApVouMstrOffice;
	
	@Column(name="vou_trn_type", length=20)
	private String ApVouMstrTrnType;
	
	@Column(name="po_nbr", length=20)
	private String ApVouMstrPoNbr;
	
	@Column(name="reff_deposit", length=20)
	private String ApVouMstrReffDeposit;
	
	@Column(name="journal_on_approve", length=1)
	private String ApVouMstrJournalOnApprove;
	
	@Column(name="po_vat_paid_by_buyer", length=1)
	private String ApVouMstrPoVatPaidByBuyer;
	
	@Column(name="po_tax_paid_by_supplier", length=1)
	private String ApVouMstrPoTaxPaidBySupplier;
	
	@Column(name="paid_by_ho", length=1)
	private String ApVouMstrPaidByHo;
	
	@Column(name="paid_via_bank", length=1)
	private String ApVouMstrPaidViaBank;
	
	@Column(name="paid_auto", length=1)
	private String ApVouMstrPaidAuto;
	
	@Column(name="pv_bank", length=20)
	private String ApVouMstrPvBank;
	
	@Column(name="pv_bank_acct", length=30)
	private String ApVouMstrPvBankAcct;
	
	@Column(name="vou_ad_type", length=10)
	private String ApVouMstrAdType;
	
	@Column(name="vou_ad_code", length=20)
	private String ApVouMstrAdCode;
	
	@Column(name="po_term")
	private Integer ApVouMstrPoTerm;
	
	@Column(name="vou_due_date")
	private Date ApVouMstrDueDate;
	
	@Column(name="ad_bank", length=20)
	private String ApVouMstrAdBank;
	
	@Column(name="ad_bank_acc", length=30)
	private String ApVouMstrAdBankAcc;
	
	@Column(name="ad_acc_name", length=50)
	private String ApVouMstrAdAccName;
	
	@Column(name="ad_bank_branch", length=50)
	private String ApVouMstrAdBankBranch;
	
	@Column(name="po_entity", length=20)
	private String ApVouMstrPoEntity;
	
	@Column(name="po_office", length=20)
	private String ApVouMstrPoOffice;
	
	@Column(name="po_curr", length=10)
	private String ApVouMstrPoCurr;
	
	@Column(name="po_grs_amt")
	private BigDecimal ApVouMstrPoGrsAmt;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal ApVouMstrPoDiscPctTotal;
	
	@Column(name="po_net_amt")
	private BigDecimal ApVouMstrPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal ApVouMstrPoBaseTaxAmt;
	
	@Column(name="po_vat_amt")
	private BigDecimal ApVouMstrPoVatAmt;
	
	@Column(name="po_tax_amt")
	private BigDecimal ApVouMstrPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal ApVouMstrPoNetAftTax;
	
	@Column(name="po_reff_um", length=20)
	private String ApVouMstrPoReffUm;
	
	@Column(name="po_um_amt")
	private BigDecimal ApVouMstrPoUmAmt;
	
	@Column(name="po_net_aft_um")
	private BigDecimal ApVouMstrPoNetAftUm;
	
	@Column(name="po_doccheck_id", length=20)
	private String ApVouMstrPoDoccheckId;
	
	@Column(name="po_doccheck_date")
	private Date ApVouMstrPoDoccheckDate;
	
	@Column(name="po_doccheck_stat", length=2)
	private String ApVouMstrPoDoccheckStat;
	
	@Column(name="po_verify_id", length=20)
	private String ApVouMstrPoVerifyId;
	
	@Column(name="po_verify_date")
	private Date ApVouMstrPoVerifyDate;
	
	@Column(name="po_verify_stat", length=2)
	private String ApVouMstrPoVerifyStat;
	
	@Column(name="po_approve_id", length=20)
	private String ApVouMstrPoApproveId;
	
	@Column(name="po_approve_date")
	private Date ApVouMstrPoApproveDate;
	
	@Column(name="po_approve_stat", length=2)
	private String ApVouMstrPoApproveStat;
	
	@Column(name="po_paid_id", length=20)
	private String ApVouMstrPoPaidId;
	
	@Column(name="po_paid_date")
	private Date ApVouMstrPoPaidDate;
	
	@Column(name="po_paid_stat", length=2)
	private String ApVouMstrPoPaidStat;
	
	@Column(name="pv_no", length=20)
	private String ApVouMstrPvNo;
	
	@Column(name="pv_doc_no", length=20)
	private String ApVouMstrPvDocNo;
	
	@Column(name="pv_procedure_name", length=200)
	private String ApVouMstrPvProcedureName;
	
	@Column(name="po_print_ctr")
	private Integer ApVouMstrPoPrintCtr;
	
	@Column(name="ac_status", length=2)
	private String ApVouMstrAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String ApVouMstrAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date ApVouMstrAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String ApVouMstrAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date ApVouMstrAcDateUpd;
}
