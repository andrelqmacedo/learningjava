package util;

public class CurrencyConverter {
    public static double convertToReais(double cotation, double amountToConvert){
        double t = cotation * amountToConvert;
        return t + (t*6)/100;
    }
}
