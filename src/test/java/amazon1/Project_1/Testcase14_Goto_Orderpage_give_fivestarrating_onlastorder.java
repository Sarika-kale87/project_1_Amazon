package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase14_Goto_Orderpage_give_fivestarrating_onlastorder extends Launch_quit
{
	
	@Test(retryAnalyzer=Retry_test.class)
	public void give_ratings_on_previous_orders() throws EncryptedDocumentException, IOException
	{
		Homepage h1=new Homepage(driver);
		h1.accountandlist(driver);
		h1.signin();
		
		Loginpage l1=new Loginpage(driver);
		l1.un();
		l1.con_key();
		l1.pwd();
		l1.signin();
		
		h1.accountandlist(driver);
		h1.yourorder();
		
		Productpage p1=new Productpage(driver);
		p1.leave_seller_feedback();
		p1.ratings();
	}
	
	
	
	
	
	
	
	

}
