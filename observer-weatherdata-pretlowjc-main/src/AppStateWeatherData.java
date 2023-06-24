/*
  AppStateWeatherData.java
  This is a "boundary object" for our weather software system.
  
  Our boundary object connects the rest of our system with the
  device API. This way, the other parts of our system do not
  need to fret over device particulars. We offer a nice
  and easy to use set of methods.
  Based on Head First Design Patterns
  @author Jay Fenwick
  @version 2018
*/
import java.util.*;

public class AppStateWeatherData extends Observable implements WeatherDataInterface{
    private float temperature;
    private float humidity;
    private float pressure;

    // Reference to actual device via WeatherData API object
    WeatherData weatherStation;

    // Our various ways of displaying weather data
    CurrentConditionsDisplay condDisplay;
    StatisticsDisplay statDisplay;
    ForecastDisplay forecastDisplay;

    public AppStateWeatherData(WeatherData station) {

	// Setup two-way connection between us and device:
	//  we know about them:
	weatherStation = station;
	//  tell them about us:
	station.connect(this);

	// Create our displays
    this.addObserver(forecastDisplay);
    this.addObserver(condDisplay);
    this.addObserver(statDisplay);
    }
    
    /* WeatherDataInterface API requires this method. Since they know about us,
       when weather conditions change they can alert us. But they have to know
       how to contact us; so we implemented the WeatherDataInterface which 
       requires us to implement this method and then they know that we have
       this method available!! (Dang, interfaces are kinda cool like that!) */

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}