package com.example.abhishal.myconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "s";
    Spinner baseSpinner, firstSpinner, secondSpinner;
    EditText getTextToConvert;
    Button convertThis;
    TextView display;
    TemperatureConversion temperatureConversion;
    WeightConversion weightConversion;
    SpeedConversion speedConversion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemOnSpinner();
        conversion();
    }

    public void conversion(){
        temperatureConversion = new TemperatureConversion();
        weightConversion = new WeightConversion();
        speedConversion = new SpeedConversion();
        getTextToConvert = (EditText) findViewById(R.id.editText);
        convertThis = (Button) findViewById(R.id.button);
        display = (TextView) findViewById(R.id.textView3);
        convertThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNumber = getTextToConvert.getText().toString();
                if (getNumber.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
                } else if (baseSpinner.getSelectedItem().toString().equals("Temperature")) {
                    double ss = (temperatureConversion.convert(firstSpinner.getSelectedItem().toString(), secondSpinner.getSelectedItem().toString(), Double.parseDouble(getNumber)));
                    display.setText(String.format("%.2f", ss));
                } else if (baseSpinner.getSelectedItem().toString().equals("Weight")) {
                    double weight = weightConversion.convert(firstSpinner.getSelectedItem().toString(), secondSpinner.getSelectedItem().toString(), Double.parseDouble(getNumber));
                    display.setText(String.format("%.2f", weight));
                } else if (baseSpinner.getSelectedItem().toString().equals("Speed")){
                    double speed = speedConversion.convertSpeed(firstSpinner.getSelectedItem().toString(), secondSpinner.getSelectedItem().toString(), Double.parseDouble(getNumber));
                display.setText(String.format("%.2f", speed));
            }
            }
        });
    }

    public void addItemOnSpinner(){

         baseSpinner = (Spinner) findViewById(R.id.baseSpinner);
        if (baseSpinner != null) {
            baseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                private String[] arraySpinner;
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if (String.valueOf(parent.getItemAtPosition(position)).equals("Temperature")){
//                    arraySpinner = getResources().getStringArray(R.array.unitsTemperature);
//                    Spinner firstSpinner = (Spinner) findViewById(R.id.spinner1);
//                    Spinner secondSpinner = (Spinner) findViewById(R.id.spinner2);
//                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arraySpinner);
//                    firstSpinner.setAdapter(adapter1);
//                    secondSpinner.setAdapter(adapter1);
//                    } else if (String.valueOf(parent.getItemAtPosition(position)).equals("Weight")){
//
//                }else if(String.valueOf(parent.getItemAtPosition(position)).equals("Speed")){
//
//                }
                    switch (position){
                        case 0:
                            arraySpinner = getResources().getStringArray(R.array.unitWeight);
                     firstSpinner = (Spinner) findViewById(R.id.spinner1);
                     secondSpinner = (Spinner) findViewById(R.id.spinner2);
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arraySpinner);
                    firstSpinner.setAdapter(adapter1);
                    secondSpinner.setAdapter(adapter1);
                            break;
                        case 1:
                            arraySpinner = getResources().getStringArray(R.array.unitSpeed);
                             firstSpinner = (Spinner) findViewById(R.id.spinner1);
                             secondSpinner = (Spinner) findViewById(R.id.spinner2);
                            adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arraySpinner);
                            firstSpinner.setAdapter(adapter1);
                            secondSpinner.setAdapter(adapter1);
                            break;
                        case 2:
                            arraySpinner = getResources().getStringArray(R.array.unitsTemperature);
                            firstSpinner = (Spinner) findViewById(R.id.spinner1);
                            secondSpinner = (Spinner) findViewById(R.id.spinner2);
                            adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arraySpinner);
                            firstSpinner.setAdapter(adapter1);
                            secondSpinner.setAdapter(adapter1);
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

    }
}
