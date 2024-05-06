package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass{
	static By txt_username = By.name("txtUserName");
	static By txt_password = By.name("txtPassword");
	static By btn_login =By.name("Submit");
	public static void login(String un,String ps) {
		driver.findElement(txt_username).sendKeys(un);
		driver.findElement(txt_password).sendKeys(ps);
		driver.findElement(btn_login).click();
		Reporter.log("login successfull");
	}
}
