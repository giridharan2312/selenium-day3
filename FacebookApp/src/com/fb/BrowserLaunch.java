package com.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");

		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");

		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.youtube.com/");

		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.amazon.in/");

	}
}
