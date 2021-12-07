package com.company;

import com.company.services.Calculator;
import com.company.utils.Reader;

public class Main {

    public static void main(String[] args) {

        float celsius = Reader.scannerCelsius();
        float fahrenheit = Calculator.fahrenheit(celsius);
        System.out.printf("A temperatura em CELSIUS %.2f ºC equivale a %.2f F.", celsius, fahrenheit);
    }
}