package com.company;

import com.company.tax.TaxService;

public class Main {

    public static void main(String[] args) {
	    TaxService taxService = new TaxService();
	    Bill[] payments = new Bill[] {
	         // TODO создать платежи с различными типами налогооблажения
        };
	    for (int i = 0; i < payments.length; i++) {
	        Bill bill = payments[i];
	        bill.payTaxes();
        }
    }
}
