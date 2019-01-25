package com.example.safaricom.model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tbl_main_transactions")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class MainTransactions {
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "uuid")
	private long uuId;
	
	@Column(name = "request_id")
	private String requestId;
	
	@Column(name = "reciept")
	private double transactionReciept = Math.random(); //Receipt generator
	
	@Column(name = "party_a")
	private String partyA;
	
	@Column(name = "party_b")
	private String partyB;
	
	@Column(name = "amount")
	@Size(min=0, max=70000, message = "Maximum amount allowed in one transaction is Kshs. 70,000")
	private String transactionAmount;
	
	@Column(name = "date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date transactionDate;
	
	@Column(name = "status")
	private String transactionStatus;
	
	@Column(name = "charge")
	private int transactionCharge;

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

	public double getTransactionReciept() {
		return transactionReciept;
	}

	public void setTransactionReciept(int transactionReciept) {
		this.transactionReciept = transactionReciept;
	}

	public String getPartyA() {
		return partyA;
	}

	public void setPartyA(String partyA) {
		this.partyA = partyA;
	}

	public String getPartyB() {
		return partyB;
	}

	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public int getTransactionCharge() {
		return transactionCharge;
	}

	public void setTransactionCharge(int transactionCharge) {
		this.transactionCharge = transactionCharge;
	}

	@Override
	public String toString() {
		return "MainTransactions [uuId=" + uuId + ", requestId=" + requestId + ", transactionReciept="
				+ transactionReciept + ", partyA=" + partyA + ", partyB=" + partyB + ", transactionAmount="
				+ transactionAmount + ", transactionDate=" + transactionDate + ", transactionStatus="
				+ transactionStatus + ", transactionCharge=" + transactionCharge + "]";
	}

		
}
