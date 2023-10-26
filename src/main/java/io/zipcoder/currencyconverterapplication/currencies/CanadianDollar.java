package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType currencyType;
    public CanadianDollar() {
        this.currencyType = CurrencyType.CANADIAN_DOLLAR;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
