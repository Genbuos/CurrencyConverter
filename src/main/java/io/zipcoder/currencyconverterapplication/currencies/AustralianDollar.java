package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class AustralianDollar implements ConvertableCurrency {
    private CurrencyType currencyType;

    public AustralianDollar(){
    this.currencyType = CurrencyType.AUSTRALIAN_DOLLAR;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

}
