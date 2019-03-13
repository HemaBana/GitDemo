package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{
	
	public WebDriver driver;




	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(name="loginid")
WebElement username;

@FindBy(name="loginpassword")
WebElement password;

@FindBy(xpath="//input[@type='submit']")
WebElement login;
	



public WebElement Username()
{
return  username;
}

public WebElement Password()
{
return  password;
}
public WebElement Login()
{
return  login;
}

}
