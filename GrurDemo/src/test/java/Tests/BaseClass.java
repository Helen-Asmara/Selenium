package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	
	
	
	
	public String baseURL="https://demo.guru99.com/test/newtours/login.php";
	public String username="Helen";
	public String password="Tek12345?";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup()

	{
System.setProperty("webdrive.chrome.driver",System.getProperty("user.dir")+"C:\\Users\\Helen\\Desktop\\Selenium\\chromedriver.exe");
	
	
		driver=(WebDriver) new ChromeDriver();
				
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
