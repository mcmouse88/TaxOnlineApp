package com.company.tax;

public class TaxService {
    public void payOut(double taxAmount) {
        System.out.format("Уплачен налог в размере %.f%n", taxAmount);
    }
}
