package Tests;

import org.testng.Assert;
import com.DeltaAir.pageObject.LoginPage;

public class TestPage extends BaseClass {
	
	
	public TestPage() {
		driver.get(baseURL);
		
		LoginPage Ip= new LoginPage(driver);
		
		Ip.setusername(username);
		Ip.setPassword(password);
		
		Ip.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Ban Manager HomePag"))
		{
			Assert.assertTrue(true);
			
		}
		
			
		
}}