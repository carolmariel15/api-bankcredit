package com.nttdata.api.bankcredit.dao;

import com.nttdata.api.bankcredit.document.BankCredit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IBankCreditDAO extends ReactiveMongoRepository<BankCredit, String> {
	
	public Flux<BankCredit> findByCodeClient(String codeClient);
	public Flux<BankCredit> findByCodeClientAndTypeAccountId(String codeClient, Integer typeAccountId);

}
