package Observer;


import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject {
    private List<WeatherDataObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    public float getTemperature() {

        return temperature;
    }
    public float getHumidity() {

        return humidity;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}