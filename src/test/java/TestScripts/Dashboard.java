package TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.DashBoardPage;
import PageObjects.LoginPage;
import Resources.Base;

public class Dashboard extends Base
{
@BeforeTest
public void invokeBrowser() throws IOException
{
	intializebrowser(); 
	driver.get(pro.getProperty("URL"));
}

@Test
public void validateTitle()
{
	LoginPage l=new LoginPage(driver);
	l.Username().sendKeys("hema@nalashaa.com");
	l.Password().sendKeys("NAL$1199");
	l.Login().click();
	
	DashBoardPage d=new DashBoardPage(driver);
	String aTitle = d.Title().getText();
	Assert.assertEquals(aTitle, "DASHBOARD");
	Assert.assertTrue(d.NavigationBar().isDisplayed());
}

@AfterTest
public void TearDown()
{
	driver.close();
}


}
