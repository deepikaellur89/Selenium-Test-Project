package testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvancedSearch_Jounals 
{
		WebDriver driver;
		
		@BeforeMethod
		public void setup() 
		{
			  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		}
		  
		  
		  @Test
		  public void advancedSearch_Jounals()
		  {
			  driver.get("http://iijournals.stage.highwire.org/");
			  driver.manage().window().maximize();
			  driver.findElement(By.linkText("Advanced Search")).click();
			  driver.findElement(By.xpath(".//*[@id='edit_jcode_chosen']/ul/li/input")).click();
			  WebElement drop=driver.findElement(By.xpath(".//*[@id='edit_jcode_chosen']/div/ul"));
			  List<WebElement> listdrop=drop.findElements(By.tagName("li"));
			  System.out.println("Total number of journals in the List : " + listdrop.size());
			  
			  for(int i=0;i<=listdrop.size();i++)
			  {
				  //System.out.println(listdrop.get(i).getText());
				  listdrop.get(i).click();
				 driver.findElement(By.id("edit-submit")).click();
				 String result = driver.findElement(By.xpath(".//*[@id='search-summary-wrapper--2']/h2")).getText();
				 System.out.println(result);
				 
				 driver.navigate().back();
				 drop=driver.findElement(By.xpath(".//*[@id='edit_jcode_chosen']/div/ul"));
				 listdrop=drop.findElements(By.tagName("li"));	 
				 
			  }  	  
			  
		  }
		  
		  @AfterMethod
		  public void teardown() 
		  {
			  //driver.quit();
		  }

	}


