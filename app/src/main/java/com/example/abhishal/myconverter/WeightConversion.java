package com.example.abhishal.myconverter;

/**
 * Created by abhishal on 7/18/16.
 */
public class WeightConversion extends MainActivity {

    public double convert(String from, String to, double input){
        if(from.equals("Gram") && to.equals("Kilogram")){
            double result = input/1000;
            return result;
        }
        if (from.equals("Kilogram") && to.equals("Gram")){
            double result = input*1000;
            return result;
        }
        if (from.equals("Gram") && to.equals("Pound")){
            double result = 0.0022*input;
            return result;
        }
        if (from.equals("Pound") && to.equals("Gram")){
            double result = 453.6*input;
            return result;
        }
        if (from.equals("Kilogram") && to.equals("Pound")){
            double result = input * 2.20462;
            return result;
        }
        if (from.equals("Pound") && to.equals("Kilogram")){
            double result = input * 0.454;
            return result;
        }
        if (from.equals(to)){
            return input;
        }
        return 0;
    }

}
