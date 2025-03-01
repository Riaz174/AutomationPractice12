package Capstone.AutomationPractice12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dates.click();
		Thread.sleep(10000);
		WebElement departdate = driver.findElement(By.xpath("(//div[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'])[26]"));
		departdate.click();
		

	}

}
