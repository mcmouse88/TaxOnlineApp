package com.company.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(double amount) {
        BigDecimal percentTax;
        if (amount > 100_000) {
            percentTax = BigDecimal.valueOf(15).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        } else {
            percentTax = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        }
        return BigDecimal.valueOf(amount).multiply(percentTax);
    }
}
