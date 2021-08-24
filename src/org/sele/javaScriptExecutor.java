package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		JavascriptExecutor js=	(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','yohalakshmi')",username);
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", username);
		String name=(String)obj;
		System.out.println(name);
		WebElement password = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','melvin')", password);
		Object obj1 = js.executeScript("return arguments[0].getAttribute('value')", password);
		String name1=(String)obj1;
		System.out.println(name1);
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
		
		
	}

}
