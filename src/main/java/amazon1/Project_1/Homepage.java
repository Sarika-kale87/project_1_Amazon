package amazon1.Project_1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	
	@FindBy (xpath="//span[@class='nav-line-2 ']")
	//@FindBy (xpath="//span[.='Account & Lists']")
	WebElement account_and_list_hoverover;
	
	@FindBy(xpath="(//a[@class='nav-a'])[2]")
	WebElement New_user;

	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement sign_in_home;
	
	//@FindBy(xpath="(//span[@class='nav-text'])[6]")
	//@FindBy(xpath="(//span[@class='nav-text'])[14]")
	@FindBy(xpath="//span[.='Your Account']")
	WebElement your_profile;
	
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']")
	WebElement Edit_address;
	
	@FindBy(xpath="//a[@class='a-link-normal edit-link']")
	WebElement Edit_button;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_box_product1;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_box_product2;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_box_product3;
	
	@FindBy(xpath="//span[.='Returns']")
	WebElement return_and_order_hoverover;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement Your_order;
	
	public void yourorder()
	{
		wait.until(ExpectedConditions.visibilityOf(Your_order));
		Your_order.click();
	}
	
	public void accountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(account_and_list_hoverover).perform();
		
	}
	public void order_hoverover(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(return_and_order_hoverover).perform();
		return_and_order_hoverover.click();
		
	}
	public void signin()
	{
		sign_in_home.click();
	}
	public void New_user()
	{
		wait.until(ExpectedConditions.elementToBeClickable(New_user));
		New_user.click();
	}
	public void your_account()
	{
		wait.until(ExpectedConditions.elementToBeClickable(your_profile));
		your_profile.click();
	}
	public void edit_profile(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Edit_address));
		Edit_address.click();
		
	}
	public void edit_add_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Edit_button));
		Edit_button.click();
		
	}
	public void search_product1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(search_box_product1));
		search_box_product1.sendKeys("shoes"+Keys.ENTER);
	}
	public void search_product2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(search_box_product2));
		search_box_product2.sendKeys("mobile"+Keys.ENTER);
	}
	public void search_product3()
	{
		wait.until(ExpectedConditions.elementToBeClickable(search_box_product3));
		search_box_product3.sendKeys("drawing notebook"+Keys.ENTER);
	}
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	

}
