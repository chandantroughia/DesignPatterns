package designpatterns.observer;

public class WeatherStation {

	public static String STATION_NAME1 ="CNN Weather News";
	public static String STATION_NAME2 ="Metro News One Weather";
	public static String STATION_NAME ="Jimmy Fallon Weather Report";
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay cnn_weather_Station = new CurrentConditionsDisplay(weatherData,STATION_NAME1);
		CurrentConditionsDisplay metro_news_one_weatherStation = 
				new CurrentConditionsDisplay(weatherData,STATION_NAME2);
		CurrentConditionsDisplay jimmy_fallon = 
				new CurrentConditionsDisplay(weatherData,STATION_NAME);

			
		weatherData.setMeasurements(80, 65, 30.4f);
		Thread.currentThread().sleep(10000);
		
		System.out.println("=======================================");
		
		weatherData.setMeasurements(82, 70, 29.2f);
		Thread.currentThread().sleep(10000);
		
		System.out.println("=======================================");
		
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
