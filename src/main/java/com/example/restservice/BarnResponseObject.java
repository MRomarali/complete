package com.example.restservice;

public class BarnResponseObject {
    private final double amountBarn1;
    private final double amountBarn2;
    private final double amountBarn3;

    public BarnResponseObject(double amountBarn1, double amountBarn2, double amountBarn3) {
        this.amountBarn1 = amountBarn1;
        this.amountBarn2 = amountBarn2;
        this.amountBarn3 = amountBarn3;
    }

    public double getAmountBarn1() {
        return amountBarn1;
    }

    public double getAmountBarn2() {
        return amountBarn2;
    }

    public double getAmountBarn3() {
        return amountBarn3;
    }
}
