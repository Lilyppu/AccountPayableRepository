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
@Table(name = "supplier")
public class Supplier {

	@Id
	@Column(name="po_nbr", length=15, nullable = false)
	private String supCode;
	
	@Column(name="sup_name", length=80)
	private String supName;
	
	@Column(name="sup_alias", length=10)
	private String supAlias;
	
	@Column(name="sup_hutang")
	private BigDecimal sup_hutang;
	
	@Column(name="sup_bank", length=60)
	private String supBank;
	
	@Column(name="sup_rekening", length=30)
	private String supRekening;
	
	@Column(name="sup_npwp_nib", length=30)
	private String supNpwpNib;
	
	@Column(name="sup_address", length=100)
	private String supAddress;
	
	@Column(name="sup_disc_code", length=20)
	private String supDiscCode;
	
	@Column(name="sup_blok", length=200)
	private String supBlok;
	
	@Column(name="sup_nomor", length=20)
	private String supNomor;
	
	@Column(name="sup_rt", length=5)
	private String supRt;
	
	@Column(name="sup_rw", length=5)
	private String supRw;
	
	@Column(name="sup_kelurahan", length=100)
	private String supKelurahan;
	
	@Column(name="sup_kecamatan", length=100)
	private String supKecamatan;
	
	@Column(name="sup_kota", length=100)
	private String supKota;
	
	@Column(name="sup_propinsi", length=100)
	private String supPropinsi;
	
	@Column(name="sup_kode_pos", length=8)
	private String supKodePos;
	
	@Column(name="sup_no_telp", length=20)
	private String supNoTelp;
	
	@Column(name="sup_no_fax", length=20)
	private String supNoFax;
	
	@Column(name="sup_email", length=100)
	private String supEmail;
	
	@Column(name="sup_contact_person", length=100)
	private String supContactPerson;
	
	@Column(name="sup_type", length=3)
	private String supType;
	
	@Column(name="sup_create_user", length=15)
	private String supCreateUser;
	
	@Column(name="sup_create_date")
	private Date supCreateDate;
	
	@Column(name="sup_update_user", length=15)
	private String supUpdateUser;
	
	@Column(name="sup_update_date")
	private Date supUpdateDate;
}
