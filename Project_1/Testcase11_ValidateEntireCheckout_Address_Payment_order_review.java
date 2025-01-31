package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase11_ValidateEntireCheckout_Address_Payment_order_review extends Launch_quit {
	
	@Test(retryAnalyzer=Retry_test.class)
	public void checkout_process() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Homepage h1=new Homepage(driver);
		h1.accountandlist(driver);
		h1.signin();
		
		Loginpage l1=new Loginpage(driver);
		l1.un();
		l1.con_key();
		l1.pwd();
		l1.signin();
		h1.search_product3();
		
		Productpage p1=new Productpage(driver);
		p1.drawing_book();
		p1.addtocart_drawing(driver);
		
		Addtocartpage a1=new Addtocartpage(driver);
		a1.proceed_to_checkout();
		
		Checkoutpage c1=new Checkoutpage(driver);
		
		c1.credit_radio();
		c1.Netbanking_radio();
		c1.otherupi_radio();
		c1.Emi_available_radio();
		
		c1.paymentmethod_radio();
		//c1.use_this_paymentmethod();
		
	
		
		
		
		
		
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
