package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	//declaration
	//address of Add to cart
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	//address of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	
	//intialisation
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	
	public void addtocart()
	{
		addtocart.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	
}
