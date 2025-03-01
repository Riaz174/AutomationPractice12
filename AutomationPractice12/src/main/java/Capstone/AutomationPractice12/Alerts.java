package Capstone.AutomationPractice12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/popups.php");
		driver.manage().window().maximize();
		WebElement alert = driver.findElement(By.name("alert"));
		alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Alert is displayed");
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		WebElement confirmation = driver.findElement(By.name("confirmation"));
		confirmation.click();
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		

	}

}
