package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	public WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locator for username field
	By user = By.id("user");

	// Locator for password field
	By password = By.id("password");

	// Locator for login button
	By loginBtn = By.id("login");

	By loginAtlassianBtn = By.id("login-submit");

	public void completeUsername(String us) {

		driver.findElement(user).sendKeys(us);
	}

	public void completePassword(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin(String a) throws InterruptedException {

		// Este metodo, hace click en el boton de Log In.
		// Dependiendo que titulo tiene la pagina, es el id del boton que usa, siendo el
		// id de login de trello, diferente al de atlassian.
		if (a.equalsIgnoreCase("Log in to Trello")) {
			;
			driver.findElement(loginBtn).click();
		} else if (a.equalsIgnoreCase("Log in to continue - Log in with Atlassian account")) {

			driver.findElement(loginAtlassianBtn).click();
		}

	}

	/*
	 * @FindBy(xpath = "//input[@id='user']") private WebElement user;
	 * 
	 * @FindBy(xpath = "//input[@id='password']") private WebElement pass;
	 * 
	 * @FindBy(xpath = "//input[@id='login']") private WebElement atlassianLoginBtn;
	 * 
	 * @FindBy(xpath="//input[@id='password']") private WebElement atlassianUser;
	 * 
	 * 
	 * 
	 * public WebElement getUser() { return user; } public WebElement getPass() {
	 * return pass; }
	 * 
	 * public WebElement getAtlassianLoginBtn() { return atlassianLoginBtn; }
	 * 
	 * public WebElement getAtlassianUserInput() { return atlassianUser; }
	 */
}
