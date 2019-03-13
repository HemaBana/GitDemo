package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.DashBoardPage;
import PageObjects.LoginPage;
import PageObjects.RequsitionPage;
import Resources.Base;

public class Requisition extends Base

{
	@BeforeTest
	public void invokeBrowser() throws IOException
	{
		intializebrowser(); 
		driver.get(pro.getProperty("URL"));
	}
	
	@Test
	public void createRequistion() throws InterruptedException
	{
		
		LoginPage l = new LoginPage(driver);
		l.Username().sendKeys("adarsh@nalashaa.com");
		l.Password().sendKeys("Gowda@13");
		l.Login().click();
driver.manage().window().maximize();
	RequsitionPage r=new RequsitionPage(driver);
	r.RequstionTab().click();
	r.RequsitionCreate().click();
	Select position = new Select(driver.findElement(By.id("position")));
	position.selectByVisibleText("Quality Assurance");
	r.Expfrom().sendKeys("2");
	r.expTo().sendKeys("4");
	r.numofpositions().sendKeys("1");
	Select positiontype = new Select(driver.findElement(By.xpath("//select[@formcontrolname='positionTypeControl']")));
	positiontype.selectByValue("Permanent");
	Select primarySkill = new Select(driver.findElement(By.id("primarySkill")));
	primarySkill.selectByVisibleText("Selenium");
	Select secondarySkill = new Select(driver.findElement(By.id("secondarySkill")));
	secondarySkill.selectByVisibleText("SQL");
	
r.projectName().sendKeys("Nemo");
r.salfrom().sendKeys("4");
r.salTo().sendKeys("8");
r.postionClosuredate().click();
r.postionClosuredateselect().click();

Select busniessUnit = new Select(driver.findElement(By.id("businessUnitList")));
busniessUnit.selectByValue("4cfc6a0b-ff2f-470a-b7a6-d742728a88f1");

WebElement ele=driver.findElement(By.name("fileJD"));
ele.sendKeys("C:\\Users\\hema\\Desktop\\LatestInf.txt");

WebElement name = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
name.sendKeys("hem");
Thread.sleep(1000);
name.sendKeys(Keys.ARROW_DOWN);
name.sendKeys(Keys.ENTER);

 WebElement ele1 = driver.findElement(By.name("filePMO"));
 ele1.sendKeys("C:\\Users\\hema\\Desktop\\new.msg");
	r.savebutton().click();
	Thread.sleep(2000);
	System.out.println(r.SuccessMessage().getText());
	
	
	}
	
	
	@Test
	public void serachRequistion() throws InterruptedException
	{
		RequsitionPage r=new RequsitionPage(driver);
		 DashBoardPage  d=new DashBoardPage(driver);
		 
		 Thread.sleep(4000);
		 d.DashboardTab().click();
		 d.postionId().click();
		 r.FindcanButton().click();
		 r.CanName().click();
		 r.select().click();
	}
	
	
	@AfterClass
	
	public void teardown()
	{
		driver.close();
	}

}
