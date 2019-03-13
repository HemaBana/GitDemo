package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage 

{
	
	public WebDriver driver;




	public DashBoardPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath="//h3[text()='Dashboard']")
WebElement title;


@FindBy(xpath="//ul[contains(@class,'nav navbar-nav navbar-right')]")
WebElement navigationBar;

@FindBy(xpath="//a[text()='Dashboard']")
WebElement DashboardTab;

@FindBy(xpath="(//td[contains(@style,'cursor: pointer;min-width: 120px;')])[1]")
WebElement postionId;



public WebElement Title()
{
return  title;
}

public WebElement NavigationBar()
{
return  navigationBar;
}
public WebElement postionId()
{
return  postionId;
}
public WebElement DashboardTab()
{
return  DashboardTab;
}
}
