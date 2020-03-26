package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	 static WebDriver driver;
	

	public static WebDriver startBrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Said\\eclipse-workspace\\XmlData\\src\\main\\java\\util\\config.properties");
		prop.load(fis);

		String BrowserName = prop.getProperty("Browser");

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		} else if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}

		else if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		// WebDriver driver1 = new EdgeDriver();

		// driver.get("http://techfios.com/test/billing/?ng=admin/");

		return driver;

	}
	
}
