package br.com.teste_6;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by gustavocarusos on 10/11/16.
 */
public class EditaEstadoDev {
    //
//	Scenario: Developer query at SADE
//	Given I already signed in as a Conpec member.
//	When I set the prefered ranking parameters and press Buscar
//	Then I should have a list of potential candidates ranked by the set parameters


    private WebDriver driver;

    @Before
    public void setUp() throws IOException {
//		File classpathRoot = new File(System.getProperty("user.dir"));
//		File chromedriver = new File(classpathRoot, "driver/chromedriver");
//		System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
//		driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
//		driver.close();
    }

    @Given("^the user is signed in and the page that edits the developer's profile is open\"([^\"]*)\"$")
    public void the_page_is_open(String page) throws Throwable {
//		driver.get(page);
    }


    @When("^Select the appropriate project and click on the 'Allocate' button")
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

    @Then("The developer should now appear as allocated.")
    public void a_page_should_show(String pagina) throws Throwable {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.textToBePresentInElement(By.id("content"), text));
//		assertThat(driver.getTitle()).contains(text);
    }
}
}
