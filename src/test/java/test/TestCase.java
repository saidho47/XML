package test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginClass;
import util.BrowserFactory;


public class TestCase extends BrowserFactory {
	WebDriver driver;
	
	@Test
	@Parameters({"username", "password", "url"})
	public void TechFiosLogin(String username, String password , String url) throws IOException {
		
		driver= startBrowser();
		driver.get(url);
		
		LoginClass logintowebsite=PageFactory.initElements(driver, LoginClass.class);
		logintowebsite.login(username,password);
		
		//ContactPage Contact = PageFactory.initElements(driver, ContactPage.class);
		
		//Contact.FillUpContactForm(FullName,Company,Email,Phone,Address,City,Stat,Zip);
		
		
		driver.close();
		
		driver.quit();
		
		
	}

}
