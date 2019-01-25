package com.example.safaricom.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table (name = "tbl_mobile_wallet")
public class MobileWallet {
	
	//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) 
		@Column(name = "userid")
		private long userId;
		
		@Column(name = "surname")
		private String userSurname;
		
		@Column(name = "firstname")
		private String firstName;
		
		@Column(name  = "secondname")
		private String secondName;
		
		@Column (name  = "reg_date")
		@JsonFormat(pattern = "dd/MM/yyyy")
		private Date regDate;
		
		@Column(name = "account_bal")
		private int accountBalance;
		
		@Column(name = "status")
		private String userStatus;
		
		@Column(name = "last_activity")
		private String lastActivity;
		
		@Column(name = "phone_number")
		private long phoneNumber;
		
		@Column(name = "pin")
		private int userPin;
		
		//getter setter methods

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getUserSurname() {
			return userSurname;
		}

		public void setUserSurname(String userSurname) {
			this.userSurname = userSurname;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}

		public Date getRegDate() {
			return regDate;
		}

		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}

		public int getAccountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(int accountBalance) {
			this.accountBalance = accountBalance;
		}

		public String getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}

		public String getLastActivity() {
			return lastActivity;
		}

		public void setLastActivity(String lastActivity) {
			this.lastActivity = lastActivity;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public int getUserPin() {
			return userPin;
		}

		public void setUserPin(int userPin) {
			this.userPin = userPin;
		}

		@Override
		public String toString() {
			return "MobileWallet [userId=" + userId + ", userSurname=" + userSurname + ", firstName=" + firstName
					+ ", secondName=" + secondName + ", regDate=" + regDate + ", accountBalance=" + accountBalance
					+ ", userStatus=" + userStatus + ", lastActivity=" + lastActivity + ", phoneNumber=" + phoneNumber
					+ ", userPin=" + userPin + "]";
		}
					
		
}
