package com.example.eventdriventpayment.service.impl;

import com.example.eventdriventpayment.entity.Payment;
import com.example.eventdriventpayment.repository.PaymentRepository;
import com.example.eventdriventpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment save(Payment payment) {
        payment.setCreateTime(System.currentTimeMillis());
        payment.setLastUpdateTime(System.currentTimeMillis());
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Long id,Payment payment) {
        Optional<Payment> paymentOptional = paymentRepository.findById(id);
        if(paymentOptional.isPresent()){
            Payment updatePayment = paymentOptional.get();
            updatePayment.setPaymentId(payment.getPaymentId());
            updatePayment.setPaymentStatus(payment.getPaymentStatus());
            updatePayment.setCreateTime(payment.getCreateTime());
            updatePayment.setUserId(payment.getUserId());
            updatePayment.setLastUpdateTime(System.currentTimeMillis());
            return paymentRepository.save(updatePayment);
        }
        return null;
    }

    @Override
    public Payment findById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        paymentRepository.deleteById(id);
    }
}
