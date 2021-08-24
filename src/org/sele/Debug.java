package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btncrt = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncrt.click();
		Thread.sleep(4000);
		WebElement radiobtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radiobtn.click();
		
	}

}
