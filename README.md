Decorator Package:

Weather Interface:

An interface defining essential functions like getDescription() and getTemperature() to be utilized across decorators.
BasicWeather Class:

Implements the Weather interface, contains basic methods for setting and getting weather data, retrieving user-input values.
WeatherDecorator Class:

An abstract class serving as the base for all decorators, providing overridden methods like getDescription() and getTemperature().
TemperatureUnitsDecorator Class:

Converts temperature from one unit to another (e.g., Celsius to Fahrenheit).
PrecipitationDecorator Class:

Adds information about precipitation type to the weather.
WindSpeedDecorator Class:

Includes information about wind speed in the weather.
Observer Package:

WeatherDataObserver Interface:

An interface defining required methods for observers, such as the update() function used to notify observers of any data changes.
CurrentConditionsDisplay Class:

Displays current weather conditions using methods defined in the observer interface.
WeatherDataSubject Class:

Manages monitored data like temperature and humidity, maintains a list to register observers and notify them of any changes.
StatisticsDisplay Class:

Calculates and displays average temperature and humidity using methods from the observer interface.
Additionally, DecoratorMain and ObserverMain classes are meant to integrate and utilize the functionalities and features specified in the respective packages.
