package com.example.safaricom.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.safaricom.model.MainTransactions;


public interface MainTransactionsRepository extends JpaRepository<MainTransactions, Long> {
	
}
