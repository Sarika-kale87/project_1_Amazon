package amazon1.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkoutpage {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])")
	WebElement addresschange_button;
	
	//@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[2]")
	@FindBy(xpath="(//input[@name='submissionURL'])[2]")
	WebElement address_change_radio_button;
	
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement deliver_to_this_address_button;
	
	//@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[2]")
	@FindBy(xpath="(//span[@class='a-declarative'])[10]")
	WebElement paymentmethod_change_button;
	
	@FindBy(xpath="(//span[@class='pmts-use-balance-value-descriptor'])[3]")//
	WebElement Amazonbalance_radio_button;
	
	@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	WebElement paymentcod_radio_button;
	
	//@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[2]")
	@FindBy(xpath="(//span[.='Credit or debit card'])")
	WebElement paymentmethod_creditcard_radio_button;
	
	//@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[3]")//
	@FindBy(xpath="(//span[.='Net Banking'])[4]")
	WebElement netbanking_radio_button;
	
	@FindBy(xpath="//span[.='Other UPI Apps']")//
	WebElement other_upi_radio_button;
	
	@FindBy(xpath="(//span[.='EMI'])[4]")//
	WebElement Emi_available_radio_button;
	
	@FindBy(xpath="(//span[@id='apx-add-credit-card-action-test-id'])")
	WebElement addcreditcard_details_iframe;
	
	@FindBy(xpath="//input[@data-testid='secondary-continue-button']") 
	WebElement use_this_paymentmethod_button;
	
	@FindBy(xpath="(//input[@id='placeOrder'])[1]")
	WebElement place_your_order_button;
	
	@FindBy(xpath="//span[.='Order Total:']")
	WebElement ordertotaltext;
	
	public void change_address()
	{
		wait.until(ExpectedConditions.elementToBeClickable(addresschange_button));
		addresschange_button.click();
	}
	public void address_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(address_change_radio_button));
		address_change_radio_button.click();
	}
	public void deliver_address_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(deliver_to_this_address_button));
		deliver_to_this_address_button.click();
	}
	public void change_paymentmethod() throws InterruptedException
	{
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(paymentmethod_change_button));
		paymentmethod_change_button.click();
		
	}
	public void paymentmethod_radio() throws InterruptedException
	{
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.elementToBeClickable(paymentcod_change_radio_button));
		paymentcod_radio_button.click();
		Assert.assertEquals(ordertotaltext.isDisplayed(),true);
		
	}
	public void use_this_paymentmethod()
	{
		wait.until(ExpectedConditions.elementToBeClickable(use_this_paymentmethod_button));
		use_this_paymentmethod_button.click();

		
	}
	public void place_order()
	{
		wait.until(ExpectedConditions.elementToBeClickable(place_your_order_button));
		place_your_order_button.click();
	}
	
	public void credit_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(paymentmethod_creditcard_radio_button));
		paymentmethod_creditcard_radio_button.click();
		
	}
	public void addcarddetails()
	{
		wait.until(ExpectedConditions.elementToBeClickable(addcreditcard_details_iframe));
		addcreditcard_details_iframe.click();
	}
	public void Amazonbalance_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Amazonbalance_radio_button));
		Amazonbalance_radio_button.click();
	}
	public void Netbanking_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(netbanking_radio_button));

		netbanking_radio_button.click();
		
	}
	public void otherupi_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(other_upi_radio_button));

		other_upi_radio_button.click();
	}
	public void Emi_available_radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Emi_available_radio_button));

		Emi_available_radio_button.click();
		
	}
	
	
	
	
	
	public Checkoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
