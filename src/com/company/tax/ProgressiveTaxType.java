package com.company.tax;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount > 100_000) {
            return amount * 15 / 100;
        } else {
            return amount * 10 / 100;
        }
    }
}
