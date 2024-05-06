package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass{
static By link_logout = By.linkText("Logout");
public static void logout() {
	driver.findElement(link_logout).click();
	System.out.println("logout is completed");
}
	
}
