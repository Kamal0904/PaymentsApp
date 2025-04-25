package com.kamal.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamal.entity.TransactionsEntity;
import com.kamal.repository.BankAccRepository;
import com.kamal.repository.TransactionsRepositary;


@Service
public class TransactionService {
	
	@Autowired
	TransactionsRepositary txnDAO;
	
	@Autowired
	BankAccRepository bankDAO;
	
	public List<TransactionsEntity> getTxnsByUser(int userId) {
		List<TransactionsEntity> userTxns=txnDAO.findBySourceId(userId);
		return userTxns;
	}
	
	public void recordTxn(int userId,String toType,double amount,String toAccount) {
		int targetId=bankDAO.findByAccountNumber(toAccount).get().getUser().getUserId();
		TransactionsEntity txn=new TransactionsEntity();
		txn.setDestinationType(toType);
		txn.setSourceType("BA");
		txn.setTransactionAmount(BigDecimal.valueOf(amount));
		txn.setSourceId(userId);
		txn.setTransactionDateTime(LocalDateTime.now());
		txn.setTargetId(targetId);
		
		txnDAO.save(txn);
		
	}
}
