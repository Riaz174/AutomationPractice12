package Capstone.AutomationPractice12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import Common.Utilities;

public class Ilisteners extends Utilities implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver = ((Utilities)result.getInstance()).driver;
		 Date is = new Date();
		  System.out.println(is);
		  String sd = is.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(sd);
		  
		  File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			  org.openqa.selenium.io.FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\Pictures\\Pass\\"+sd+"picturesofwebsite.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((Utilities)result.getInstance()).driver;
		 Date is = new Date();
		  System.out.println(is);
		  String sd = is.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(sd);
		  
		  File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			  org.openqa.selenium.io.FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository27\\AutomationPractice12\\Pictures\\Failed\\"+sd+"picturesofwebsite.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	 }
