package Capstone.AutomationPractice12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement caccount = driver.findElement(By.linkText("Create new account"));
		caccount.click();
		Thread.sleep(6000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("John");
		Thread.sleep(6000);
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Doe");
		Thread.sleep(6000);
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select dayofbirth = new Select(bday);
		dayofbirth.selectByIndex(20);
		Thread.sleep(6000);
		WebElement mbirth = driver.findElement(By.name("birthday_month"));
		Select monthofbirth = new Select(mbirth);
		monthofbirth.selectByValue("10");
		Thread.sleep(6000);
		WebElement ybirth = driver.findElement(By.name("birthday_year"));
		Select yearofbirth = new Select(ybirth);
		yearofbirth.selectByVisibleText("2000");
		Thread.sleep(6000);
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		
		
		

	}

}
