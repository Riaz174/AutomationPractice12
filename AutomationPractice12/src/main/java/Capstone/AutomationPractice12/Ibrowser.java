package Capstone.AutomationPractice12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice12\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(6000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(6000);
		String whandle = driver.getWindowHandle();
		System.out.println(whandle);

	}

}
