package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement lnkSearchBox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") 
	WebElement lnkSearchBtn;
	
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	
	public void clickLogin()    // added in step5
	{
		linkLogin.click();
	}
	
	public void enterProductName(String prodName) 
	{
		lnkSearchBox.sendKeys(prodName);
	}
	
	public void clickSearch() 
	{
		lnkSearchBtn.click();
	}

}











