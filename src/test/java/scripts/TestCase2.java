package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_libraries.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {

	@Test
	
	public void tc2() throws Throwable
	{
		SkillraryLoginPage lp = new SkillraryLoginPage(driver);
		
		lp.gearsbutton();
		Thread.sleep(3000);
		lp.skillrarydemoapp();
		Thread.sleep(3000);
		
		
		utilities.switchingTabs(driver);
		Thread.sleep(3000);
		
		SkillraryDemoLoginPage dp = new SkillraryDemoLoginPage(driver);
		WebElement dpdown= dp.getSearchdropdown();
		
		Thread.sleep(3000);
		utilities.dropDown(dpdown, "Testing");
		Thread.sleep(3000);
		TestingPage tp = new TestingPage(driver);
		WebElement src = tp.getSelenium();
		WebElement target = tp.getCart();
		
		utilities.dragAndDrop(driver, src, target);
		Thread.sleep(10000);
		
	}
	
}
