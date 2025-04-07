package Capstone.AutomationPractice12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Utilities;

public class Property extends Utilities {
  @Test
  public void f() throws IOException {
	  Properties pro = new Properties();
	  FileInputStream ds = new FileInputStream("C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\Ahmar.properties");
	  pro.load(ds);
	  String name = pro.getProperty("Username");
	  String pword = pro.getProperty("Password");
	  System.out.println(name);
	  System.out.println(pword);
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
  }
}
