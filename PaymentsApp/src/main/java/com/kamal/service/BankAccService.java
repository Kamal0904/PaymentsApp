package com.kamal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamal.entity.BankAccEntity;
import com.kamal.entity.UserEntity;
import com.kamal.repository.BankAccRepository;



@Service
public class BankAccService {
	
	@Autowired
	BankAccRepository bankAccDAO;
 	
	public List<BankAccEntity> getBankAccByUserID(UserEntity user) {
		List<BankAccEntity> bankAccs=bankAccDAO.findByUser(user);
		return bankAccs;
	}
	
	public boolean addBankAccount(BankAccEntity bankAcc) {
		BankAccEntity savedBankAcc= bankAccDAO.save(bankAcc);
		
		if(savedBankAcc!=null) {
			return true;
		}
		
		return false;
	}
	
	@Transactional
	public boolean sendMoney(String fromAccNo,String toAccNo,double amount) {
		
		BankAccEntity sender=bankAccDAO.findByAccountNumber(fromAccNo).orElseThrow(() -> new RuntimeException("sender account not found"));
		
		if(sender.getBalance() < amount) {
			return false;
		}
		
		BankAccEntity receiver = bankAccDAO.findByAccountNumber(toAccNo).orElseThrow(() -> new RuntimeException("Receiver account not found"));

		sender.setBalance(sender.getBalance() - amount);
	    receiver.setBalance(receiver.getBalance() + amount);
	     
		return true;
		
	}
}