import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import test.YandexInitPage;
import test.YandexWeatherPage;

public class CityTest {

	WebDriver driverFirefox;
//	WebDriver driver;
	
	@Before
	public void testSetup(){
		driverFirefox = new FirefoxDriver();
		// ������ �������� ��������������� html-������� � ����������� � ������ (��� ������� ��������)
//		driver = new HtmlUnitDriver();
	}
	
	@After
	public void testShutDown(){
		driverFirefox.close();
//		driver.close();
	}
	
	@Test
	public void testCurrentCityPenza() {
		// �������������� ������ ��������� �������� ������� (yandex.ru)
		YandexInitPage yandexInitPage = new YandexInitPage(driverFirefox);
//		YandexInitPage yandexInitPage = new YandexInitPage(driver);
		
		// ��������� �� ������ yandex.ru
		yandexInitPage = yandexInitPage.navigateToYandex();
		
		// ������� ������ �� �������� ������.������ � �������� ��
		YandexWeatherPage yandexWeatherPage = yandexInitPage.clickOnWeather();
		
		// �������� ���, ������ � ��������� �� ����������
		assertTrue(yandexWeatherPage.getCurrentCity().contains("penza"));
	}
	
	@Test
	public void testCurrentCityMoscow() {
		YandexInitPage yandexInitPage = new YandexInitPage(driverFirefox);
		yandexInitPage = yandexInitPage.navigateToYandex();
		YandexWeatherPage yandexWeatherPage = yandexInitPage.clickOnWeather();
		
		assertTrue(yandexWeatherPage.getCurrentCity().contains("moscow"));
	}

}
