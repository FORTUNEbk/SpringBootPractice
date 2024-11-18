package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/initiate")
    public Transaction initiateTransaction(@RequestBody Transaction transaction) {
        return transactionService.initiateTransaction(transaction);
    }

    @PutMapping("/updateStatus/{referenceId}")
    public Transaction updateTransactionStatus(@PathVariable String referenceId, @RequestParam String status) {
        return transactionService.updateTransactionStatus(referenceId, status);
    }
}
