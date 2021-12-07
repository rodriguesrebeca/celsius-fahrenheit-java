package com.company.services;

public class Calculator {

    public static float fahrenheit(float celsius){
        final float FATOR_CONVERSAO = 1.8f;
        final float CONVERSAO_FAHRENHEIT = 32f;
        return (celsius * FATOR_CONVERSAO) + CONVERSAO_FAHRENHEIT;
    }
}
