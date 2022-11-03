package designPatterns.behaviuoral.observer.subject;

import designPatterns.behaviuoral.observer.Observer;
import designPatterns.behaviuoral.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    //data
    private float degree;
    private float temperature;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(degree, temperature); // send new data to observers
    }

    public void setWeatherData(float degree, float temperature) {
        this.degree = degree;
        this.temperature = temperature;
        // when any change happen on the object state will notify all observers
        notifyObservers();
    }

}
