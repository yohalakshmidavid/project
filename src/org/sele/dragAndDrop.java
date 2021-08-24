package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.id("credit2"));
		WebElement dest = driver.findElement(By.id("bank"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		WebElement src1 = driver.findElement(By.id("fourth"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(src1, dest1).perform();
		WebElement src2 = driver.findElement(By.id("credit1"));
		WebElement dest2 = driver.findElement(By.id("loan"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(src2, dest2).perform();
		WebElement src3 = driver.findElement(By.id("fourth"));
		WebElement dest3 = driver.findElement(By.id("amt8"));
		Actions a3=new Actions(driver);
		a3.dragAndDrop(src3, dest3).perform();
			
	}

}
