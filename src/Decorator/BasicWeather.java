
package Decorator;

public class BasicWeather implements Weather{
    private double temperature ;
    private String description;
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BasicWeather(double temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }

    @Override
    public double getTemperature() {
        return temperature ;
    }
    @Override
    public String getDescription() {
        return " Celsius , Description : "+description;
    }
}

