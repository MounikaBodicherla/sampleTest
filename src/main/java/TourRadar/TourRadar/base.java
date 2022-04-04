package TourRadar.TourRadar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class base {

	 
	 protected static WebDriver webdriver;

	
   @Parameters({"Browser"})
   @BeforeMethod
   
	public  static void runCapabilities(String browser)
	{ 
	   if(browser.equals("chrome"))
		{
			System.out.println("Running on chrome browser");
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
		    webdriver = new ChromeDriver(chromeOptions);
		    webdriver.get("https://www.tourradar.com/");
		    webdriver.manage().window().maximize();
		    webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Running on firefox browser");
			
			WebDriverManager.firefoxdriver().setup();
			webdriver = new FirefoxDriver();
			webdriver.get("https://www.tourradar.com/");
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("safari"))
		{
			System.out.println("Running on safari browser");
			WebDriverManager.safaridriver().setup();
			webdriver = new SafariDriver();
			webdriver.get("https://www.tourradar.com/");
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else
		{
			System.out.println("please enter proper environment and app name");
			
		}
						
	}
   
@AfterMethod
public  static void tear()
{
	if (webdriver != null) {
        webdriver.quit();
    }
}

  
}
    

	
	
	
	
	

	
	


	


