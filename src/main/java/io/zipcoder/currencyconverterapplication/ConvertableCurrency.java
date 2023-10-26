package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public interface ConvertableCurrency {


    default Double convert(CurrencyType currencyType) {




        Map<CurrencyType, Double> rates = CurrencyConverter.getMap();
        double sR = rates.get(currencyType);
        double tR = getCurrencyType().getRate();
        for (CurrencyType cc: rates.keySet()) {
            if(this.getCurrencyType() == cc){
                return sR  / tR;
            }
        }


        return 0.0;


//        double result = 0.0;

//        double x = 0.0;



   }






    CurrencyType getCurrencyType();
}
