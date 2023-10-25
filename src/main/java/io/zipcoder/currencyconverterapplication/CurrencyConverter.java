package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        if (amountOfBaseCurrency == null || sourceCurrencyType == null || targetCurrencyType == null) {
            throw new IllegalArgumentException("Input parameters cannot be null.");
        }

        double sourceRate = sourceCurrencyType.getCurrencyType(sourceCurrencyType).getRate();
        double x = amountOfBaseCurrency * sourceRate;
            double result = x / targetCurrencyType.getRate();
            return  result;


    }
}
