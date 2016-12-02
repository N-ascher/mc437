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

public class CreateAdminScenario {

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
	
	@Given("^the homepagepage is open \"([^\"]*)\"$")
	public void home_is_open(String page) throws Throwable {
		driver.get(page);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^i navigate to the create new admin dialogue and i fill all the necessary information")
	public void login_and_create_admin() throws Throwable {
		waitForLoad(driver);
		//variaveis auxiliares
		String str = "adminnovo@admin.com";
		//aperta entre
		driver.findElement(By.xpath("//*[@id='account-menu']/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='login']")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("password")).submit();
		driver.navigate().to("https://grupo-5-sade.herokuapp.com/#/user-management");;
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/button/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[2]/input")).sendKeys("adminnovo");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[3]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[4]/input")).sendKeys("novo");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[5]/input")).sendKeys(str);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[7]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[7]/select/option[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div[8]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[2]/span[2]")).click();
		
	}

	@Then("^a new admin should be registered")
	public void new_admin_created() throws Throwable {
		String str = "adminnovo@admin.com";
		waitForLoad(driver);
		assertThat(driver.getPageSource().contains(str));
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

