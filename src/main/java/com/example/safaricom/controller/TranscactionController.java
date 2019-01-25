package com.example.safaricom.controller;

import com.example.safaricom.exception.ResourceNotFoundException;
import com.example.safaricom.model.MainTransactions;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import com.example.safaricom.repository.MainTransactionsRepository;
import com.example.safaricom.repository.CustomerRepository;
import com.example.safaricom.repository.SubTransactionsRepository;
import com.example.safaricom.model.MainTransactions;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import com.example.safaricom.controller.error;

@Controller
@RestController
@RequestMapping("/api")
public class TranscactionController {
	@Autowired
	MainTransactionsRepository maintransactionsRepository;
	CustomerRepository customerRepository;
	SubTransactionsRepository subTransactionsRepository;
    
    // send money to customer
    @RequestMapping(value="/send")
    @ResponseBody
    public MainTransactions sendMoney(@Valid @RequestBody MainTransactions maintransactions, BindingResult bindingResult) {
    	
    	return maintransactionsRepository.save(maintransactions); 
    }
    
    // Get transaction history based on receipt
    @RequestMapping(value="/transactions/{uuid}")
    @ResponseBody
    public MainTransactions getTransactionByReciept(@PathVariable(value = "uuid") Long transactionReciept) {
        return maintransactionsRepository.findById(transactionReciept).orElseThrow(() -> new ResourceNotFoundException("Receipt", "", transactionReciept));
    }
    
    // Get transaction history
    @GetMapping("/transactions/{phone}")
    public MainTransactions getTransactionById(@PathVariable(value = "start_date") Long startdate, Long enddate) {
    	return maintransactionsRepository.getOne(startdate);
    	
    }
}
