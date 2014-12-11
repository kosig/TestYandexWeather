package test;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public YandexInitPage navigateToYandex(){
		driver.navigate().to("http://www.yandex.ru/");
		return new YandexInitPage(driver);
	}

}
