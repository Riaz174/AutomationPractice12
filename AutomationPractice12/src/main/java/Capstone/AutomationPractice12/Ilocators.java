package Capstone.AutomationPractice12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement sbutton = driver.findElement(By.id("nav-search-submit-text"));
		sbutton.click();
		Thread.sleep(6000);
		WebElement deals = driver.findElement(By.linkText("Today's Deals"));
		deals.click();
		Thread.sleep(10000);
		WebElement cservices = driver.findElement(By.partialLinkText("Customer"));
		cservices.click();
		Thread.sleep(6000);
		WebElement registery = driver.findElement(By.linkText("Registry"));
		registery.click();
		Thread.sleep(6000);
		WebElement gcards = driver.findElement(By.linkText("Gift Cards"));
		gcards.click();
		Thread.sleep(6000);
		WebElement sbox = driver.findElement(By.id("twotabsearchtextbox"));
		sbox.sendKeys("Computer");
		Thread.sleep(10000);
		WebElement amzon = driver.findElement(By.id("nav-logo-sprites"));
		amzon.click();
		Thread.sleep(10000);
		
		
		
		
		
		
		

	}

}
