package com.jdbc.core;

public class CreditCardPayment implements IPaymentStrategy {
    private int cardNumber;
    private String cardProvider;

    private static final double DISCOUNT=0.05;

    private int totalItems=0;
    private double pricePerItem=0.0;

    public CreditCardPayment(){

    }

    public CreditCardPayment(int cardNumber, String cardProvider) {
        this.cardNumber = cardNumber;
        this.cardProvider = cardProvider;

        totalItems=5;
        pricePerItem=20.0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardProvicer() {
        return cardProvider;
    }

    @Override
    public double pay() {
        double price=0.0;
        if(totalItems>=5){
           price= (totalItems*pricePerItem)-(totalItems*pricePerItem*DISCOUNT);
        }
        else price=price=totalItems*pricePerItem;
      return price;
    }
}
