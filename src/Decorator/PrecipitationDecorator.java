package Decorator;

public class PrecipitationDecorator extends WeatherDecorator{

    private String precipitation;

    public PrecipitationDecorator(Weather weather, String precipitation) {
        super(weather);
        this.precipitation = precipitation;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , precipitation : "+ precipitation;
    }
}
