package ictcg.com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import ictcg.com.entities.TransactionFinance;

@Component
public interface TransactionFinanceService {
	
	List<TransactionFinance> findAllTransact();
	TransactionFinance getFirstTransaction ();

}
