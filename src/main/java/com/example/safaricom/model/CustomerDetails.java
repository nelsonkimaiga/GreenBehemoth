package com.example.safaricom.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "tbl_customer_details")
public class CustomerDetails {
	//primary key
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) 
		@Column(name = "customerid")
		private long customerId;
		
		@Column(name = "surname")
		private String userSurname;
		
		@Column(name = "firstname")
		private String firstName;
		
		@Column(name  = "second_name")
		private String secondName;
		
		@Column(name = "id_number")
		private long idNumber;
		
		@Column(name = "phone_number")
		private long phoneNumber;
		
		@Column (name  = "reg_date")
		@JsonFormat(pattern = "dd/MM/yyyy")
		private Date regDate;
		
		@Column(name = "status")
		private String userStatus;

		
		//getters and setters
		public long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(long customerId) {
			this.customerId = customerId;
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

		public long getIdNumber() {
			return idNumber;
		}

		public void setIdNumber(long idNumber) {
			this.idNumber = idNumber;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Date getRegDate() {
			return regDate;
		}

		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}

		public String getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}

		@Override
		public String toString() {
			return "CustomerDetails [customerId=" + customerId + ", userSurname=" + userSurname + ", firstName="
					+ firstName + ", secondName=" + secondName + ", idNumber=" + idNumber + ", phoneNumber="
					+ phoneNumber + ", regDate=" + regDate + ", userStatus=" + userStatus + "]";
		}
		
}
