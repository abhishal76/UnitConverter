package com.example.abhishal.myconverter;

/**
 * Created by abhishal on 7/18/16.
 */
public class WeightConversion extends MainActivity {

    public double convert(String from, String to, double input){
        if(from.equals("Gram") && to.equals("Kilogram")){
            double ret = input/1000;
            return ret;
        }
        if (from.equals("Kilogram") && to.equals("Gram")){
            double ret = input*1000;
            return ret;
        }
        if (from.equals("Gram") && to.equals("Pound")){
            double ret = 0.0022*input;
            return ret;
        }
        if (from.equals("Pound") && to.equals("Gram")){
            double ret = 453.6*input;
            return ret;
        }
        if (from.equals("Kilogram") && to.equals("Pound")){
            double ret = input * 2.20462;
            return ret;
        }
        if (from.equals("Pound") && to.equals("Kilogram")){
            double ret = input * 0.454;
            return ret;
        }
        if (from.equals(to)){
            return input;
        }
        return 0;
    }

}
