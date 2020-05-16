package com.example.restservice;

public class Calculator {

    private static final double HIGH_INCOME_LIMIT = 43000.0;

    public BarnResponseObject calculate(BarnRequestObject requestObject) {
        double b1 = calculateBarn1(requestObject.getIncome(), requestObject.getBarn1Typ());
        double b2 = calculateBarn2(requestObject.getIncome(), requestObject.getBarn2Typ());
        double b3 = calculateBarn3(requestObject.getIncome(), requestObject.getBarn3Typ());
        //TODO: Proper calculation

        return new BarnResponseObject(b1, b2, b3);
    }

    private double calculateBarn1(double income, int barnTyp) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (barnTyp) {
            case 0: // inget barn
                return 0;
            case 1: // Förskola 1-2år, mer än 15 tim
                return income * 0.03;
            case 2: // Förskola 1-2år, max 15 tim
                return income * 0.01;
            case 3: // Allmän förskola 3-5år, mer än 15 tim
                return income * 0.0233;
            case 4: // Fritidshem 6-10år
                return income * 0.02;
            case 5: // Allmän förskola 3-5år, max 15 tim
                return income * 0.0033;
        }
        return 0;
    }
    private double calculateBarn2(double income, int barnTyp) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (barnTyp) {
            case 0: // inget barn
                return 0;
            case 1: // Förskola 1-2år, mer än 15 tim
                return income * 0.02;
            case 2: // Förskola 1-2år, max 15 tim
                return income * (0.01/3)*2;
            case 3: // Allmän förskola 3-5år, mer än 15 tim
                return income * 0.0155;
            case 4: // Fritidshem 6-10år
                return income * 0.01;
            case 5: // Allmän förskola 3-5år, max 15 tim
                return income * 0.022;
        }
        return 0;
    }
    private double calculateBarn3(double income, int barnTyp) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (barnTyp) {
            case 0: // inget barn
                return 0;
            case 1: // Förskola 1-2år, mer än 15 tim
            case 3: // Allmän förskola 3-5år, mer än 15 tim
            case 4: // Fritidshem 6-10år
                return income * 0.01;
            case 2: // Förskola 1-2år, max 15 tim
                return income * 0.01/3;
            case 5: // Allmän förskola 3-5år, max 15 tim
                return income * 0.0011;
        }
        return 0;
    }
}
