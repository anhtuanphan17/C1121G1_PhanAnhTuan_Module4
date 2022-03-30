package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{

    @Override
    public double calculate(double num1, double num2,String calculation) {
        double result = 0.00;

        switch (calculation){
            case "+":
                result =num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
        }

        return result;
    }
}
