package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase8_Check_Productsort_Relevance_price_rating extends Launch_quit {
	
	
	@Test(retryAnalyzer=Retry_test.class)
	public void Check_productsort() throws EncryptedDocumentException, IOException
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
		p1.sort_button();
		
		
	
		
		
		
	}
	
	
	
	
	
	

}
