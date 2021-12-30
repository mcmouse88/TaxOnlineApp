package com.company.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(double amount) {
        BigDecimal percentTax = BigDecimal.valueOf(13).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        return BigDecimal.valueOf(amount).multiply(percentTax);
    }
}
