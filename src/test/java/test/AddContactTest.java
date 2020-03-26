package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.ContactPage;
import page.DashBoardPage;
import page.LoginClass;
import util.BrowserFactory;

public class AddContactTest {

	@Test
	@Parameters({"username", "password", "FullName", "Company", "Email", "Phone", "Address", "City","Stat", "Zip"})
	public void AddingContacts(String username, String password, String FullName, String Company, String Email,
			String Phone, String Address, String City, String Stat, String Zip) throws IOException {

		WebDriver driver = BrowserFactory.startBrowser();
		LoginClass logintowebsite = PageFactory.initElements(driver, LoginClass.class);

		logintowebsite.login(username, password);
		String expectedTitle = "Dashboard- TechFios Test Application - Billing";

		String actuelTitle = logintowebsite.getPageTitle();

		Assert.assertEquals(expectedTitle, actuelTitle);

		DashBoardPage DashBoard = PageFactory.initElements(driver, DashBoardPage.class);

		DashBoard.isCustomerBoxDisplayed();

		DashBoard.ClickAddContact();

		ContactPage contact = PageFactory.initElements(driver, ContactPage.class);

		contact.FillUpContactForm(FullName,Company,Email,Phone,Address,City,Stat,Zip);

		driver.close();
		driver.quit();
	}
}