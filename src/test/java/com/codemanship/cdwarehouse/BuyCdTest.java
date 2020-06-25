package com.codemanship.cdwarehouse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyCdTest {

    @Test
    public void inStockPaymentAccepted() throws Throwable {
        Payments payments = new Payments(){
            @Override
            public boolean process(CreditCard card, double amount) {
                return true;
            }
        };
        CD cd = new CD(10, 10.0);
        cd.buy(1, new CreditCard(), payments);
        assertEquals(9, cd.getStock());
    }

    @Test(expected=OutOfStockException.class)
    public void outOfStock() throws Throwable{
        new CD(0, 10.0).buy(1, new CreditCard(), null);
    }

    @Test(expected=PaymentRejectedException.class)
    public void paymentRejected() throws Throwable{
        Payments payments = new Payments(){
            @Override
            public boolean process(CreditCard card, double amount) {
                return false;
            }
        };
        new CD(10, 10.0).buy(1, new CreditCard(), payments);
    }
}
