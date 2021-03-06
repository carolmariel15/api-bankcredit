package com.nttdata.api.bankcredit.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped.Nullable;

import java.util.Date;

@Getter
@Setter
@Document(collection = "bankcredit")
public class BankCredit {
	
	@Id
	private String id;
	private String codeClient;
	private Currency currency;
	private TypeAccount typeAccount;
	@Nullable
	private Date requestDate;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date startDate;
	private Integer payDays;
	private Integer feeDue;
	private double amount;
	private Integer fee;
}
