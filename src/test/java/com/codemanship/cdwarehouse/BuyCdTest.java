package com.codemanship.cdwarehouse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyCdTest {

    @Test
    public void inStockPaymentAccepted() throws Throwable {
        CD cd = new CD(10);
        cd.buy(1);
        assertEquals(9, cd.getStock());
    }

    @Test(expected=OutOfStockException.class)
    public void outOfStock() throws Throwable{
        new CD(0).buy(1);
    }
}
