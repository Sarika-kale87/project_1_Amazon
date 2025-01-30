package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase6_Verify_search_using_filters extends Launch_quit {
	
	
	@Test
	public void search_product_apply_filters() throws EncryptedDocumentException, IOException
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
		p1.filter_brand();
		p1.filter_color(); 
		
	
	}
	
	
	
	
	
	
	
	

}
