package designPatterns.behaviuoral.observer.observers;

import designPatterns.behaviuoral.observer.Display;
import designPatterns.behaviuoral.observer.Observer;
import designPatterns.behaviuoral.observer.Subject;

public class ForecastDisplay implements Observer, Display {
    //should have Reference for th Publisher (Subject) to have the option subscribe and unsubscribe
    private final Subject subject;
    private float degree;
    private float temperature;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float degree, float temperature) {
        System.out.println("Updated");
        this.degree = degree;
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay : degree: " + degree + " temperature: " + temperature);
    }

    public void unsubscribe() {
        subject.removeObserver(this);
    }
}
