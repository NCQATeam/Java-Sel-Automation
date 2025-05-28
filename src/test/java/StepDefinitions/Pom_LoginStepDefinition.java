package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class Pom_LoginStepDefinition {
	WebDriver driver;
    loginPage loginPage; 
    
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");	
        loginPage = new loginPage(driver);
	}

	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String Username, String Password) {
//	    driver.findElement(By.id("user-name")).sendKeys(Username); // Corrected
//	    driver.findElement(By.id("password")).sendKeys(Password); // Corrected
	
	loginPage.enterUsername(Username);
	loginPage.enterPassword(Password);
	}

	@When("Clicks on Login Button")
	public void clicks_on_login_button() {
	    //driver.findElement(By.id("login-button")).click();;
	loginPage.clickLogin();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
	loginPage.isLogoDisplayed();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
