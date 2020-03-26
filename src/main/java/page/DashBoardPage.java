package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage extends BasePage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@href='#']")
	WebElement CRM;

	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;
	
	@FindBy(how = How.NAME, using = "name")
	WebElement CustomerBox;

	public void ClickAddContact() {
		CRM.click();
		AddContact.click();
	}
	public void WaitForPage () {
		waitForElement(CustomerBox, driver);
	}
	public boolean isCustomerBoxDisplayed() {	
		WaitForPage();
		if (CustomerBox.isDisplayed()) {
			System.out.println("Customer box displayed");}
			else {System.out.println("Customer Box Not Displayed");
			}
		
		return true;
	}
}
