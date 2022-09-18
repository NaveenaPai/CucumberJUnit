package factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ConfigReader;

public class DriverFactory {

	public static WebDriver driver;	
	public static ThreadLocal<WebDriver> threadsafeDriver = new ThreadLocal<>();
	public static final Logger logger=LogManager.getLogger();	
	public WebDriver initialize_driver() {

		String driverPath;
		String browser = ConfigReader.getPropertyValue("browser");

		switch (browser) {
		case "chrome":
			driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			threadsafeDriver.set(driver);
			break;
		case "firefox":
			break;
		case "edge":
			break;
		default:
			System.out.println("Please pass the correct browser value: " + browser);
			break;
		}
		threadsafeDriver.set(driver);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();

		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return threadsafeDriver.get();
	}

}
