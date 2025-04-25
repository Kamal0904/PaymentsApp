package com.kamal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kamal.entity.BankAccEntity;
import com.kamal.entity.UserEntity;
import com.kamal.service.BankAccService;
import com.kamal.service.TransactionService;
import com.kamal.service.UserService;



import jakarta.servlet.http.HttpSession;
@Controller

public class DashboardController {

	
		
		@Autowired
		UserService userService;
		
		@Autowired
		BankAccService bankService;
		
		@Autowired
		TransactionService txnService;
		
		@GetMapping("/send-money")
		public String sendMoneyPage(HttpSession session,Model model) {
			int userId=(int) session.getAttribute("userId");
			UserEntity user=userService.getUserById(userId);
			List<BankAccEntity> userBankAccs=bankService.getBankAccByUserID(user);
			model.addAttribute("bankAccs", userBankAccs);
			return "sendMoney";
		}
		
		@PostMapping("/send-money")
		public String sendMoney(
				@RequestParam(name="amount") double amount,
				@RequestParam(name="from") String fromAccNo,
				@RequestParam(name="toType") String toType,
				@RequestParam(name="toAccount") String toAccount,
				HttpSession session,Model model) {
			int userId=(int)session.getAttribute("userId");
			boolean success=bankService.sendMoney(fromAccNo, toAccount, amount);
			if(success) {
				txnService.recordTxn(userId, toType, amount, toAccount);
			}
			return "redirect:/dashboard";
		}
		
		
		@RequestMapping("/add-bank-account")
		public String addBankAccount() {
			return "addBankAcc";
		}
		
		
		@RequestMapping("/statement-req")
		public String editBankAccount() {
			return "statementReq";
		}
		
	}


