package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequsitionPage 
{
	
	public WebDriver driver;

public RequsitionPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//a[text()='Requisition']")
WebElement requstionTab;

@FindBy(xpath="//i[@mattooltip='Create new Requisition']")
WebElement requsitionCreate;

@FindBy(id="position")
WebElement position;

@FindBy(name="experienceFrom")
WebElement expfrom;

@FindBy(name="experienceTo")
WebElement expTo;

@FindBy(name="ofPosition")
WebElement numofpositions;


@FindBy(xpath="//input[@formcontrolname='projectNameControl']")
WebElement projectName;


@FindBy(name="salRangeFrom")
WebElement salfrom;

@FindBy(name="salRangeTo")
WebElement salTo;

@FindBy(name="PositionClosureDate")
WebElement postionClosuredate;


@FindBy(xpath="//div[contains(@class,'mat-calendar-body-cell-content mat-calendar-body-today')]")
WebElement postionClosuredateselect;

@FindBy(xpath="//button[text()=' Save']")
WebElement savebutton;

@FindBy(id="toast-container")

WebElement SuccessMessage;

@FindBy(xpath=("//button[text()=' Find Candidate']"))

WebElement FindcanButton;

@FindBy(xpath=("//td[contains(text(), 'Henry' )]"))

WebElement CanName;

@FindBy(xpath=("//button[text()='Select']"))

WebElement select;

public WebElement RequstionTab()
{
	return  requstionTab;
}



public WebElement RequsitionCreate()
{
	return  requsitionCreate;
}

public WebElement Position()
{
	return  position;
}

public WebElement Expfrom()
{
	return expfrom;
}

public WebElement expTo()
{
	return expTo;
}


public WebElement projectName()
{
	return projectName;
}

public WebElement numofpositions()
{
	return numofpositions;
}

public WebElement salfrom()
{
	return salfrom;
}

public WebElement salTo()
{
	return salTo;
}
public WebElement postionClosuredate()
{
	return postionClosuredate;
}
public WebElement postionClosuredateselect()
{
	return postionClosuredateselect;
}

public WebElement savebutton()
{
	return savebutton;
}

public WebElement SuccessMessage()
{
	return SuccessMessage;
}


public WebElement FindcanButton()
{
	return FindcanButton;
}

public WebElement CanName()
{
	return CanName;
}

public WebElement select()
{
	return select;
}
}
