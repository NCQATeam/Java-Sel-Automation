package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
WebDriver driver;
	By txt_username= By.id("user-name");
	By txt_password= By.id("password");
	By btn_login = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");
	// Constructor to initialize WebDriver
	public loginPage(WebDriver driver) {
        this.driver = driver; // ✅ Properly initializes 'driver' from the test
	}
    
	public void enterUsername(String Username)
	{
		driver.findElement(txt_username).sendKeys(Username);
	}
	public void enterPassword(String Password)
	{
		driver.findElement(txt_password).sendKeys(Password);
	}
	 public void clickLogin() {
	        driver.findElement(btn_login).click();
	    }

	    public boolean isLogoDisplayed() {
	        WebElement logo = driver.findElement(lbl_logo);
	        return logo.isDisplayed();
	    }
}
