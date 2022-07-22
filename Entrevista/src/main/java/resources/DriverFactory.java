package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	static WebDriver driver;
	public static Properties prop;
	static Properties account;
	public WebDriverWait wait;
	public FileInputStream fis;

	public WebDriver init() throws IOException {

		
		// chromedriver location and start up
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");

		//data.properties load
		 prop= new Properties();
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		 prop.load(fis);
		 String browserName=prop.getProperty("browser");
		 System.out.println(browserName);
		 
		 
		//Chrome option configurations
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		//Getting value if headless is set true, or false from data.properties
		String headless = prop.getProperty("headless");
		if(headless.equals("true")) {
		options.addArguments("--headless");
		}
		
		//Initialize driver, with chrome options
		WebDriver driver = new ChromeDriver(options);
		
		//More webdriver properties and url to test
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		
		wait = new WebDriverWait(driver, 20);
		return driver;
	}
	
	
}
