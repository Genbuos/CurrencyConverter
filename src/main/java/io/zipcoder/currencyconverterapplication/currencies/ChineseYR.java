package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    public ChineseYR() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CHINESE_YR;
    }
}
