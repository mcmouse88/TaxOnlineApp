package com.company;

import com.company.tax.IncomeTaxType;
import com.company.tax.ProgressiveTaxType;
import com.company.tax.TaxService;
import com.company.tax.VATaxType;

public class Main {

    public static void main(String[] args) {
	    TaxService taxService = new TaxService();
	    Bill[] payments = new Bill[] {
	         // TODO создать платежи с различными типами налогооблажения
				new Bill(25_000.00, new IncomeTaxType(), taxService),
				new Bill(30_000.00, new VATaxType(), taxService),
				new Bill(56_000.00, new ProgressiveTaxType(), taxService)
        };
	    for (int i = 0; i < payments.length; i++) {
	        Bill bill = payments[i];
	        bill.payTaxes();
        }
    }
}
