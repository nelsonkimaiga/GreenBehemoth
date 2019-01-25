package com.example.safaricom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.safaricom.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Long>{

}
