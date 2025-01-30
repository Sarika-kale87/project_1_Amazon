package amazon1.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocartpage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	
	@FindBy(xpath="(//input[@data-feature-id='proceed-to-checkout-action'])")
	WebElement proceed_to_checkout_button;
	
	//@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	@FindBy(id="nav-cart-count")
	WebElement go_to_cart_button;
	
	@FindBy(xpath="(//span[@class='a-icon a-icon-small-add'])[1]")
	WebElement quantity_increment_button;
	
	//@FindBy(xpath="(//input[@data-feature-id='item-delete-button'])")
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[1]")
	//@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement delete_button;
	
	
	public void proceed_to_checkout()
	{
		wait.until(ExpectedConditions.elementToBeClickable(proceed_to_checkout_button));
		proceed_to_checkout_button.click();
	}
	
	
	
	public void gotocart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(go_to_cart_button));
		go_to_cart_button.click();
	}
	public void increment_quantity() throws InterruptedException
	{
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(quantity_increment_button));
		int count=1;
		while(count<5)
		{
			Thread.sleep(4000);
			//wait.until(ExpectedConditions.elementToBeClickable(quantity_increment_button));
			quantity_increment_button.click();
			count++;
			Thread.sleep(4000);
			//wait.until(ExpectedConditions.elementToBeClickable(quantity_increment_button));
		}
		
	}
	public void delete()
	{
		wait.until(ExpectedConditions.elementToBeClickable(delete_button));
		delete_button.click();
	}
	
	
	public Addtocartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
