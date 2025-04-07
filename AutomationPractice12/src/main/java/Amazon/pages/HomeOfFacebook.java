package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends and the world around you on Facebook.')]") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(id = "pass") WebElement pword;
	@FindBy(name = "login") WebElement logbutton;
	
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verficationOfText() {
		String tx = text.getText();
		return tx;
		
	}
	public void userName(String id) {
		email.sendKeys(id);
		
	}
	public void pssword(String id) {
		pword.sendKeys(id);
		
	}
	public void login() {
		logbutton.click();
	}

}
