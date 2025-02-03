package amazon1.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Invalid_loginpage {
	
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

	@FindBy(name = "email")
	// @FindBy(xpath="//input[@class='a-input-text']")
	WebElement username;
	
	@FindBy(id = "continue")
	WebElement continue_button;
	
	public void un1() {
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(".sarul.com");
	}
		public void con_key() {
			wait.until(ExpectedConditions.elementToBeClickable(continue_button));
			continue_button.click();
			Assert.assertEquals(username.isDisplayed(), true);
	
	
	
	
	
	
	

}
		
		public Invalid_loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		
	}
