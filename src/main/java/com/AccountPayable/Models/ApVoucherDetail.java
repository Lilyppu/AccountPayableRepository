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
@Table(name = "AP_VOU_DET")
@IdClass(ApVoucherDetailCompKey.class)
public class ApVoucherDetail {
	
	@Id
	@Column(name="vou_nbr", length=20, nullable = false)
	private String apVouDetVouNbr;
	
	@Id
	@Column(name="vou_seq_no", nullable = false)
	private Integer apVouDetVouSeqNo;
	
	@Column(name="por_nbr", length=20, nullable = false)
	private String apVouDetPorNbr;
	
	@Column(name="por_seq_no", nullable = false)
	private Integer apVouDetPorSeqNo;
	
	@Column(name="po_it_code", length=20)
	private String apVouDetPoItCode;
	
	@Column(name="po_descr", length=200)
	private String apVouDetPoDescr;
	
	@Column(name="ac_off_dest", length=20)
	private String apVouDetAcOffDest;
	
	@Column(name="ac_acc", length=20)
	private String apVouDetAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String apVouDetAcSub;
	
	@Column(name="ac_cc", length=20)
	private String apVouDetAcCc;
	
	@Column(name="ac_pl", length=20)
	private String apVouDetAcPl;
	
	@Column(name="ac_pj", length=20)
	private String apVouDetAcPj;
	
	@Column(name="ac_db_cr", length=1)
	private String apVouDetAcDbCr;
	
	@Column(name="po_outs_qty_rcv")
	private Integer apVouDetPoOutsQtyRcv;
	
	@Column(name="po_qty_vou")
	private Integer apVouDetPoQtyVou;
	
	@Column(name="po_it_um", length=10)
	private String apVouDetPoItUm;
	
	@Column(name="po_price")
	private BigDecimal apVouDetPoPrice;
	
	@Column(name="po_grs_amt")
	private BigDecimal apVouDetPoGrsAmt;
	
	@Column(name="po_disc_pct")
	private BigDecimal apVouDetPoDiscPct;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal apVouDetPoDiscPctTotal;
	
	@Column(name="po_disc_amt")
	private BigDecimal apVouDetPoDiscAmt;
	
	@Column(name="po_net_amt")
	private BigDecimal apVouDetPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal apVouDetPoBaseTaxAmt;
	
	@Column(name="po_vat_code", length=10)
	private String apVouDetPoVatCode;
	
	@Column(name="po_vat_pct")
	private BigDecimal apVouDetPoVatPct;
	
	@Column(name="po_vat_amt")
	private BigDecimal apVouDetPoVatAmt;
	
	@Column(name="po_tax_code", length=10)
	private String apVouDetPoTaxCode;
	
	@Column(name="po_tax_pct")
	private BigDecimal apVouDetPoTaxPct;
	
	@Column(name="po_tax_amt")
	private BigDecimal apVouDetPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal apVouDetPoNetAftTax;
	
	@Column(name="ac_status", length=2)
	private String apVouDetAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apVouDetAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apVouDetAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apVouDetAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apVouDetAcDateUpd;
}
