package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Collections 
{
  
  WebDriver driver;
  
  @BeforeMethod
  public void setup() 
  {
	  /*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");*/
  }
  
  @Test
  public void arrayList() 
  {
	 ArrayList al = new ArrayList();
	 al.add(10);
	 al.add(20);
	 al.add("Deepika");
	 al.add("Krishna"); 
	 System.out.println(al);
	 Object ol = al.get(1);
	 if(ol instanceof String)
	 {
		 String s= (String) ol;
		 System.out.println(s);
	 }
	 else if(ol instanceof Integer)
	 {
		 Integer I = (Integer) ol;
		 System.out.println(I);
	 }
	 
	 ArrayList<String> al2 = new ArrayList<>();
	 al2.add("Selenium");
	 al2.add("HighWire");
	 al2.add("Press");
	 System.out.println(al2.get(2));
	 
	 
  }
  
  @AfterMethod
  public void breakDown() 
  {
	  
  }

}
