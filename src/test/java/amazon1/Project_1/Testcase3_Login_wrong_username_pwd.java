package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase3_Login_wrong_username_pwd extends Launch_quit {
	
	@Test(retryAnalyzer=Retry_test.class)
	public void Login_wrong_un_pwd() throws EncryptedDocumentException, IOException
	{
		Homepage h1=new Homepage(driver);
		h1.accountandlist(driver);
		h1.signin();
		Invalid_loginpage l1=new Invalid_loginpage(driver);
		l1.un1();
		l1.con_key();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
