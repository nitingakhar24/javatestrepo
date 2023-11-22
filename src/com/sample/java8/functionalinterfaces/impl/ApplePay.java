package com.sample.java8.functionalinterfaces.impl;

import com.sample.java8.functionalinterfaces.Payment;

import java.math.BigDecimal;

public class ApplePay implements Payment {
    @Override
    public void doPayment(String sourceAccount, String destinationAccount, BigDecimal txnAmt) {
        System.out.println("Making payment of :" + txnAmt + "through :" + getClass().getName() + "from :" + sourceAccount + "to :" + destinationAccount);
        //REST OF the logic
    }
}
