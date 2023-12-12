package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	@Test
public static void TC001() {
	//test steps
	BaseClass.OpenApplication();
	LoginPage.login("nareshit","nareshit");
	LogoutPage.Logout();
	BaseClass.CloseApplication();
	
}
}
