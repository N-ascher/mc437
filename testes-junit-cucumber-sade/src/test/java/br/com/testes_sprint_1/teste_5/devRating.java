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

public class AvaliacaoDevCenario {

//
//  Scenario: developer rating after finishing a project  
//  Given a project is currently in progress
//  When the project is marked as finished
//  Then the rating page should be open

	private WebDriver driver;

	@Before
	public void setUp() throws IOException{
	}
	
	@After
	public void tear_down(){
	}
	
	@Given("^a project is currently in progress \"([^\"]*)\"$")
	public void project_is_in_progress(String projectName) throws Throwable {
	}

	@When("^the project is marked as finished \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void project_is_finished(String projectName) throws Throwable {

	}

	@Then("^the rating page should be open \"([^\"]*)\"$")
	public void open_rating_page(String pagina) throws Throwable {

	}
}

