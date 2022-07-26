package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.DriverFactory;

public class CreateBoardPage extends DriverFactory {
	WebDriver driver;
	public WebDriverWait wait;

	public CreateBoardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locator to create new board
	By createNewBoardDiv = By.cssSelector("div.mod-add");

	//Locator for board name input
	By newBoardNameInput = By.cssSelector("input[data-test-id='create-board-title-input']");

	//Locator for "Crear" button
	By createBoardInput = By.cssSelector("button[data-test-id='create-board-submit-button']");

	
	public By createBoardBtn() {
		return createBoardInput;
	}
	
	
	public void completeBoard(String name) {
		
		driver.findElement(createNewBoardDiv).click();
		driver.findElement(newBoardNameInput).sendKeys(name);
	}
	public void createBoard() {

		driver.findElement(createBoardInput).click();
	}

}
