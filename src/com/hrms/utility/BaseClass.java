package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class BaseClass {
public static WebDriver driver;
public static void openapplication() {
	driver=new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("application is open");
}
public static void closeapplication() {
	driver.close();
	Reporter.log("driver is closed");
}
}
