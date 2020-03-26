

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListContactPage {
WebDriver driver;
	
	
	public ListContactPage (WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using ="//table[@class='table table-bordered table-hover sys_table']/thead/tr[1]/th")
	WebElement ListHeaders;

}
