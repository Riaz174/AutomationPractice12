package Capstone.AutomationPractice12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		Thread.sleep(6000);
		String currentwhandle = driver.getWindowHandle();
		System.out.println(currentwhandle);
		Set<String> windohandles = driver.getWindowHandles();
		//System.out.println(windohandles);
		Iterator<String> iterators = windohandles.iterator();
		String Firstwindowhandle = iterators.next();
		String Secondwindowhandle = iterators.next();
		System.out.println("This is First = " + Firstwindowhandle);
		System.out.println("This is second = " + Secondwindowhandle);
		driver.switchTo().window(Secondwindowhandle);
		Thread.sleep(6000);
		WebElement contact = driver.findElement(By.xpath("//*[text()='Contact']"));  
		contact.click();
		
		

	}

}
