package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class interview1 {
	
	private static final boolean True = false;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Interview\\driver\\chromedriver.exe");
		
		Baseclass base = new Baseclass();
		base.getDriver();
		base.launch("http://testfire.net/index.jsp");
		base.Xpathlocator("//font[text()='Sign In']").click();
		base.idLocator("uid").sendKeys("demo_user");
		base.idLocator("passw").sendKeys("demo_password");
		base.nameLocator("btnSubmit").click();
		base.Xpathlocator("//font[text()='Sign In']").click();
		base.idLocator("uid").sendKeys("admin");
		base.idLocator("passw").sendKeys("admin");
		base.nameLocator("btnSubmit").click();
		boolean validate = base.Xpathlocator("//h1[contains(text(),'Hello Admin User')]") != null;
		Assert.assertTrue(validate);
		System.out.println("Validate Hello Admin User");
		base.idLocator("MenuHyperLink1").click();
		WebElement ViewAccount = base.nameLocator("listAccounts");
		Select s = new Select(ViewAccount);
		s.selectByVisibleText("800001 Checking");
		base.idLocator("btnGetAccount").click();
		base.idLocator("MenuHyperLink3").click();
		System.out.println("Account History - 800001 Checking");
		WebElement from = base.idLocator("fromAccount");
		Select s1 = new Select (from);
		s1.selectByVisibleText("800000 Corporate");
		WebElement to = base.idLocator("toAccount");
		Select s2 = new Select (to);
		s2.selectByVisibleText("800001 Checking");
		base.idLocator("transferAmount").sendKeys("9876.0");
		base.nameLocator("transfer").click();
		base.idLocator("MenuHyperLink2").click();
		boolean validate3 = base.Xpathlocator("//td[contains(text(),'-$9876.00')]") !=null;
		Assert.assertTrue(validate3);
		System.out.println("Recent Transactions");
		base.idLocator("HyperLink3").click();
		base.Xpathlocator("//a[text()='online form']").click();
		base.nameLocator("name").sendKeys("Admin User");
		base.nameLocator("submit").click();
		base.Xpathlocator("//font[text()='Sign Off']").click();
		
	
		
		
		
		
		
		
		
		
	}

}
