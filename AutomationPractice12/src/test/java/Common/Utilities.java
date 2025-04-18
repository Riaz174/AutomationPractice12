package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utilities {
	public WebDriver driver;
	@Parameters({"browser","Wbsite"}) //very essential for xml file to work
	@BeforeMethod
  public void Browsers(String browser, String Wbsite) {
	  if(browser.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to(Wbsite);
	  driver.manage().window().maximize();
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\src\\Drivers\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.navigate().to(Wbsite);
		  driver.manage().window().maximize();
	  }else {
		  System.out.println("Correct the name of driver");
		  }
	  }
 @AfterMethod
  public void afterMethod() throws InterruptedException {
	 Thread.sleep(6000);
	 driver.quit();
 }
  
 public void shots() throws IOException {
	  Date is = new Date();
	  System.out.println(is);
	  String sd = is.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(sd);
	  
	  File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\Pictures\\"+sd+"picturesofwebsite.jpg"));
	
 }
}
