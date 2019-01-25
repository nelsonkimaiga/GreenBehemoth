package com.example.safaricom.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_charges") //this is the table to be created by my Hibernate ORM
public class Charges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private long transactionId;
	
	@Column(name = "min")
	private int minimumBal;
	
	@Column(name = "max")
	private int maximumBal;
	
	@Column(name = "withdraw_charge")
	private int withdrawCharge;
	
	@Column(name = "send_to_unregistered")
	private int sendUnregistered;
	
	@Column(name = "send_to_registered")
	private int sendRegistered;

	//generate my getter and setter methods here
	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public int getMinimumBal() {
		return minimumBal;
	}

	public void setMinimumBal(int minimumBal) {
		this.minimumBal = minimumBal;
	}

	public int getMaximumBal() {
		return maximumBal;
	}

	public void setMaximumBal(int maximumBal) {
		this.maximumBal = maximumBal;
	}

	public int getWithdrawCharge() {
		return withdrawCharge;
	}

	public void setWithdrawCharge(int withdrawCharge) {
		this.withdrawCharge = withdrawCharge;
	}

	public int getSendUnregistered() {
		return sendUnregistered;
	}

	public void setSendUnregistered(int sendUnregistered) {
		this.sendUnregistered = sendUnregistered;
	}

	public int getSendRegistered() {
		return sendRegistered;
	}

	public void setSendRegistered(int sendRegistered) {
		this.sendRegistered = sendRegistered;
	}

	@Override
	public String toString() {
		return "Charges [transactionId=" + transactionId + ", minimumBal=" + minimumBal + ", maximumBal=" + maximumBal
				+ ", withdrawCharge=" + withdrawCharge + ", sendUnregistered=" + sendUnregistered + ", sendRegistered="
				+ sendRegistered + "]";
	}	
}
