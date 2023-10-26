package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

public interface ConvertableCurrency {


    default Double convert(CurrencyType currencyType) {
        double result = 0.0;
        double sR = 0.0;
        double x = 0.0;
        if(this instanceof AustralianDollar){
            sR = currencyType.getRate();
            x = sR /CurrencyType.AUSTRALIAN_DOLLAR.getRate();
            result = x;
        }

        if(this instanceof CanadianDollar) {
            sR = currencyType.getRate();
            x = sR /CurrencyType.CANADIAN_DOLLAR.getRate();
            result = x;
        }

        if(this instanceof ChineseYR){
            sR = currencyType.getRate();
            x = sR /CurrencyType.CHINESE_YR.getRate();
            result = x;
        }

        if(this instanceof Euro){
            sR = currencyType.getRate();
            x = sR /CurrencyType.EURO.getRate();
            result = x;
        }

        if(this instanceof Franc){
            sR = currencyType.getRate();
            x = sR /CurrencyType.FRANC.getRate();
            result = x;
        }

        if(this instanceof Pound){
            sR = currencyType.getRate();
            x = sR /CurrencyType.POUND.getRate();
            result = x;
        }

        if(this instanceof Ringgit){
            sR = currencyType.getRate();
            x = sR /CurrencyType.RINGGIT.getRate();
            result = x;
        }

        if(this instanceof Rupee){
            sR = currencyType.getRate();
            x = sR /CurrencyType.RUPEE.getRate();
            result = x;
        }

        if(this instanceof SingaporeDollar){
            sR = currencyType.getRate();
            x = sR /CurrencyType.SINGAPORE_DOLLAR.getRate();
            result = x;
        }

        if(this instanceof UniversalCurrency){
            sR = currencyType.getRate();
            x = sR /CurrencyType.UNIVERSAL_CURRENCY.getRate();
            result = x;
        }

        if(this instanceof USDollar){
            sR = currencyType.getRate();
            x = sR /CurrencyType.US_DOLLAR.getRate();
            result = x;
        }

        if(this instanceof Yen){
            sR = currencyType.getRate();
            x = sR /CurrencyType.YEN.getRate();
            result = x;
        }



        return result;
    }

    default Double getRate(CurrencyType currencyType){
        return currencyType.getRate();
    }

    default CurrencyType getCurrencyType(ConvertableCurrency currency){
        CurrencyType ct = CurrencyType.getTypeOfCurrency(currency);

        return ct;
    }
}
