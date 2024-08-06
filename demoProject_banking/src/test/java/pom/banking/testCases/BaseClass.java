package pom.banking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public  String baseURL = "https://demo.guru99.com/V4/";
	public String username = "mngr584545";
	public String password = "hagAjed";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","D://Pasanka//Automation Projects//demoProject_banking//Drivers//ChromeSetup.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
