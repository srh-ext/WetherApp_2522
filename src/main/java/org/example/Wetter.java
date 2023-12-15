package org.example;

import com.github.prominence.openweathermap.api.OpenWeatherMapClient;
import com.github.prominence.openweathermap.api.enums.Language;
import com.github.prominence.openweathermap.api.enums.UnitSystem;
import com.github.prominence.openweathermap.api.model.weather.Weather;

public class Wetter {

    private final String API_TOKEN = "30ae9f4b2e6ad512143752a624920e5c";



    public Weather getWeather(String city) {

        OpenWeatherMapClient openWeatherClient = new OpenWeatherMapClient(API_TOKEN);

        Weather weather = openWeatherClient
                .currentWeather()
                .single()
                .byCityName(city)
                .language(Language.GERMAN)
                .unitSystem(UnitSystem.METRIC)
                .retrieve()
                .asJava();


        return weather;
    }
}
