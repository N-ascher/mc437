package br.com.features.testes;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static org.assertj.core.api.Assertions.assertThat;


public class DevFinishesRegProcess {


// Scenario: Developer finishes registration process
//   Given the registration page is open
//   When Dev clicks on “Register” and the form properly filled
//   Then an email should be automatically sent to Conpec




	private WebDriver driver;

	@Before
	public void setUp() throws IOException{
//		File classpathRoot = new File(System.getProperty("user.dir"));
//		File chromedriver = new File(classpathRoot, "driver/chromedriver");
//		System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
//		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown(){
//		driver.close();
	}
	
	@Given("^the registration page is open $")
	public void the_page_is_open(String page) throws Throwable {
//		driver.get(page);
	}


	@When("^Dev clicks on “Register” and the form properly filled $")
	//I introduce my username "student@unicamp.br" and password "student"
	public void DevClicksOnRegister (String buttonName) throws Throwable {
//		WebElement element = driver.findElement(By.name("username"));
//		element.sendKeys(username);
//		//element.submit();
//		WebElement element2 = driver.findElement(By.name("password1"));
//		element2.sendKeys(password);
//		//element2.submit();
//		WebElement element3 = driver.findElement(By.name("password2"));
//		element3.sendKeys(password);
//		element3.submit();
	}

	@Then("^a page should show $")
	public void AnEmailShouldBeSent(String email) throws Throwable {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.textToBePresentInElement(By.id("content"), text));
//		assertThat(driver.getTitle()).contains(text);
	}
}
