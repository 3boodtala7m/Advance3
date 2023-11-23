package Decorator;

public class WindSpeedDecorator extends WeatherDecorator{
    private int windSpeed;

    public WindSpeedDecorator(Weather weather, int windSpeed) {
        super(weather);
        this.windSpeed = windSpeed;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , windSpeed : "+ windSpeed;
    }
}
