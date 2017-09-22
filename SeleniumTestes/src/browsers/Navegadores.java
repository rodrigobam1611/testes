package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navegadores {

	static WebDriver driver;
	
	public static WebDriver GoogleChrome(String url) {
		
	  System.setProperty("webdriver.chrome.driver", 
			"C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\SeleniumTestes\\WebDrivers\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  return driver;
	}
	
	public static WebDriver InternetExplorer(String url) {
		
	  System.setProperty("webdriver.ie.driver", 
			"C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\SeleniumTestes\\WebDrivers\\IEDriverServer.exe");
	  
	  driver = new InternetExplorerDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  return driver;
	}
	
	 
	
}
