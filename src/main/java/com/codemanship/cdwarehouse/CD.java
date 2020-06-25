package com.codemanship.cdwarehouse;

public class CD {
    private int stock;
    private double price;

    public CD(int stock, double price) {
        this.stock = stock;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void buy(int quantity, CreditCard creditCard, Payments payments) throws OutOfStockException, PaymentRejectedException {
        if(quantity > stock)
            throw new OutOfStockException();

        if(!payments.process(creditCard, quantity * price))
            throw new PaymentRejectedException();

        stock -= quantity;
    }
}
