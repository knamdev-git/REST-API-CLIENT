# REST-API-CLIENT

COMPANY : CODETECH-IT SOLUTIONS

NAME : KANHA NAMDEV

INTERN-ID : CT08ULF

DOMAIN : JAVA PROGRAMMING

DURATION : 4 WEEKS

MENTOR : NEELA SANTOSH

TASK-DESCRIPTION : 

The Weather App is a Spring Boot-based application that fetches and displays real-time weather information for any specified city. The application consumes the OpenWeatherMap API to provide accurate weather data, including temperature, weather conditions, and unit preferences (Celsius/Fahrenheit). Designed with efficiency and modularity in mind, this application demonstrates the use of RESTful API consumption, JSON parsing, and Java-based backend development.

Key Features: 

✔ Fetches real-time weather data for any city worldwide

✔ Supports both Celsius and Fahrenheit temperature units

✔ Consumes OpenWeatherMap API for accurate weather conditions

✔ Error handling and response validation for seamless user experience

✔ Built with Java, Spring Boot, and Maven for scalable development

Technologies Used:

Java – Core programming language

Spring Boot – Framework for building REST APIs

Maven – Build automation tool

OpenWeatherMap API – Provides live weather data

Gson (Google JSON Library) – For parsing API responses

JUnit – Unit testing framework

Application Workflow:

1. The user provides the name of the city for which they want the weather report.

2. The application sends an HTTP request to the OpenWeatherMap API, appending the required city and API key.

3. The API returns a JSON response containing weather details such as temperature, weather description, and atmospheric conditions.

4. The application parses this JSON response and extracts relevant details.

5. The final result is displayed in a structured format with a clear temperature reading and weather condition.

Error Handling and Edge Cases: 

-If an invalid city name is entered, the application handles the error gracefully and provides an appropriate message.

-If there is a network issue or API failure, the user is notified of the issue.

-The program ensures proper exception handling and connection closures.

This Weather App is a practical implementation of REST API consumption, Spring Boot development, and JSON parsing in Java. It serves as an excellent starting point for developers looking to build Java-based web applications with real-time data processing.

Sample output 1:

![Image](https://github.com/user-attachments/assets/8c3f1bbe-b6a9-4156-a9a0-8fc1c823c65e)

Sample output 2:

![Image](https://github.com/user-attachments/assets/e8291149-ea6a-4123-b86f-3304d8d7032d)

Sample output 3: In case of loose internet connection, when API fails to fetch data...

![Image](https://github.com/user-attachments/assets/b8fdda14-f360-45bd-848c-adec25480c62)

