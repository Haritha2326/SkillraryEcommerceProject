package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	//Declaration
	//address of gear webelement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	//address of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemo;
	
	//address of search text field
	@FindBy(name="q")
	private WebElement searchtab;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void gearsbutton()
	{
		gears.click();
	}
	
	public void skillrarydemoapp()
	{
		skillrarydemo.click();
	}
	
	public void search(String name)
	{
		searchtab.sendKeys(name);
	}
	
	public void gobutton()
	{
		searchbtn.click();
	}
}
