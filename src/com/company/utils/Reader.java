package com.company.utils;

import java.util.Scanner;

public class Reader {
    private static Scanner scanCelsius;

    public static float scannerCelsius(){
        scanCelsius = new Scanner(System.in);
        Print.printMsgCelsius();
        float celsius = scanCelsius.nextFloat();

        return celsius;
    }
}
