package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login 
{
	WebDriver driver;  
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement loginEmailAddress;
	
	@FindBy(xpath=".//*[@id='passw']")
	WebElement loginPassword;

	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submitButton;
	
	@DataProvider(name="loginData")
	  
	  @BeforeMethod
	  public void setup() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		  driver.get("http://automationpractice.com/index.php");
		  System.out.println("GitHub testing");
	  }
	  
	  
	  @Test(dataProvider="loginData")
	  public void login(String emailAddress,String password)
	  {
		  signIn.click();
			loginEmailAddress.sendKeys(emailAddress);
			loginPassword.sendKeys(password);
			submitButton.click();
			
	  }
	  
	  @AfterMethod
	  public void teardown() 
	  {
		  driver.quit();
	  }
	
}
