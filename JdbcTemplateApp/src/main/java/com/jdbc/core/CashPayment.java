package com.jdbc.core;

public class CashPayment implements IPaymentStrategy {
    private int amount;
    private String cashType;

    private int unitPrice;


    public CashPayment(){

    }



    public CashPayment(int amount,String cashType,int unitPrice){
        this.amount=amount;
        this.cashType=cashType;
        this.unitPrice=unitPrice;



    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
    }




    @Override
    public double pay() {
       return unitPrice*amount;
    }
}
