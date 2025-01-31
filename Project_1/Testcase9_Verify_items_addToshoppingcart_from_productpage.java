package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase9_Verify_items_addToshoppingcart_from_productpage extends Launch_quit {
	

	@Test(retryAnalyzer=Retry_test.class)
	public void Verify_item_addtoshoppingcart() throws EncryptedDocumentException, IOException
	{
		Homepage h1=new Homepage(driver);
		h1.accountandlist(driver);
		h1.signin();
		
		Loginpage l1=new Loginpage(driver);
		l1.un();
		l1.con_key();
		l1.pwd();
		l1.signin();
	    h1.search_product1();
	    Productpage p1=new Productpage(driver);
	    p1.shoe();
	    p1.addtocart(driver);
	    
	   
	    
	}
	
	
	
	
	
	
	
	
	
	
	

}
