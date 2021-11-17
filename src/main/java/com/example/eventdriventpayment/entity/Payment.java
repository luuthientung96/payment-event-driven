package com.example.eventdriventpayment.entity;

import com.example.eventdriventpayment.enums.PaymentMethod;
import com.example.eventdriventpayment.enums.PaymentStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;

    private long userId;

    private long totalMoney;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private long createTime;

    private long lastUpdateTime;

}
