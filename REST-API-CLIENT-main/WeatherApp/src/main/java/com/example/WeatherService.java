package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherService {
    private static final String API_KEY = "1ffc31f4c620ab6e9682267bee56a154"; // Replace with your actual API key
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public static void getWeather(String city, String unit) {
        HttpURLConnection conn = null;
        Scanner scanner = null;

        try {
            // Determine unit for API request
            String apiUnit = unit.equalsIgnoreCase("C") ? "metric" : "imperial";

            // Construct API URL
            String urlString = BASE_URL + city + "&appid=" + API_KEY + "&units=" + apiUnit;
            URL url = new URL(urlString);

            // Open connection
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Check HTTP response code
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println( "Error: Unable to fetch weather data (HTTP " + responseCode + ")");
            }

            // Read response
            scanner = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }

            // Parse JSON response
            JsonObject json = JsonParser.parseString(response.toString()).getAsJsonObject();
            double temperature = json.getAsJsonObject("main").get("temp").getAsDouble();
            String description = json.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();

            // Determine temperature unit symbol
            String unitSymbol = unit.equalsIgnoreCase("C") ? "°C" : "°F";

            System.out.println( "Temperature: " + temperature + unitSymbol + "\nCondition: " + description);
        } catch (IOException e) {
            System.out.println("Error fetching weather data.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
