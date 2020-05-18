package com.example.restservice;

public class BarnRequestObject {
    private final double income;
    private final int barn1Typ;
    private final int barn2Typ;
    private final int barn3Typ;

    public BarnRequestObject(double income, int barn1Typ, int barn2Typ, int barn3Typ) {
        this.income = income;
        this.barn1Typ = barn1Typ;
        this.barn2Typ = barn2Typ;
        this.barn3Typ = barn3Typ;
    }

    public double getIncome() {
        return income;
    }

    public int getBarn1Typ() {
        return barn1Typ;
    }

    public int getBarn2Typ() {
        return barn2Typ;
    }

    public int getBarn3Typ() {
        return barn3Typ;
    }
}