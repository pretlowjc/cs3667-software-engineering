import java.util.*;
	
public abstract class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay() {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof AppStateWeatherData) {
			AppStateWeatherData appStateWeatherData = (AppStateWeatherData)obs;
			this.temperature = appStateWeatherData.getTemperature();
			this.humidity = appStateWeatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
