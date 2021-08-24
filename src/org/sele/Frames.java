package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		//List<WebElement> nof = driver.findElements(By.tagName("iframe"));
		////System.out.println(nof.size());
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
		//driver.switchTo().frame(iframe);
		//WebElement image = driver.findElement(By.xpath("//html[@style='height: 100%;']"));
		//image.click();

	}

}
