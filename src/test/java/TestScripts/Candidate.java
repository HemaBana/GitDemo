package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.CandidatePage;
import PageObjects.LoginPage;
import Resources.Base;

public class Candidate extends Base
{
	@BeforeTest
	public void invokeBrowser() throws IOException
	{
		intializebrowser(); 
		driver.get(pro.getProperty("URL"));
	}
	
	
	@Test
	public void createCandidate() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		l.Username().sendKeys("adarsh@nalashaa.com");
		l.Password().sendKeys("Gowda@13");
		l.Login().click();
        driver.manage().window().maximize();
		CandidatePage c=new CandidatePage(driver);
		c.CandidateTab().click();
		c.CandidateCreate().click();
		c.CandidateName().sendKeys("Henry");
		c.PrimaryNum().sendKeys("1234567890");
		c.SecondaryNum().sendKeys("0976543217");
		c.Domain().sendKeys("Healthcare");
		c.EmailId().sendKeys("abc@gmail.com");
        Select ps=new Select(driver.findElement(By.name("primarySkill")));
        ps.selectByVisibleText("API");
        Select ss=new Select(driver.findElement(By.name("secondarySkill")));
        ss.selectByVisibleText("SQL");
        
        c.CurrentCompany().sendKeys("IBM");
        c.currentDesignation().sendKeys("Lead");
        c.experience().sendKeys("3");
        c.NoticePeriod().sendKeys("20");
        c.CurrentLocation().sendKeys("Bangalore");
        Select py=new Select(driver.findElement(By.name("positionType")));
        py.selectByVisibleText("Permanent");
        
        c.currentCTC().sendKeys("3");
        c.expectedCTC().sendKeys("6");
       
        Select vendor=new Select(driver.findElement(By.name("vendorName")));
        vendor.selectByVisibleText("Vendor2");
        WebElement ref = driver.findElement(By.id("candidateReferralName"));
        ref.sendKeys("hem");
        Thread.sleep(1000);
        ref.sendKeys(Keys.ARROW_DOWN);
        ref.sendKeys(Keys.ENTER);
        
        WebElement uplaod = driver.findElement(By.name("cvFile"));
        
        uplaod.sendKeys("C:\\Users\\hema\\Desktop\\Input.xlsx");
        
        c.CopyCV().sendKeys("Copied");
        c.save().click();
        Thread.sleep(2000);
        System.out.println(c.SuccessMessage().getText());
				
		
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}
}