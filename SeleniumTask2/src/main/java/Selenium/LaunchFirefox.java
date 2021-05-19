package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		

	}

}
