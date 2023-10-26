package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    public Franc() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.FRANC;
    }
}
