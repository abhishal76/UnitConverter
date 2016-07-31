package com.example.abhishal.myconverter;

/**
 * Created by abhishal on 7/31/16.
 */
public class SpeedConversion extends MainActivity {

    public double convertSpeed(String X, String Y, double inputText){
        if (X.equals("mile/h") && Y.equals("km/h") ){
            double result = inputText * 1.60934;
            return  result;
        }
        if (X.equals("km/h") && Y.equals("mile/h") ){
            double result = inputText*0.62137;
            return result;
        }
        if (X.equals(Y)){
            return inputText;
        }
        return 0;
    }

}
