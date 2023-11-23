package Decorator;


public abstract class WeatherDecorator implements Weather {
    private Weather weather;

    public WeatherDecorator(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String getDescription() {
        return this.weather.getDescription();
    }

    @Override
    public double getTemperature() {
        return this.weather.getTemperature();
    }


}