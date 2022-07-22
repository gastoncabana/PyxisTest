package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.DriverFactory;

public class BoardPage extends DriverFactory {
	WebDriver driver;
	public WebDriverWait wait;

	public BoardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locator for list name input
	By newListNameInput = By.cssSelector("input.list-name-input");
	//Locator for "Agregar Lista" buttonn 
	By addListBtn = By.cssSelector("input.mod-list-add-button");
	
	public void createList(String name) throws InterruptedException {
		driver.findElement(newListNameInput).sendKeys(name);
		driver.findElement(addListBtn).click();
	}
	
}
