package org.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollExample {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement sdown = driver.findElement(By.id("heading20"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",sdown );
		Thread.sleep(4000);
		WebElement btnclick = driver.findElement(By.id("heading20"));
		js.executeScript("arguments[0].click()", btnclick);
		TakesScreenshot take=(TakesScreenshot)driver;
		File src=take.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest=new File("D://greens3.png");
		FileUtils.copyFile(src, dest);
		
		
		
}
}
