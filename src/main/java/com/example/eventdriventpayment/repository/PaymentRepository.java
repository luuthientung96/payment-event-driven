package com.example.eventdriventpayment.repository;

import com.example.eventdriventpayment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
