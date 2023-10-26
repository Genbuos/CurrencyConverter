package io.zipcoder.currencyconverterapplication;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final   HashMap<CurrencyType, Double> ALL_RATES = new HashMap<>();


    static {
        ALL_RATES.put(CurrencyType.AUSTRALIAN_DOLLAR, 2.70);
        ALL_RATES.put(CurrencyType.CANADIAN_DOLLAR, 2.64);
        ALL_RATES.put(CurrencyType.CHINESE_YR, 13.84);
        ALL_RATES.put(CurrencyType.EURO, 1.88);
        ALL_RATES.put(CurrencyType.FRANC, 2.02);
        ALL_RATES.put(CurrencyType.POUND, 1.64);
        ALL_RATES.put(CurrencyType.RINGGIT, 8.94);
        ALL_RATES.put(CurrencyType.RUPEE, 136.64);
        ALL_RATES.put(CurrencyType.SINGAPORE_DOLLAR, 1.86);
        ALL_RATES.put(CurrencyType.UNIVERSAL_CURRENCY, 1.0);
        ALL_RATES.put(CurrencyType.US_DOLLAR, 2.0);
        ALL_RATES.put(CurrencyType.YEN,231.68 );
    }
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {


        double sourceRate = targetCurrencyType.getRate();
        double x = amountOfBaseCurrency * sourceRate;
            double result = x / sourceCurrencyType.getCurrencyType().getRate();
            return  result;


    }

    public static Double getConversionRate(CurrencyType currencyType){
        if(ALL_RATES.containsKey(currencyType)){
            return ALL_RATES.get(currencyType);
        }
        return 0.0;
    }

    public static HashMap getMap(){
        return ALL_RATES;
    }
}
