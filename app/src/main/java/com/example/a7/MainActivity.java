package com.example.a7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView textView;
    private Boolean isOperationClick;
    private Double first, second, result;
    private String operation = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView=findViewById(R.id.input);
        Button one_button=findViewById(R.id.one);
        Button two_button=findViewById(R.id.two);
        Button three_button=findViewById(R.id.three);
        Button four_button=findViewById(R.id.four);
        Button five_button=findViewById(R.id.five);
        Button six_button=findViewById(R.id.six);
        Button seven_button=findViewById(R.id.seven);
        Button eight_button=findViewById(R.id.eight);
        Button nine_button=findViewById(R.id.nine);
        Button dote_button=findViewById(R.id.dote);

        Button plus_button=findViewById(R.id.plus);
        Button minus_button=findViewById(R.id.minus);
        Button division_button=findViewById(R.id.devision);
        Button multiply_button=findViewById(R.id.multiply);
        Button equal_button=findViewById(R.id.equal);

        Button clear_button=findViewById(R.id.clear);





        one_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        two_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        three_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        four_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        five_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        six_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        seven_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        eight_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        nine_button.setOnClickListener(view -> {
            onNumberClick(view);
        });
        dote_button.setOnClickListener(view -> {
            onNumberClick(view);
        });


        plus_button.setOnClickListener(view -> {
            onOperationClick(view);
        });
        minus_button.setOnClickListener(view -> {
            onOperationClick(view);
        });
        division_button.setOnClickListener(view -> {
            onOperationClick(view);
        });
        multiply_button.setOnClickListener(view -> {
            onOperationClick(view);
        });
        equal_button.setOnClickListener(view -> {
            onOperationClick(view);
        });
        clear_button.setOnClickListener(view -> {
            onOperationClick(view);
        });

    }

    public void onNumberClick(View view){
        if(view.getId() == R.id.one){
            setNumber("1");
        }
        else if (view.getId() == R.id.two) {
            setNumber("2");
        }
        else if (view.getId() == R.id.three) {
            setNumber("3");
        }
        else if (view.getId() == R.id.four) {
            setNumber("4");
        }
        else if (view.getId() == R.id.five) {
            setNumber("5");
        }
        else if (view.getId() == R.id.six) {
            setNumber("6");
        }
        else if (view.getId() == R.id.seven) {
            setNumber("7");
        }
        else if (view.getId() == R.id.eight) {
            setNumber("8");
        }
        else if (view.getId() == R.id.nine) {
            setNumber("9");
        }
        else if (view.getId() == R.id.zero) {
            setNumber("0");
        }
        else if (view.getId() == R.id.dote) {
            setNumber(".");
        }
    }
    public void onOperationClick(View view){
        if(view.getId() == R.id.clear){
            textView.setText("0");
            first = 0.0;
            second = 0.0;
        }
        else if (view.getId() == R.id.plus) {
            operation = "+";
            first = Double.parseDouble(textView.getText().toString());
            isOperationClick = true;
        }
        else if (view.getId() == R.id.equal) {
            second = Double.parseDouble(textView.getText().toString());
            if(operation.equals("+")){
                result = first+second;
                textView.setText(cancelDouble(result));
            } else if (operation.equals("-")) {
                result = first-second;
                textView.setText(cancelDouble(result));
            }else if (operation.equals("/")) {
                if(second == 0){
                    textView.setText("На 0 нельзя");
                }else{
                    result = first/second;
                    textView.setText(cancelDouble(result));}
            }else if (operation.equals("*")) {
                result = first*second;
                textView.setText(cancelDouble(result));
            }
            else if (operation.equals("%")) {
                result = (first/100)*second;
                textView.setText(cancelDouble(result));
            }
            isOperationClick = true;

        }
        else if (view.getId() == R.id.minus) {
            operation = "-";
            first = Double.parseDouble(textView.getText().toString());
            isOperationClick = true;
        }
        else if (view.getId() == R.id.multiply) {
            operation = "*";
            first = Double.parseDouble(textView.getText().toString());
            isOperationClick = true;
        }
        else if (view.getId() == R.id.devision) {
            operation = "/";
            first = Double.parseDouble(textView.getText().toString());
            isOperationClick = true;
        }

    }

    public String cancelDouble(Double number){
        String text = number.toString();
        if(text.substring(text.length() - 2).equals(".0")){
            return text.substring(0,text.length() - 2);
        }
        else{
            return number.toString();
        }
    }


    public void setNumber(String number){
        if(textView.getText().toString().equals("0")){
            textView.setText(number);
        } else if (isOperationClick) {
            textView.setText(number);
        } else{
            textView.append(number);
        }
        isOperationClick = false;
    }
}
