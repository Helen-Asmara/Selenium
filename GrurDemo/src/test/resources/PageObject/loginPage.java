package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	//get the driver object 
	
		WebDriver ldriver;
		//create Constructor and inside the constructor intiate the web driver  and specify pagefactory
		
		loginPage(WebDriver rdriver )
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		
		
		
		@FindBy(name="username")
		WebElement username;
		
		
		@FindBy(name="Password")
		WebElement Password;
		
		
		@FindBy(name="btnLogin")
		WebElement btnLogin;
		
		



	//Action Method


	public void setuserName(String userName)
	{
		userName.sendKeys(userName);
	}

	public void setPassword (String  Password)
	{
		Password.sendKeys(Password);
	}


	public void clickSubmit() {
		btnLogin.click();
		
	}}


}
