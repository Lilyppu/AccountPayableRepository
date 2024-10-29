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
@Table(name = "ap_pv_det")
public class ApPvDet {

	@Id
	@Column(name="pv_no", length=20, nullable = false)
	private String apPvDetPvNo;
	
	@Id
	@Column(name="pv_seq_no")
	private Integer apPvDetPvSeqNo;
	
	@Column(name="reff_nbr", length=20)
	private String apPvDetReffNbr;
	
	@Column(name="vou_descr", length=20)
	private String apPvDetVouDescr;
	
	@Column(name="vou_outs_amt")
	private BigDecimal apPvDetVouOutsAmt;
	
	@Column(name="half_full_payment", length=20)
	private String apPvDetHalfFullPayment;
	
	@Column(name="ac_off_dest", length=20)
	private String apPvDetAcOffDest;
	
	@Column(name="ac_acc", length=20)
	private String apPvDetAcAcc;
	
	@Column(name="ac_sub", length=20)
	private String apPvDetAcSub;
	
	@Column(name="ac_cc", length=20)
	private String apPvDetAcCc;
	
	@Column(name="ac_pl", length=20)
	private String apPvDetAcPl;
	
	@Column(name="ac_pj", length=20)
	private String apPvDetAcPj;
	
	@Column(name="ac_db_cr", length=20)
	private String apPvDetAcDbCr;
	
	@Column(name="vou_pv_amt")
	private BigDecimal apPvDetVouPvAmt;
	
	@Column(name="pv_vat_code", length=20)
	private String apPvDetPvVatCode;
	
	@Column(name="pv_vat_pct")
	private BigDecimal apPvDetPvVatPct;
	
	@Column(name="pv_tot_amt")
	private BigDecimal apPvDetPvVatAmt;
	
	@Column(name="pv_tax_code", length=10)
	private String apPvDetPvTaxCode;
	
	@Column(name="pv_tax_pct")
	private BigDecimal apPvDetPvTaxPct;
	
	@Column(name="pv_tax_amt")
	private BigDecimal apPvDetPvTaxAmt;
	
	@Column(name="pv_net_aft_tax")
	private BigDecimal apPvDetPvNetAftTax;
	
	@Column(name="ac_status", length=2)
	private String apPvDetAcStatus;
	
	@Column(name="ac_user_cre", length=15)
	private String apPvDetAcUserCre;
	
	@Column(name="ac_date_cre")
	private Date apPvDetAcDateCre;
	
	@Column(name="ac_user_upd", length=15)
	private String apPvDetAcUserUpd;
	
	@Column(name="ac_date_upd")
	private Date apPvDetAcDateUpd;
}
