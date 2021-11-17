package com.example.eventdriventpayment.service;

import com.example.eventdriventpayment.entity.Payment;

import java.util.List;

public interface PaymentService {
    Payment save(Payment payment);
    Payment update(Long id,Payment payment);
    Payment findById(Long id);
    List<Payment> findAll();
    void deleteById(Long id);
}
