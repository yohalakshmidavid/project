package org.sele;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		Thread.sleep(4000);
		System.out.println("DAY DROPDOWN");
		WebElement ddnDay = driver.findElement(By.id("day"));
		Select s1=new Select(ddnDay);
		List<WebElement> option = s1.getOptions();
		for (WebElement op2 : option) {
		String text1=op2.getAttribute("value");
		System.out.println(text1);
		}
		System.out.println("MONTH DROPDOWN");
		WebElement ddnmonth = driver.findElement(By.id("month"));
		Select s=new Select(ddnmonth);
		List<WebElement> op = s.getOptions();
		for (WebElement op1 : op) {
		String text=op1.getAttribute("text");
		System.out.println(text);
		}	
		System.out.println("Year DROPDOWN");
		WebElement ddnYear = driver.findElement(By.id("year"));
		Select s2=new Select(ddnYear);
		List<WebElement> option1 = s2.getOptions();
		for (WebElement op3 : option1) {
		String text2=op3.getAttribute("value");
		System.out.println(text2);	
		}
		}
}
