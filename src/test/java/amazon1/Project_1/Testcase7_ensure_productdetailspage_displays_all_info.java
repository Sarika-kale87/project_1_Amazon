package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(value=Listeners_logic.class)
public class Testcase7_ensure_productdetailspage_displays_all_info extends Launch_quit{
	
	@Test
	public void ensure_productdetails_display() throws EncryptedDocumentException, IOException
	{
		Homepage h1=new Homepage(driver);
		h1.accountandlist(driver);
		h1.signin();
		
		Loginpage l1=new Loginpage(driver);
		l1.un();
		l1.con_key();
		l1.pwd();
		l1.signin();
		h1.search_product2();
		Productpage p1=new Productpage(driver);
		p1.mobile();
		p1.product_price(driver);
		p1.tech_details();
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
