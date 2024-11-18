package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    private final String mpesaApiUrl = "https://api.safaricom.co.ke/mpesa/"; // Example URL

    // Function to initiate an MPesa transaction (just a placeholder)
    public Transaction initiateTransaction(Transaction transaction) {
        // Call MPesa API to initiate the transaction
        RestTemplate restTemplate = new RestTemplate();
        // Call MPesa API and return response (implementation may vary)
        // Example: restTemplate.postForObject(mpesaApiUrl, transaction, Transaction.class);

        // Here we assume the transaction is successful
        transaction.setStatus("Pending");
        return transactionRepository.save(transaction);
    }

    // Function to update transaction status
    public Transaction updateTransactionStatus(String referenceId, String status) {
        Transaction transaction = transactionRepository.findByReferenceId(referenceId);
        if (transaction != null) {
            transaction.setStatus(status);
            return transactionRepository.save(transaction);
        }
        return null; // Transaction not found
    }
}
