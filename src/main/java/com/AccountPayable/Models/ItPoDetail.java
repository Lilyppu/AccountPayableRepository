package com.AccountPayable.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "it_po_det")
@IdClass(ItPoDetailCompKey.class)
public class ItPoDetail {
	
	@Id
	@Column(name="po_nbr", length=20, nullable = false)
	private String itPoDetPoNbr;
	
	@Id
	@Column(name="po_seq_no", nullable = false)
	private Integer itPoDetPoSeqNo;
	
	@Column(name="po_it_code", length=20)
	private String itPoDetPoItCode;
	
	@Column(name="po_descr", length=200)
	private String itPoDetPoDescr;
	
	@Column(name="ac_off_dest", length=20)
	private String itPoDetAcOffDest;
	
	@Column(name="ac_acc", length=20)
	private String itPoDetAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String itPoDetAcSub;
	
	@Column(name="ac_cc", length=20)
	private String itPoDetAcCc;
	
	@Column(name="ac_pl", length=20)
	private String itPoDetAcPl;
	
	@Column(name="ac_pj", length=20)
	private String itPoDetAcPj;
	
	@Column(name="ac_db_cr", length=1)
	private String itPoDetAcDbCr;
	
	@Column(name="po_qty_req")
	private Integer itPoDetPoQtyReq;
	
	@Column(name="po_qty_odr")
	private Integer itPoDetPoQtyOdr;
	
	@Column(name="po_it_um", length=10)
	private String itPoDetPoItUm;
	
	@Column(name="po_price")
	private BigDecimal itPoDetPoPrice;
	
	@Column(name="po_grs_amt")
	private BigDecimal itPoDetPoGrsAmt;
	
	@Column(name="po_disc_pct")
	private BigDecimal itPoDetPoDiscPct;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal itPoDetPoDiscPctTotal;
	
	@Column(name="po_disc_amt")
	private BigDecimal itPoDetPoDiscAmt;
	
	@Column(name="po_net_amt")
	private BigDecimal itPoDetPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal itPoDetPoBaseTaxAmt;
	
	@Column(name="po_vat_code", length=10)
	private String itPoDetPoVatCode;
	
	@Column(name="po_vat_pct")
	private BigDecimal itPoDetPoVatPct;
	
	@Column(name="po_vat_amt")
	private BigDecimal itPoDetPoVatAmt;
	
	@Column(name="po_tax_code", length=10)
	private String itPoDetPoTaxCode;
	
	@Column(name="po_tax_pct")
	private BigDecimal itPoDetPoTaxPct;
	
	@Column(name="po_tax_amt")
	private BigDecimal itPoDetPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal itPoDetPoNetAftTax;
	
	@Column(name="po_qty_rcv")
	private Integer itPoDetPoQtyRcv;
	
	@Column(name="po_qty_ret")
	private Integer itPoDetPoQtyRet;
	
	@Column(name="ac_status", length=2)
	private String itPoDetAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String itPoDetAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date itPoDetAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String itPoDetAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date itPoDetAcDateUpd;
}
