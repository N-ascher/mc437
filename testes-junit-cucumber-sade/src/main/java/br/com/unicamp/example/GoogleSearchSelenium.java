package br.com.unicamp.example;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchSelenium {

	public static void main(String[] args) {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File chromedriver = new File(classpathRoot, "driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/bodgeit/register.jsp");
		
		WebElement element = driver.findElement(By.name("Username"));
		element.sendKeys("student@unicamp.br");
		element.submit();
		WebElement element2 = driver.findElement(By.name("Password"));
		element2.sendKeys("student");
		element2.submit();
		//Confirm Password:
		WebElement element3 = driver.findElement(By.name("Confirm Password"));
		element3.sendKeys("student");
		element3.submit();
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Cucumber");
//		element.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.titleContains("Cucumber"));
		wait.until(ExpectedConditions.textToBePresentInElement(By.id("msg"), "You have successfully registered with The BodgeIt Store."));
		if (driver.getTitle().contains("You have successfully registered with The BodgeIt Store.")) {
			System.out.println("Success!");
		} else {
			System.out.println("Fail!");
		}
		
		driver.close();
	}

}
