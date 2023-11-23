package Observer;

public class StatisticsDisplay implements WeatherDataObserver {
    private float totalTemperature = 0.0f;
    private float totalHumidity = 0.0f;
    private int updateCount = 0;

    @Override
    public void update(float temperature, float humidity) {
        totalTemperature += temperature;
        totalHumidity += humidity;
        updateCount++;

        float averageTemperature = totalTemperature / updateCount;
        float averageHumidity = totalHumidity / updateCount;

        System.out.println("Average temperature: " + averageTemperature + "%, Average humidity: " + averageHumidity + "%");
    }
}
