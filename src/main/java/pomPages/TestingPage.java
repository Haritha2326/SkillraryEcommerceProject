package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	//declaration
	//address of selenium training
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	//address of add to cart
	@FindBy(xpath="//legend[text()='My cart']")
	private WebElement cart;
	
	//address of fb
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	//intialisation
	
		public TestingPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		
	//utilization
		public WebElement getSelenium() {
			return selenium;
		}

		public WebElement getCart() {
			return cart;
		}
		
		public void fb()
		{
			fb.click();
		}
		
}
