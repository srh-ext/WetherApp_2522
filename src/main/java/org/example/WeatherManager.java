package org.example;

import com.github.prominence.openweathermap.api.model.weather.Weather;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class WeatherManager {
    private List<String> capitalCitys = null;


    public WeatherManager() {
    }

    public String getWeatherByCapitalCity(String city) {
            if (capitalCitys == null) {
                FileReader fileReader = new FileReader();
                fileReader.readCsv();
                capitalCitys = fileReader.getCapitalCities();

                if (FileFilter.isCapitalCity(capitalCitys, city)) {
                    Wetter wetter = new Wetter();
                    Weather weather = wetter.getWeather(city);
                    String temperatur = Double.toString(weather.getTemperature().getValue());
                    LocalDateTime dateTime = weather.getCalculationTime();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
                    String formattedString = dateTime.format(formatter);
                    return "Temperature in " + city + ": " + temperatur + "C° at " + formattedString + ".";
                }
            }
        return "Incorrect input.";
    }}

