package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase4_User_Successfully_edit_profile_info extends Launch_quit{
	
	@Test(retryAnalyzer=Retry_test.class)
	public void user_can_edit_profile_info() throws EncryptedDocumentException, IOException
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
		h1.your_account();
		h1.edit_profile(driver);
		h1.edit_add_button(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
