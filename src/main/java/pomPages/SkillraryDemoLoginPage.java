package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	//declaration
	//address of course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium traing
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seltraining;
	
	//address of dropdown
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement searchdropdown;
	
	//initialization
	
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	
	public void seleniumtrainingtab()
	{
		seltraining.click();
	}

	public WebElement getSearchdropdown() {
		return searchdropdown;
	}
	
	
}
