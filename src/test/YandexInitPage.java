package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexInitPage extends AbstractPage {
	
	public YandexInitPage(WebDriver driver){
		super(driver);
	}
	
	public YandexWeatherPage clickOnWeather(){
		driver.findElement(By.linkText("Погода")).click();
		return new YandexWeatherPage(driver);
	}

}
