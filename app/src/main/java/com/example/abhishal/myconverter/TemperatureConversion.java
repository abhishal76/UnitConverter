package com.example.abhishal.myconverter;

/**
 * Created by abhishal on 7/13/16.
 */
public class TemperatureConversion extends MainActivity {
    MainActivity mainActivity;


    public double convert(String from, String to, double input){

        if (from.equals("Celcius") && to.equals("Fahrenheit")) {
            double result =  ((input * 9 / 5) + 32);
            return result;
        } if (from.equals("Fahrenheit") && to.equals("Celcius")){
            double ret = ((input-32)*5/9);
            return ret;
        }  if (from.equals(to)){
            return input;
        }
        return 0.0;
    }
}
