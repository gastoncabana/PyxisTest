package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

	
	
	By newListNameInput = By.cssSelector("input.list-name-input");
	By addListBtn = By.cssSelector("input.mod-list-add-button");
	
	public By newListName() {
		return newListNameInput;
	}
	
	
	public void createList(String name) throws InterruptedException {
		driver.findElement(newListNameInput).sendKeys(name);
		driver.findElement(addListBtn).click();
	}
	
}
