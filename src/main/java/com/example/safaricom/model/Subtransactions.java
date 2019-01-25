package com.example.safaricom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tbl_subtransactions")
public class Subtransactions {
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "uuid")
	private long uuId;
	
	@Column(name = "request_id")
	private String requestId;
	
	@Column(name = "reciept")
	private String transactionReciept;
	
	@Column(name = "phone")
	private long userPhone;
	
	@Column(name = "amount")
	private String transactionAmount;
	
	@Column(name = "amount_type")
	private String amountType;
	
	@Column(name = "type")
	private String transactionType;

	//getters and setters
	public long getUuId() {
		return uuId;
	}

	public void setUuId(long uuId) {
		this.uuId = uuId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransactionReciept() {
		return transactionReciept;
	}

	public void setTransactionReciept(String transactionReciept) {
		this.transactionReciept = transactionReciept;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Subtransactions [uuId=" + uuId + ", requestId=" + requestId + ", transactionReciept="
				+ transactionReciept + ", userPhone=" + userPhone + ", transactionAmount=" + transactionAmount
				+ ", amountType=" + amountType + ", transactionType=" + transactionType + "]";
	}
	
	
}
