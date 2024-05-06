package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyTitle;
import com.hrms.utility.BaseClass;

public class TC001 {
	@Test
	public static void Run() {
	BaseClass.openapplication();
    LoginPage.login("nareshit", "nareshit");
    VerifyTitle.verifytitle();
    LogoutPage.logout();
    
	}

}
