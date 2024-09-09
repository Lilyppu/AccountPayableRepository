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
	private String ItPoDetPoNbr;
	
	@Id
	@Column(name="po_seq_no", nullable = false)
	private Integer ItPoDetPoSeqNo;
	
	@Column(name="po_it_code", length=20)
	private String ItPoDetPoItCode;
	
	@Column(name="po_descr", length=200)
	private String ItPoDetPoDescr;
	
	@Column(name="ac_off_dest", length=20)
	private String ItPoDetAcOffDest;
	
	@Column(name="ac_acc", length=20)
	private String ItPoDetAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String ItPoDetAcSub;
	
	@Column(name="ac_cc", length=20)
	private String ItPoDetAcCc;
	
	@Column(name="ac_pl", length=20)
	private String ItPoDetAcPl;
	
	@Column(name="ac_pj", length=20)
	private String ItPoDetAcPj;
	
	@Column(name="ac_db_cr", length=1)
	private String ItPoDetAcDbCr;
	
	@Column(name="po_qty_req")
	private Integer ItPoDetPoQtyReq;
	
	@Column(name="po_qty_odr")
	private Integer ItPoDetPoQtyOdr;
	
	@Column(name="po_it_um", length=10)
	private String ItPoDetPoItUm;
	
	@Column(name="po_price")
	private BigDecimal ItPoDetPoPrice;
	
	@Column(name="po_grs_amt")
	private BigDecimal ItPoDetPoGrsAmt;
	
	@Column(name="po_disc_pct")
	private BigDecimal ItPoDetPoDiscPct;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal ItPoDetPoDiscPctTotal;
	
	@Column(name="po_disc_amt")
	private BigDecimal ItPoDetPoDiscAmt;
	
	@Column(name="po_net_amt")
	private BigDecimal ItPoDetPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal ItPoDetPoBaseTaxAmt;
	
	@Column(name="po_vat_code", length=10)
	private String ItPoDetPoVatCode;
	
	@Column(name="po_vat_pct")
	private BigDecimal ItPoDetPoVatPct;
	
	@Column(name="po_vat_amt")
	private BigDecimal ItPoDetPoVatAmt;
	
	@Column(name="po_tax_code", length=10)
	private String ItPoDetPoTaxCode;
	
	@Column(name="po_tax_pct")
	private BigDecimal ItPoDetPoTaxPct;
	
	@Column(name="po_tax_amt")
	private BigDecimal ItPoDetPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal ItPoDetPoNetAftTax;
	
	@Column(name="po_qty_rcv")
	private Integer ItPoDetPoQtyRcv;
	
	@Column(name="po_qty_ret")
	private Integer ItPoDetPoQtyRet;
	
	@Column(name="ac_status", length=2)
	private String ItPoDetAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String ItPoDetAcUserCre;
	
	@Column(name="ac_date_upd")
	private Date ItPoDetAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String ItPoDetAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date ItPoDetAcDateUpd;
}
