import Decorator.*;
import java.util.Scanner;
public class DecoratorMain{
    public static void main(String[] args) {
        Weather basicWeather = new BasicWeather(15,"sunny");
        System.out.println("Temperature : "+basicWeather.getTemperature()+basicWeather.getDescription());

        Weather basicWeatherUnit = new TemperatureUnitsDecorator(new BasicWeather(15,"sunny")) ;
        System.out.println("Temperature : "+basicWeatherUnit.getTemperature()+basicWeatherUnit.getDescription());

        Weather basicWeatherUnitPre =new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(15,"sunny")),"rain");
        System.out.println("Temperature : "+basicWeatherUnitPre.getTemperature()+basicWeatherUnitPre.getDescription());

        Weather basicWeatherUnitPreWi = new WindSpeedDecorator(new PrecipitationDecorator (new TemperatureUnitsDecorator(new BasicWeather(15,"sunny")),"rain"),2) ;
        System.out.println("Temperature : "+basicWeatherUnitPreWi.getTemperature()+basicWeatherUnitPreWi.getDescription());
    }

}