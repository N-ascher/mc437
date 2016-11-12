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


public class GoogleSearchScenario {


//  Scenario: Developer finishes registration process
//    Given the registration page is open at "http://177.220.85.24:8081/#/register"
//    When Dev clicks fill the formulary and clicks press enter
//    Then the page should display "alert alert-sucess ng-scope"




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
	
	@Given("^the registration page is open at \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
		driver.get(page);
	}
    
	@When("^Dev clicks fill the formulary and clicks press enter")
	//I introduce my username "student@unicamp.br" and password "student"
	public void DevClicksOnRegister (String buttonName) throws Throwable {
		String email = "celsar@cealser.com";
		WebElement element = driver.findElement(By.name("login"));
		element.sendKeys("celso");
		//element.submit();
		WebElement element2 = driver.findElement(By.name("email"));
		element2.sendKeys(email);
		//element2.submit();
		WebElement element3 = driver.findElement(By.name("password"));
		element3.sendKeys("celso");
        WebElement element4 = driver.findElement(By.name("confirmPassword"));
		element4.sendKeys("celso");
		element4.submit();
	}

	@Then("the page should display \"([^\"]*)\"$")
	public void AnEmailShouldBeSent(String email) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = driver.findElement(By.className(email));
		assertThat(element != null);
	}
}
