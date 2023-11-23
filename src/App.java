import Decorator.*;
import Observer.*;

public class App {
    public static void main(String[] args) {

        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setTemperature(35);
        weatherData.setHumidity(20);
        weatherData.notifyObservers();

        Weather basicWeather = new BasicWeather(20,"Its very hot !");
        Weather basicWeatherUnit = new TemperatureUnitsDecorator(new BasicWeather(20,"sunny")) ;
        Weather basicWeatherUnitPre =new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(20,"sunny")),"rain");
        Weather basicWeatherUnitPreWi = new WindSpeedDecorator(new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(20,"sunny")),"rain"),2) ;
        System.out.println("Temperature : "+basicWeatherUnitPreWi.getTemperature()+basicWeatherUnitPreWi.getDescription());

        System.out.println("------------------------------------------------------------------------------------------------------------");

        WeatherDataSubject weatherDataa = new WeatherDataSubject();
        CurrentConditionsDisplay currentConditionsDisplayy = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplayy = new StatisticsDisplay();

        weatherDataa.registerObserver(currentConditionsDisplay);
        weatherDataa.registerObserver(statisticsDisplay);

        weatherDataa.setTemperature(-2);
        weatherDataa.setHumidity(-4);
        weatherDataa.notifyObservers();

        Weather basicWeatherr = new BasicWeather(-2,"Its very cold !");
        Weather basicWeatherUnitt = new TemperatureUnitsDecorator(new BasicWeather(-2,"Its very cold !")) ;
        Weather basicWeatherUnitPree =new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(-2,"Its very cold !")),"rain");
        Weather basicWeatherUnitPreWii = new WindSpeedDecorator(new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(-2,"Its very cold !")),"cool"),15) ;
        System.out.println("Temperature : "+basicWeatherUnitPreWii.getTemperature()+basicWeatherUnitPreWii.getDescription());

    }
}
