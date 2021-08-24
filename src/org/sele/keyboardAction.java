package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a=new Actions(driver);
		a.contextClick(gmail).perform();
		Robot r=new Robot();
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		
	}

}
