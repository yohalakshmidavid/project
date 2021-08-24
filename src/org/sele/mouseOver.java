package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/courses.html");
		WebElement move = driver.findElement(By.className("menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-4146 menu-item-has-children menu-item-4527 dropdown"));
		Actions a=new Actions(driver);
		a.moveToElement(move).perform();
	}

}
