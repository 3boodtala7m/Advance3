package Observer;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("temperature: " + temperature + " , humidity : " + humidity );
    }
}