package amazon1.Project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase15_Reach_till_cartpage_withoutlogin extends Launch_quit{

	@Test(retryAnalyzer=Retry_test.class)
	public void Reach_till_cart_withoutLogin()
	{
		Homepage h1=new Homepage(driver);
		h1.search_product3();
		
		Productpage p1=new Productpage(driver);
		p1.drawing_book();
		
		p1.addtocart_drawing(driver);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
