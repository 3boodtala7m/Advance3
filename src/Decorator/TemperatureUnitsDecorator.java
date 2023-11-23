package Decorator;

public class TemperatureUnitsDecorator extends WeatherDecorator{
    public TemperatureUnitsDecorator(Weather weather) {
        super(weather);
    }

    @Override
    public String getDescription() {
        double temperatureFahrenheit = (super.getTemperature() * 9 / 5) + 32;
        return String.format(super.getDescription()+" , Fahrenheit : "+ temperatureFahrenheit );
    }

}
