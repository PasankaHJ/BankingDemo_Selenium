package pom.banking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pom.banking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public  String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
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
