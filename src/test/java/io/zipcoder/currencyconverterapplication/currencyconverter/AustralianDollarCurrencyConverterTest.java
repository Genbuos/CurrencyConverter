package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.*;
import org.junit.Assert;
import org.junit.Test;

public class AustralianDollarCurrencyConverterTest implements CurrencyTestInterface {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new AustralianDollar();





        // when
        Double actual = CurrencyConverter.convert(amountOfBaseCurrency, sourceCurrency, targetCurrency);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    /**
     * template method to be called by other test methods
     * @param targetCurrency type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType targetCurrency, Double expected) {
        testConversion(10.0, targetCurrency, expected);
    }


    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 10.0);
    }

    @Test
    public void testCanadianDollarConversion() {
        ConvertableCurrency source = new CanadianDollar();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(9.777777777777777, actual, .0001);


//        testConversion( CurrencyType.CANADIAN_DOLLAR, 9.777777777777777);
    }

    @Test
    public void testChineseYRConversion() {
        ConvertableCurrency source = new ChineseYR();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(51.25925925925926, actual, .0001);

//        testConversion(CurrencyType.CHINESE_YR, 51.25925925925926);
    }

    @Test
    public void testEuroConversion() {
        ConvertableCurrency source = new Euro();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(6.962962962962962, actual, .0001);

//        testConversion(CurrencyType.EURO, 6.962962962962962);
    }

    @Test
    public void testFrancConversion() {
        ConvertableCurrency source = new Franc();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(7.481481481481481, actual, .0001);
//        testConversion(CurrencyType.FRANC, 7.481481481481481);
    }

    @Test
    public void testPoundConversion() {
        ConvertableCurrency source = new Pound();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(6.074074074074073, actual, .0001);
//        testConversion(CurrencyType.POUND, 6.074074074074073);
    }

    @Test
    public void testRinggitConversion() {
        ConvertableCurrency source = new Ringgit();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(33.11111111111111, actual, .0001);
//        testConversion(CurrencyType.RINGGIT, 33.11111111111111);
    }

    @Test
    public void testRupeeConversion() {
        ConvertableCurrency source = new Rupee();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(506.074074074074, actual, .0001);
//        testConversion(CurrencyType.RUPEE, 506.074074074074);
    }

    @Test
    public void testSingaporeConversion() {
        ConvertableCurrency source = new SingaporeDollar();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(6.888888888888889, actual, .0001);
//        testConversion(CurrencyType.SINGAPORE_DOLLAR, 6.888888888888889);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        ConvertableCurrency source = new UniversalCurrency();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(3.7037037037037035, actual, .0001);
//        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 3.7037037037037035);
    }

    @Test
    public void testUSDollarConversion() {
        ConvertableCurrency source = new USDollar();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(7.407407407407407, actual, .0001);
//        testConversion(CurrencyType.US_DOLLAR, 7.407407407407407);
    }

    @Test
    public void testYenConversion() {
        ConvertableCurrency source = new Yen();
        Double actual = CurrencyConverter.convert(10.0, source, CurrencyType.AUSTRALIAN_DOLLAR);

        Assert.assertEquals(858.0740740740741, actual, .0001);
//        testConversion(CurrencyType.YEN, 858.0740740740741);
    }
}
