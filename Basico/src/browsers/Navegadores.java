package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegadores {

	static WebDriver driver;
	
	public static WebDriver GoogleChrome(String url) {
		
	  System.setProperty("webdriver.chrome.driver", 
			"C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\Basico\\WebDrivers\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  return driver;
	}
	
	public static WebDriver InternetExplorer(String url) {
		
	  System.setProperty("webdriver.ie.driver", 
			"C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\Basico\\WebDrivers\\IEDriverServer.exe");
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();//E
	  driver.get(url);
	  
	  return driver;
	}

	public static WebDriver Firefox(String url) {
		
		  System.setProperty("webdriver.gecko.driver", 
				"C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\Basico\\WebDrivers\\geckodriver.exe");
		  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  
		  return driver;
		}
	 
	
}
