package com.example.eventdriventpayment.enums;

public enum PaymentStatus {
    SUCCESSFUL("SUCCESSFUL"), PENDING("PENDING"), FAILED("FAILED");

    private String status;

    PaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
