package com.hrms.pages;

import com.hrms.utility.BaseClass;

public class VerifyTitle extends BaseClass{
public static void verifytitle() {
	if(driver.getTitle().equals("orange hrm")) {
		System.out.println("title is matched");
	}
	else {
		System.out.println(driver.getTitle()+"titile is not matched");
	}
}
}
