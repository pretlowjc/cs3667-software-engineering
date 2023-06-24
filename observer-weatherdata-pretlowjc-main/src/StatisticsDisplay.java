import java.util.*;

public class StatisticsDisplay {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings = 1;

	public StatisticsDisplay() {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof AppStateWeatherData) {
			AppStateWeatherData appStateWeatherData = (AppStateWeatherData)observable;
			float temp = appStateWeatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
