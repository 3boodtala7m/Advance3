import Observer.CurrentConditionsDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherDataSubject;
public class ObserverMain {
    public static void main(String[] args) {
        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setTemperature(25.0f);
        weatherData.setHumidity(60.0f);
        weatherData.notifyObservers();

        weatherData.setTemperature(28.0f);
        weatherData.setHumidity(65.0f);
        weatherData.notifyObservers();
    }
}
