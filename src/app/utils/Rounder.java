package app.utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
