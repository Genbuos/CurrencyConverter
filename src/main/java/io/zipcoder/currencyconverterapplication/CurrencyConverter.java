package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {


        double sourceRate = targetCurrencyType.getRate();
        double x = amountOfBaseCurrency * sourceRate;
            double result = x / sourceCurrencyType.getCurrencyType(sourceCurrencyType).getRate();
            return  result;


    }
}
