package com.Repository;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // You can add custom queries here if needed
    Transaction findByReferenceId(String referenceId);
}
