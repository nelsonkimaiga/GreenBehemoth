package com.example.safaricom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.safaricom.model.Subtransactions;

public interface SubTransactionsRepository extends JpaRepository <Subtransactions, Long> {

}
