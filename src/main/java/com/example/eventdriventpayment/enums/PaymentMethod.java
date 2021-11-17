package com.example.eventdriventpayment.enums;

public enum PaymentMethod {
    CASH_ON_DELIVERY("Cash On Delivery"), INTERNET_BANKING("Internet Banking"), VISA_MASTER("Visa/Master Card");

    private String paymentMethod;

    PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
