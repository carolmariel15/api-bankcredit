package com.nttdata.api.bankcredit.document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
	
	private Integer id;
	private String description;
	private TypeTransaction typeTransaction;

}
