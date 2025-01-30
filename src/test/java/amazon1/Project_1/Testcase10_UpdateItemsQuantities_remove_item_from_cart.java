package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase10_UpdateItemsQuantities_remove_item_from_cart extends Launch_quit{
	
	@Test(retryAnalyzer=Retry_test.class)
	public void updateaddedItemsQuantity_remove_from_cart() throws InterruptedException, EncryptedDocumentException, IOException
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
	   // p1.gotocart();
	    
	    Addtocartpage a1=new Addtocartpage(driver);
	    a1.gotocart();
	    a1.increment_quantity();
	    a1.delete();
	    
	    	
	    		
		
		
		
		
		
		
		
		
		
	}

	private Productpage Productpage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}
