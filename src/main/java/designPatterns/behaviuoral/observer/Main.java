package designPatterns.behaviuoral.observer;

import designPatterns.behaviuoral.observer.observers.ForecastDisplay;
import designPatterns.behaviuoral.observer.observers.StatisticsDisplay;
import designPatterns.behaviuoral.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weather);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
        weather.setWeatherData(50.2F, 20.32F);

        forecastDisplay.display();
        statisticsDisplay.display();
    }
}
