package com.Techfios.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Techfios.Base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@name=\"btn btn-success block full-width\"]")
	WebElement LoginBtn;

	@FindBy(xpath = "//img[@class=\"logo\"]")
	WebElement TechfiosLogo;
}

public LoginPage() {
	PageFactory.initElements(driver, this);
}
