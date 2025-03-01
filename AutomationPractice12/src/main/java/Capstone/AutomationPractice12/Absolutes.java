package Capstone.AutomationPractice12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		/*WebElement sbox = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/div/input"));
		sbox.sendKeys("Computer");(This is absolute xpath)*/
		WebElement emailField = driver.findElement(By.xpath("//input[@type='text']"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement pword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys("abcdef7");
		Thread.sleep(6000);
		WebElement logbutton = driver.findElement(By.xpath("//button[@value='1']"));
		logbutton.click();
		Thread.sleep(6000);
		WebElement forgotbutton = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotbutton.click();
		Thread.sleep(6000);
		

	}

}
