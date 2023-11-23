I did the first thing in the packages so that the process of reading the code would be more organized and flexible
The first package for the decorator:

I created the first thing (an interface called Weather) and I knew inside it the things that I would rely on in the entire decoder, which is the information, but I divided it into two functions because there are numbers and mathematical operations, and String would be more difficult in this aspect, so I gave it two, which are
String getDescription();
double getTemperature();

Then, according to the decorator, the basic or primary class is created after it, and usually with the concept of the decorator, it is called Basic, and for this I created the BasicWeather class, of course, implements from Weatherrow, and I put inside it the basic method for any class, such as the set and get, and since the input will be from the user, I put it as basic. It returns to me the value that the user will enter and that is inside the override method under the name getDescription() and getTemperature() and the construct

Then I created the most important class, which is the Decorator class, and I made it abstract, and its name is WeatherDecorator, and this class, which I will take its properties and add to it, that is, as a basis, so that any class as an addition or feature, we will put it under this class, and I only called the override method in it only.

Then came the time for features and additions, and this is the main purpose of our use of the decorator. I created a TemperatureUnitsDecorator class, and its purpose is to be done according to the user, of course, if he wants the temperature in Fahrenheit or Celsius, and the feature or decorator does the work that I did before. This thing is easy for me, so I just call override method and adding to it the equation that converts from the Celsius unit to the Fahrenheit unit, and this is the principle of the decorator, that the addition is done on the basis without changing the core or basis, and then the same applies to PrecipitationDecorator and WindSpeedDecorator.

Note: I wrote the code according to the way I thought about the project. This was my thinking or understanding of the question, because I did not really understand what you wanted in the first requirement for the unit, so I only added Fahrenheit because you wrote switch, and I did not understand what you meant by that, according to Decoritoro. Thank you.


Now, the second package is for the Observer. Of course, the purpose of this thing is, for example, I have students and courses. If courses are available for students, it notifies the students that courses are available when they are available, without the student having to log in and check if there are courses available. For him or not, this thing solves a big problem for us, and this thing is here in this example, but with the weather, every time something new or climate changes happens, an update occurs, and this is reflected in the previous example that I explained.

I created the first thing, interface WeatherDataObserver, and put it inside the basic function that I will use a lot, which is the update, and everything that is required of me in this part is basically based on it.

And then CurrentConditionsDisplay, which is like the principle of printing, but what is meant here is the current condition or the current state, so it is like a process of returning values, and inside I used the override method and gave it the current values.

Then I wrote the WeatherDataSubject class and put inside it the basic concepts for this part, which are temperature, humidity, List<WeatherDataObserver>, and Set, like any other class, because it will be notified more than once, and it will be shown all the time, and the operations on it are more open to me as operations and others, so it was better. An option is List, so I used it and created a function registerObserver, which is the one that enters everything new into List and notifyObservers, and this function, whenever I have a new change, it will be added through List.

Then the second class, which is StatisticsDisplay, its purpose is averageTemperature and averageHumidity. Through the update class, I performed a simple process to calculate and output it.



Of course, in the last part, the integration, frankly, I did not understand how the merging process would take place or how it would happen, but I achieved the principles required in the first, which are Decorator and Observer, but I did not understand the last part, so I put two pages, which are DecoratorMain and ObserverMain, and each one works separately. Thank you, But I hope that next time the assignments will be explained more than this. Thank you
