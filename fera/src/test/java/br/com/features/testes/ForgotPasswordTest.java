package br.com.features.testes;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class ForgotPasswordTest {
	
	
}
