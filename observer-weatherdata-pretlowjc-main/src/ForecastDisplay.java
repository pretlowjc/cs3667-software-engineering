import java.util.*;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = -1;
    private float lastPressure = -1;

    public ForecastDisplay() {
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
	System.out.print("Forecast: ");
	
	if (lastPressure < 0) {
	    System.out.println("2+ measurements needed to forecast");
	}
	else if (currentPressure > lastPressure) {
	    System.out.println("Improving weather on the way!");
	} else if (currentPressure == lastPressure) {
	    System.out.println("More of the same");
	} else if (currentPressure < lastPressure) {
	    System.out.println("Watch out for cooler, rainy weather");
	}
    }
}
