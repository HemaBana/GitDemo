package TestScripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Login extends Base 
{
	
	@BeforeMethod
	public void invoke() throws IOException
	{
		driver = intializebrowser();
		driver.get(pro.getProperty("URL"));
	}
	
	@Test(dataProvider = "getdata")
	public void ValidLogin(String UserName, String Password) throws IOException

	{

		
		LoginPage l = new LoginPage(driver);
		l.Username().sendKeys(UserName);
		l.Password().sendKeys(Password);
		l.Login().click();

	}

	@DataProvider
	public Object[][] getdata()

	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Hema@nalashaa.com";
		data[0][1] = "NAL$1199";
		data[1][0] = "namitha@nalashaa.com";
		data[1][1] = "NAL$5143";
		return data;

	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}

}
