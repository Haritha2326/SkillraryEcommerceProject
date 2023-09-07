package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_libraries.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass 
{
	@Test
	
	public void tc1() throws Throwable
	{
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.gearsbutton();
		Thread.sleep(3000);
		slp.skillrarydemoapp();
		Thread.sleep(3000);
		
		
		utilities.switchingTabs(driver);
		Thread.sleep(3000);
		
		SkillraryDemoLoginPage dl = new SkillraryDemoLoginPage(driver);
		WebElement course = dl.getCoursetab();
		utilities.mouseHover(driver, course);
		Thread.sleep(3000);
		
		dl.seleniumtrainingtab();
		Thread.sleep(3000);
		
		AddToCartPage cart = new AddToCartPage(driver);
		
		WebElement add=cart.getAddbtn();
		utilities.doubleClick(driver, add);
		
		Thread.sleep(3000);
		
		cart.addtocart();
		
		utilities.alertPopup(driver);
		
		Thread.sleep(3000);
	}
	
}
