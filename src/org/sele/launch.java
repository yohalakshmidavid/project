package org.sele;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement enter = driver.findElement(By.name("q"));
		enter.sendKeys("greens velmurugan");
		WebElement findElement = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
	   
			findElement.click();
			WebElement findElement1 = driver.findElement(By.className("LC20lb DKV0Md"));
			findElement1.click();
	}

}
