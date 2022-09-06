package org.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample {
	
	static WebDriver driver;
	public static final String USERNAME = "babypalanidurai_BIHdFG";
	public static final String AUTOMATE_KEY = "2C9qz2sRjyZsZfH3V974";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException {
		MutableCapabilities capabilities = new MutableCapabilities();
		capabilities.setCapability("browserName", "Edge");
		capabilities.setCapability("browserVersion", "latest");
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("osVersion", "11");
		capabilities.setCapability("local", "false");
		capabilities.setCapability("seleniumVersion", "3.141.59");
		
		driver=new RemoteWebDriver(new URL(URL), capabilities);
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Guru");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		
		driver.quit();

	}


}
