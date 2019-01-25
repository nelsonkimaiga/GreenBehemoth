package com.example.safaricom.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "tbl_business_accounts")
public class BusinessAccount {
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "uuid")
	private long uuId;
	
	@Column(name = "account_no")
	@Length(min = 6, message = "The field must be at least 6 characters")
	private String accountNumber;
	
	@Column(name = "account_name")
	private String accountName;
	
	@Column(name = "status")
	private String accountStatus;
	
	@Column(name = "account_balance")
	private String accountBalance;
	
	@Column(name = "last_activity")
	private String lastActivity;
	
	@Column(name = "created_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date createdDate;

	//getters and setters
	public long getUuId() {
		return uuId;
	}

	public void setUuId(long uuId) {
		this.uuId = uuId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "BusinessAccount [uuId=" + uuId + ", accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", accountStatus=" + accountStatus + ", accountBalance=" + accountBalance + ", lastActivity="
				+ lastActivity + ", createdDate=" + createdDate + "]";
	}
	
}
