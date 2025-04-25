package com.kamal.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "user_account_details")
public class UserAccEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_account_id")
    private Integer userAccountId;

    @Column(name = "account_open_date")
    @Temporal(TemporalType.DATE)
    private Date accountOpenDate;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @Column(name = "current_wallet_balance", precision = 10, scale = 2)
    private BigDecimal currentWalletBalance;

    @Column(name = "wallet_pin")
    private String walletPin;

    @Column(name = "linked_bank_accounts_count")
    private Integer linkedBankAccountsCount;

	public Integer getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(Integer userAccountId) {
		this.userAccountId = userAccountId;
	}

	public Date getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public BigDecimal getCurrentWalletBalance() {
		return currentWalletBalance;
	}

	public void setCurrentWalletBalance(BigDecimal currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}

	public String getWalletPin() {
		return walletPin;
	}

	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}

	public Integer getLinkedBankAccountsCount() {
		return linkedBankAccountsCount;
	}

	public void setLinkedBankAccountsCount(Integer linkedBankAccountsCount) {
		this.linkedBankAccountsCount = linkedBankAccountsCount;
	}
    
}
