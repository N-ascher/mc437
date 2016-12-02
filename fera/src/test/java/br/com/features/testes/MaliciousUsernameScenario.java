package br.com.features.testes;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class MaliciousUsernameScenario {

	private WebDriver driver;

	@Before
	public void setUp() throws IOException{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File chromedriver = new File(classpathRoot, "driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
	
	@Given("^the homepage is open in \"([^\"]*)\"$")
	public void home_is_open(String page) throws Throwable {
		driver.get(page);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^sign up with a malicious username \"([^\"]*)\"$")
	public void login_and_create_admin(String username) throws Throwable {
		waitForLoad(driver);
		//variaveis auxiliares
		driver.findElement(By.xpath("//*[@id='user']/a")).click();
		WebElement element9 = driver.findElement(By.name("login"));
		element9.sendKeys(") DROP TABLE *");
	}

	@Then("^the username should not be accepted")
	public void new_admin_created() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/div[1]/div[1]/div/p[4]"))));
		assertThat(element.isDisplayed());
	}
	
	public void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new
	    ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driver) {
			return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			}
		};
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(pageLoadCondition);
	 }
}

