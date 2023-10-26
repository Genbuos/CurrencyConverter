package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    public Pound() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.POUND;
    }
}
