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
@Table(name = "it_por_det")
public class ItPorDet {

	@Id
	@Column(name="por_nbr", length=20, nullable = false)
	private String itPorDetPorNbr;
	
	@Id
	@Column(name="por_seq_no", nullable = false)
	private Integer itPorDetPorSeqNo;
	
	@Column(name="po_nbr", length=20)
	private String itPorDetPoNbr;
	
	@Column(name="po_seq_no")
	private Integer itPorDetPoSeqNo;
	
	@Column(name="por_sub_lot", length=20)
	private String itPorDetPorSubLot;
	
	@Column(name="po_it_code", length=20)
	private String itPorDetPoItCode;
	
	@Column(name="po_descr", length=200)
	private String itPorDetPoDescr;
	
	@Column(name="ac_off_dest", length=20)
	private String itPorDetAcOffDest;
	
	@Column(name="ac_acc", length=20)
	private String itPorDetAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String itPorDetAcSub;
	
	@Column(name="ac_cc", length=20)
	private String itPorDetCcCc;
	
	@Column(name="ac_pl", length=20)
	private String itPorDetac_pl;
	
	@Column(name="ac_pj", length=20)
	private String itPorDetAcPj;
	
	@Column(name="ac_db_cr", length=1)
	private String itPorDetac_db_cr;
	
	@Column(name="po_outs_qty_odr")
	private Integer itPorDetPoOutsQtyOdr;
	
	@Column(name="po_qty_rcv")
	private Integer itPorDetPoQtyRcv;
	
	@Column(name="po_it_um", length=10)
	private String itPorDetPoItUm;
	
	@Column(name="po_price")
	private BigDecimal itPorDetPoPrice;
	
	@Column(name="po_grs_amt")
	private BigDecimal itPorDetPoGrsAmt;
	
	@Column(name="po_disc_pct")
	private BigDecimal itPorDetPoDiscPct;
	
	@Column(name="po_disc_pct_total")
	private BigDecimal itPorDetPoDiscPctTotal;
	
	@Column(name="po_disc_amt")
	private BigDecimal itPorDetPoDiscAmt;
	
	@Column(name="po_net_amt")
	private BigDecimal itPorDetPoNetAmt;
	
	@Column(name="po_base_tax_amt")
	private BigDecimal itPorDetPoBaseTaxAmt;
	
	@Column(name="po_vat_code", length=10)
	private String itPorDetPoVatCode;
	
	@Column(name="po_vat_pct")
	private BigDecimal itPorDetPoVatPct;
	
	@Column(name="po_vat_amt")
	private BigDecimal itPorDetPoVatAmt;
	
	@Column(name="po_tax_code", length=10)
	private String itPorDetPoTaxCode;
	
	@Column(name="po_tax_pct")
	private BigDecimal itPorDetPoTaxPct;
	
	@Column(name="po_tax_amt")
	private BigDecimal itPorDetPoTaxAmt;
	
	@Column(name="po_net_aft_tax")
	private BigDecimal itPorDetPoNetAftTax;
	
	@Column(name="po_qty_vou")
	private BigDecimal itPorDetPoQtyVou;
	
	@Column(name="ac_status", length=2)
	private String itPorDetAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String itPorDetAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date itPorDetAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String itPorDetAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date itPorDetAcDateUpd;

}
