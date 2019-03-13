package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidatePage 

{
	public WebDriver driver;
	public CandidatePage (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath=("//a[text()='Candidate']"))
WebElement CandidateTab;

@FindBy(xpath=("//i[contains(@class,'fa fa-plus')]"))
WebElement CandidateCreate;


@FindBy(id="cadidateNm")
WebElement CandidateName;

@FindBy(name="contactNumber")
WebElement PrimaryNum;


@FindBy(id="secondaryPhoneNumber")
WebElement SecondaryNum;

@FindBy(id="candidateDomain")
WebElement Domain;


@FindBy(name="emailId")
WebElement EmailId;

@FindBy(name="currentCompany")
WebElement CurrentCompany;

@FindBy(name="currentDesignation")
WebElement currentDesignation;

@FindBy(name="experienceLevelYears")
WebElement experience;

@FindBy(name="noticePeriod")
WebElement NoticePeriod;

@FindBy(name="currentLocation")
WebElement CurrentLocation;

@FindBy(name="currentCTC")
WebElement currentCTC;

@FindBy(id="candidateExpectedCTC")
WebElement expectedCTC;

@FindBy(id="candidateReferralName")
WebElement Referralname;

@FindBy(id="cvtext")
WebElement CopyCV;

@FindBy(xpath=("//button[@type='submit']"))
WebElement save;

@FindBy(id="toast-container")

WebElement SuccessMessage;


public WebElement CandidateTab()
{
	return  CandidateTab;
}

public WebElement CandidateCreate()
{
	return  CandidateCreate;
}


public WebElement CandidateName()
{
	return  CandidateName;
}
public WebElement  PrimaryNum()
{
	return   PrimaryNum;
}
public WebElement  SecondaryNum()
{
	return   SecondaryNum;
}

public WebElement  Domain()
{
	return   Domain;
}

public WebElement  EmailId()
{
	return   EmailId;
}


public WebElement  CurrentCompany()
{
	return   CurrentCompany;
}

public WebElement  currentDesignation()
{
	return   currentDesignation;
}

public WebElement  experience()
{
	return   experience;
}

public WebElement  NoticePeriod()
{
	return   NoticePeriod;
}


public WebElement  CurrentLocation()
{
	return   CurrentLocation;
}
public WebElement  currentCTC()
{
	return   currentCTC;
}
public WebElement   expectedCTC()
{
	return    expectedCTC;
}

public WebElement  Referralname()
{
	return   Referralname;
}

public WebElement  CopyCV()
{
	return   CopyCV;
}

public WebElement  save()
{
	return   save;
}
public WebElement SuccessMessage()
{
	return SuccessMessage;
}

}
