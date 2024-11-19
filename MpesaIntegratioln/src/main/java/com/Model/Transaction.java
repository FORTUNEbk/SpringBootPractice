package com.Model;

import lombok.Data;

Identity
public class Transaction {

    @Data
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;
    private double amount;
    private String status;
    private String referenceId;

    // Getters and Setters
}
