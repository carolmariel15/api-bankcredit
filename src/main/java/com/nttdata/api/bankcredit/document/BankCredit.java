package com.nttdata.api.bankcredit.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "bank_credit")
public class BankCredit {
	
	@Id
	private String id;
	private String codeClient;
	private Currency currency;
	private TypeCredit typeCredit;
	private Date requestDate;
	private Date startDate;
	private double amount;
	private Integer fee;
}
