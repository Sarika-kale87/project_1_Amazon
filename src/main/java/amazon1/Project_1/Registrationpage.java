package amazon1.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Registrationpage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement customerName;
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Verifymobilenumber;
	
	public void customername()
	{
		wait.until(ExpectedConditions.elementToBeClickable(customerName));
		customerName.sendKeys("Sharv kale");
	}
	public void mobile_number()
	{
		wait.until(ExpectedConditions.elementToBeClickable(mobilenumber));
		mobilenumber.sendKeys("+41779963215");
		
	}
	
	
	
	
	public void pwd()
	{
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Amazon@1720");
	}
	public void verify_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Verifymobilenumber));
		Verifymobilenumber.click();
		Assert.assertEquals(Verifymobilenumber.isDisplayed(), true);
	}

	public Registrationpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
