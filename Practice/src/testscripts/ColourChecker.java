package testscripts;

import static org.testng.Assert.assertTrue;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ColourChecker {

	WebDriver driver;  
	  
	  @BeforeMethod
	  public void setup() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		  driver.get("http://portal-ers_portal_qa.auto-drupal-qa-web02.highwire.org/");
	  }
	  
	  
	  @Test
	  public void colourChecker() 
	  {
		
		 // String color = driver.findElement(By.xpath(".//*[@id='section-content']")).getCssValue("background-color");
		 // System.out.println(color);
		  
		  String colorString = driver.findElement(By.xpath(".//*[@id='jnl-ers-about-journal-snippet']/div/p")).getAttribute("class");
		  String arrColor[] = colorString .split("#");
		  assertTrue(arrColor[1].equals("FFFFFF"));
	  
	 
	  }   
	  
	  

	  @AfterMethod
	  public void teardown() 
	  {
		  //driver.quit();
	  }
}
