package amazon1.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Productpage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[12]")
	WebElement filter_brand_checkbox;
	
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[8]")
	WebElement filter_color_checkbox;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[2]")
	WebElement mobile_details;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[5]")
	WebElement product_details_price_display;
	
	@FindBy(xpath="(//h1[@class='a-size-medium a-spacing-small'])")
	WebElement technical_details_product2;
	
	@FindBy(xpath="//select[@name='s']")
	WebElement sort_dropdown;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement Shoe_selected;
	
	@FindBy(id="a-autoid-99-announce")
	WebElement product_add_to_cart2;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement shoes_product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart_button;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	WebElement go_to_cart_button;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'])[2]")
	WebElement drawing_notebook;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])")
	WebElement addtocart_button_drawingbook;
	
	@FindBy(xpath="(//h2[.='Results'])")
	WebElement resulttext;
	
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	WebElement proceedtocheckout_button;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[6]")
	WebElement filter_size;
	
	public void addtocart_drawing(WebDriver driver)
	{
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		wait.until(ExpectedConditions.elementToBeClickable(addtocart_button_drawingbook));
		addtocart_button_drawingbook.click();
		
		Assert.assertEquals(proceedtocheckout_button.isDisplayed(), true);
	}
	public void filter_size()
	{
		wait.until(ExpectedConditions.elementToBeClickable(filter_size));
		filter_size.click();
	}
	
	public void filter_brand()
	{
		wait.until(ExpectedConditions.elementToBeClickable(filter_brand_checkbox));
		filter_brand_checkbox.click();
	}
	public void filter_color()
	{
		wait.until(ExpectedConditions.elementToBeClickable(filter_color_checkbox));
		filter_color_checkbox.click();
		Assert.assertEquals(resulttext.isDisplayed(), true);
	}
	public void mobile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(mobile_details));
		mobile_details.click();
	}
	public void product_price(WebDriver driver)
	{
		Set <String> s1=driver.getWindowHandles();
		Iterator <String> i1=s1.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		
		wait.until(ExpectedConditions.elementToBeClickable(product_details_price_display));
		product_details_price_display.isDisplayed();
	}
	public void tech_details()
	{
		wait.until(ExpectedConditions.elementToBeClickable(technical_details_product2));
		technical_details_product2.isDisplayed();
	}
	public void sort_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(sort_dropdown));
		Select s1=new Select(sort_dropdown);
		s1.selectByIndex(3);
		
		s1.selectByVisibleText("Price: High to Low");
	}
	public void productpage_addtocart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Shoe_selected));
		Shoe_selected.click();
		
	}
	public void addtocart(WebDriver driver)
	{
		Set <String> s1=driver.getWindowHandles();
		Iterator <String>i1=s1.iterator();
		String parentid= i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		wait.until(ExpectedConditions.elementToBeClickable(addtocart_button));
		addtocart_button.click();
		Assert.assertEquals(go_to_cart_button.isDisplayed(), true);
		
	}
	public void shoe()
	{
		wait.until(ExpectedConditions.elementToBeClickable(shoes_product));
		shoes_product.click();
		
	}
	public void gotocart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(go_to_cart_button));
		go_to_cart_button.click();
	}
	public void drawing_book()
	{
		wait.until(ExpectedConditions.elementToBeClickable(drawing_notebook));
		drawing_notebook.click();
	}
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	

}
