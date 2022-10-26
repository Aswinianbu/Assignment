package org.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public WebDriver driver;
	
	public WebElement findElement;
	
	public void getDriver () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Interview\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	}
	public void launch (String url) {
		driver.get(url);
	}
	public WebElement Xpathlocator (String xpath) {
		findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public WebElement idLocator (String id) {
		findElement =driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement nameLocator (String name) {
		findElement = driver.findElement(By.name(name));
		return findElement;
		
	}
	public void textSend (WebElement findElement, String text) {
		findElement.sendKeys(text);
	}
	public void buttonClick (WebElement findElement) {
		findElement.click();
	}
	
	
	}


