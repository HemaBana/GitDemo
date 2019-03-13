package Resources;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.reporters.Files;


public class Base 
{
	public static WebDriver driver;
	public Properties pro;
public WebDriver intializebrowser() throws IOException
{
	pro=new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\hema\\RecPortal\\src\\main\\java\\Resources\\data.properties");
	pro.load(fis);
	String browsername = pro.getProperty("browser");
	System.out.println(browsername);
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_Latest.exe");
		 driver=new ChromeDriver();
	}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}

public void getScreenshot(String result) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File(".//Screenshots// "+result+" File1.png"));



	
}
}
