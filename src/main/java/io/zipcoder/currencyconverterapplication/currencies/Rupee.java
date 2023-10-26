package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    public Rupee() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RUPEE;
    }
}
