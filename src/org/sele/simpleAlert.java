package org.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alert1 = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
		alert1.click();
		WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alert2.click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		a.sendKeys("yohalakshmi");
		a.accept();
		
		
	}

}
