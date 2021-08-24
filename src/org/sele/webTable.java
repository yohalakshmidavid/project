package org.sele;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melmi\\eclipse-workspace\\Selenium11AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			WebElement row = trows.get(i);
			List<WebElement> tdata = row.findElements(By.tagName("td"));
			for (int j = 0; j < tdata.size(); j++) {
				WebElement data = tdata.get(j);
				String text = data.getText();
				if(text.equals("Saudi Arabia"));
				{
					System.out.println(text);
				}
				
			}
		}
	}

}
