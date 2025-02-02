package amazon1.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Launch_quit {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	
	public void launch(String browsername)
	{
		
		if(browsername.equals("Edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
		}
		else if (browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			
		}
		
	}
	/*public void launch1()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}*/
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
