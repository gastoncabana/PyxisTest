package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.DriverFactory;

public class HomePage extends DriverFactory {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")
	private WebElement iniciarSesionLink;
	
	
	public WebElement getIniciarSesionLink() {
		return iniciarSesionLink;
	}

	
	
}
