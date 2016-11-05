package br.com.unicamp.example;


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


public class DevQueryScenario {


//
//	Scenario: Developer query at SADE
//	Given I already signed in as a Conpec member.  
//	When I set the prefered ranking parameters and press Buscar
//	Then I should have a list of potential candidates ranked by the set parameters


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
	
	@Given("^the user is signed in and the page is the query page \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
//		driver.get(page);
	}


	@When("^I set my custom query parameters and click the search button")
	//I introduce my username "student@unicamp.br" and password "student"
	public void I_click_button (String buttonName) throws Throwable {
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

	@Then("^the page shows the list of developers ranked by the parameters")
	public void a_page_should_show(String pagina) throws Throwable {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.textToBePresentInElement(By.id("content"), text));
//		assertThat(driver.getTitle()).contains(text);
	}
}
