package Capstone.AutomationPractice12;

import org.testng.annotations.Test;

import Amazon.pages.Home;
import Amazon.pages.Signin;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon extends Utilities {
	
  @Test
  public void f() {
	  Home home = new Home(driver);
	  home.signinClick();
	  Signin sign = new Signin(driver);
	  sign.emailField();
	  sign.psswordF();
  }
   }


