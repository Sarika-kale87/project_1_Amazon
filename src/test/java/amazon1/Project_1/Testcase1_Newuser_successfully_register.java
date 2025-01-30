package amazon1.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase1_Newuser_successfully_register extends Launch_quit 
{

	@Test
	public void NewUser_registration() throws EncryptedDocumentException, IOException
	{
		
	   Homepage h1=new Homepage(driver);
	   h1.accountandlist(driver);
	   h1.signin();
	   Registrationpage r1=new Registrationpage(driver);
	   Loginpage l1=new Loginpage(driver);
	   l1.newuser1();
	   l1.create_an_account();
	   
	  
	  r1.customername();
	  r1.mobile_number();
	  r1.pwd();
	  r1.verify_button();
	 
	
	
	
	}
	
	
	
	
}
