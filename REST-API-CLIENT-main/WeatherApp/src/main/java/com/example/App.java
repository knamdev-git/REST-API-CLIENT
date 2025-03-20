package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for city
        System.out.print("Enter city name: ");
        String city = scanner.nextLine().trim();

        // Ask user for unit (Celsius or Fahrenheit)
        System.out.print("Choose temperature unit (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.nextLine().trim().toUpperCase();

        // Get weather information
       
        System.out.println("\nWeather Report:");
        WeatherService.getWeather(city, unit);
        scanner.close();
    }
}


