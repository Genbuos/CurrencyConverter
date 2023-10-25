package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.AustralianDollar;

public interface ConvertableCurrency {


    default Double convert(CurrencyType currencyType) {
        return null;
    }

    default Double getRate(CurrencyType currencyType){
        return currencyType.getRate();
    }

    default CurrencyType getCurrencyType(ConvertableCurrency currency){
        CurrencyType ct = CurrencyType.getTypeOfCurrency(currency);

        return ct;
    }
}
