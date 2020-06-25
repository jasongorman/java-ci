package com.codemanship.cdwarehouse;

public interface Payments {
    boolean process(CreditCard card, double amount);
}
