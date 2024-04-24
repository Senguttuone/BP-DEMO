package STEP_DEF;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import POM.Driver_Selection;
import POM.Extent_Report;
import POM.Login_Page;
import POM.ScreenshotUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginfunctionality {
	WebDriver driver;
	Extent_Report extreport=StepDefinition_01.extreport;
	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		Extent_Report.setUp("SAT Portal Login functionality Test");
		extreport=new Extent_Report();
		Extent_Report.testname("login using valid credentials");
		driver=StepDefinition_01.driver;
		driver.get("https://uatapp.bijlipay.co.in/frontend/#/");
	}
	@When("User is entering {string} in user id field")
	public void user_is_entering_in_user_id_field(String string) {
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(2))
				.withTimeout(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
		Login_Page.username.click();
		Login_Page.username.sendKeys("testingSAT@bijlipay.co.in");
	}
	@Then("Entering {string} in password field")
	public void entering_in_password_field(String string) {
		Login_Page.password.click();
		Login_Page.password.sendKeys(string);
	}
	@Then("User clciking login button")
	public void user_clciking_login_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.loginbutton.click();
		String currentwindow=driver.getCurrentUrl();
		if(currentwindow.equalsIgnoreCase("https://uatapp.bijlipay.co.in/frontend/#/"))
			Extent_Report.logpass("Login successfull");
		else
			Extent_Report.logfail("Login failed");
//		ScreenshotUtility.takeScreenshot(driver, currentwindow, null)

		Extent_Report.afterScenario();
		

	}

}
