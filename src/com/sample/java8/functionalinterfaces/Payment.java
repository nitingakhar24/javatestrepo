package com.sample.java8.functionalinterfaces;

import java.math.BigDecimal;


/**
 * A Functional interface is one which has only 1 abstract method, however it can have any number of static and default methods
 */

@FunctionalInterface
public interface Payment {
    void doPayment(String sourceAccount, String destinationAccount, BigDecimal txnAmt);

}
