package factory;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import utils.CommonUtils;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
//	        options.addArguments("headless");
//	        options.addArguments("window-size=1400,800");
//	        options.addArguments("disable-gpu");
			driver = new ChromeDriver(options);
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
//			FirefoxBinary firefoxBinary = new FirefoxBinary();
//			FirefoxOptions options = new FirefoxOptions();
//			options.setBinary(firefoxBinary);
//			options.addArguments("-headless");
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserName.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
		
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
		
	}

}
