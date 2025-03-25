package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage
{   
			
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}	
		@FindBy(xpath="//div[@class='row']//img")
		List<WebElement> searchProducts;
				
		@FindBy(name="quantity")
		WebElement txtquantity;
		
		@FindBy(xpath="//button[@id='button-cart']")
		WebElement btnaddToCart;
		
		@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
		WebElement cnfMsg;
		
		public boolean isProductExist(String productName)
		{
			for(WebElement product:searchProducts)			
				if(product.getAttribute("title").equals(productName))
					return true;

			return false;
		}
		
		public void selectProduct(String productName)
		{
			for(WebElement product:searchProducts)			
				if(product.getAttribute("title").equals(productName))
					product.click();
		}
		
		public void setQuantity(String qty)
		{
			txtquantity.clear();
			txtquantity.sendKeys(qty);
		}
		
		public void addToCart()
		{
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,250)", "");
			btnaddToCart.click();
		}
		
		public boolean checkConfMsg()
		{
			try
			{
				return cnfMsg.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
}
