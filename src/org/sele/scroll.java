package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/java-training-in-chennai.html");
		driver.manage().window().maximize();
		WebElement sdown = driver.findElement(By.xpath("//h2[text()='Java  Training Features']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",sdown );
		Thread.sleep(4000);
		WebElement sup = driver.findElement(By.xpath("//div[text()='Courses ']"));
		js.executeScript("arguments[0].scrollIntoView(false)",sup );
	}

}
