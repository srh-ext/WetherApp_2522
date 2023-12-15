package org.example;

import java.util.Objects;import java.util.Scanner;

public class Terminal {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter capital city for temperature information:");
        return scanner.nextLine();
    }

    public static void  readOutput() {
        String output = "Incorrect input.";
        while (output.equals("Incorrect input.")) {
            WeatherManager weatherManager = new WeatherManager();
            output = weatherManager.getWeatherByCapitalCity(getInput());
            System.out.println(output);



        }
    }
}