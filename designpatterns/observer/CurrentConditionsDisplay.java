package designpatterns.observer;

import java.util.Date;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	private String agencyName;
	
	public CurrentConditionsDisplay(Subject weatherData, String agencyName ) {
		this.weatherData = weatherData;
		this.agencyName = agencyName;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		
		System.out.println("This just in at :" +agencyName +" : Weather conditions at " +new Date() +" are ::" + temperature 
			+ "F degrees and " + humidity + "% humidity");
		
	}
}
