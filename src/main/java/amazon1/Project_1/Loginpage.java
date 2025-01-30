package amazon1.Project_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Loginpage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(name = "email")
	// @FindBy(xpath="//input[@class='a-input-text']")
	WebElement username;

	@FindBy(xpath = "//a[@class='a-button-text']")
	WebElement createanaccount;

	// @FindBy(xpath="//span[@id='continue']")
	// @FindBy(className="a-button-input")
	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin_button;
	
	
	
	public void un() throws EncryptedDocumentException, IOException {

		// wait.until(ExpectedConditions.elementToBeClickable(username));
		// username.sendKeys("+41779963215");
		// username.sendKeys("pathak.saru@gmail.com");
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\kales\\eclipse-workspace\\Project_1\\Project1_excelddt\\Project1.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);

		String user1 = w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		username.sendKeys(user1);

	}

	public void newuser1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys("+41779963415");
	}

	

	public void create_an_account() {
		wait.until(ExpectedConditions.elementToBeClickable(createanaccount));
		createanaccount.click();

	}

	public void con_key() {
		wait.until(ExpectedConditions.elementToBeClickable(continue_button));
		continue_button.click();
		

	}

	public void pwd() throws EncryptedDocumentException, IOException {
		wait.until(ExpectedConditions.visibilityOf(password));
		// password.sendKeys("Amazon@2584");
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\kales\\eclipse-workspace\\Project_1\\Project1_excelddt\\Project1.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String passw = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		password.sendKeys(passw);

	}

	public void signin() {
		wait.until(ExpectedConditions.elementToBeClickable(signin_button));
		signin_button.click();
	}

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
