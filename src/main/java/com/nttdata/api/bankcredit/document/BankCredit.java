package com.nttdata.api.bankcredit.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "bankcredit")
public class BankCredit {
	
	@Id
	private String id;
	private TypeCredit typeCredit;
	private Transaction transaction;

}
