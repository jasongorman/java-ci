package com.codemanship.cdwarehouse;

public class CD {
    private int stock;

    public CD(String artist, String title, int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void buy(int quantity) throws OutOfStockException {
        if(quantity > stock)
            throw new OutOfStockException();

        stock -= quantity;
    }
}
