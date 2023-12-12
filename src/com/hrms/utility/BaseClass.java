package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
public class BaseClass {
//driver 
	public static WebDriver driver;
	public static void OpenApplication() {
		driver =new EdgeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("opened application");
		
	}
	//close application
	public static void CloseApplication() {
		driver.close();
		Reporter.log("application closed");
	}
}
