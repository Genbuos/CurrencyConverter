package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        if (amountOfBaseCurrency == null || sourceCurrencyType == null || targetCurrencyType == null) {
            throw new IllegalArgumentException("Input parameters cannot be null.");
        }

        double sourceRate = targetCurrencyType.getRate();
        double x = amountOfBaseCurrency * sourceRate;
            double result = x / sourceCurrencyType.getCurrencyType(sourceCurrencyType).getRate();
            return  result;


    }
}
