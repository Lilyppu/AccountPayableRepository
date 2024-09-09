package com.AccountPayable.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItPoDetailCompKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private String ItPoDetPoNbr;
	
	@SuppressWarnings("unused")
	private Integer ItPoDetPoSeqNo;
}
