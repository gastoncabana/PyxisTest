package Technical.Interview;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import PageObject.BoardPage;
import PageObject.CreateBoardPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import resources.DriverFactory;

public class Pyxis extends DriverFactory {
	WebDriver driver;

	@BeforeMethod
	public void initialize() throws IOException {

		driver = init();
	}

	@Parameters({ "user", "password", "boardName", "listName" })
	@Test
	public void navigate(String user, String password, String boardName, String listName) throws InterruptedException {

		
		/* Aqui, la unica funcionalidad es dirigirnos desde trello.com a trello.com/Login. 
		 HomePage hp = new HomePage(driver);
		 hp.getIniciarSesionLink().click();*/

		// Login Page : User Log in
		LoginPage lp = new LoginPage(driver);
		lp.completeUsername(user);
		lp.clickLogin(driver.getTitle());
		wait.until(ExpectedConditions.titleContains("Atlassian"));
		lp.completePassword(password);
		lp.clickLogin(driver.getTitle());

		// Board Creation page : User creates board
		CreateBoardPage cp = new CreateBoardPage(driver);
		cp.completeBoard(boardName);
		wait.until(ExpectedConditions.elementToBeClickable(cp.createBoardBtn()));
		cp.createBoard();

		// List creation : User creates List in the board
		BoardPage bp = new BoardPage(driver);
		bp.createList(listName);

	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			String actualDateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File(System.getProperty("user.dir") + "\\Screenshots\\screen" + actualDateTime + ".png"));
		}
		driver.quit();
	}

}
