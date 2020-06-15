package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	// Initializing the page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// Page Factory : OR

	@FindBy(xpath = "//input[@id = 'email']")
	WebElement username;

	@FindBy(xpath = "//input[@id = 'pass']")
	WebElement password;

	@FindBy(xpath = "//input[@id = 'u_0_4']")
	WebElement login;

	// Actions

	public String validateTitle() {
		String validatingTitle = driver.getTitle();
		return validatingTitle;
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", login);

		return new HomePage();

	}
}
