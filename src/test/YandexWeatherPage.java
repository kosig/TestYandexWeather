package test;

import org.openqa.selenium.WebDriver;

public class YandexWeatherPage extends AbstractPage{

	public YandexWeatherPage(WebDriver driver){
		super(driver);
	}
	
	public String getCurrentCity(){
		return driver.getCurrentUrl();
	}
}
