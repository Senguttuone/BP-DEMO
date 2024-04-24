package STEP_DEF;

import java.time.Duration;
import java.util.Iterator; 
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.ElementClickInterceptedException;
import POM.Driver_Selection;
import POM.Extent_Report;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import POM.Login_Page;

public class StepDefinition_01 {
	public static WebDriver driver;

	public static Extent_Report extreport;

	@Before()

	public void initialize() {

		driver=Driver_Selection.chrome();
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
//		
//		driver=new ChromeDriver();

		Login_Page loginpage=new Login_Page();

		loginpage.InitElements(driver);

		Extent_Report.setUp("SAT Portal Test");

		extreport=new Extent_Report();
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {

		driver.get("https://uatapp.bijlipay.co.in/frontend/#/");
		//		Login_Page.loginbutton.click();
//		WebElement email= driver.findElement(By.xpath("//div/div[text()='Email']"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", email);
//		jse.executeScript("document.getElementByID('//div/div[text()='Email']').click();");
//
//		jse.executeScript("document.getElementByID('//div/div[text()='Email']').value = 'testingSAT@bijlipay.co.in';");
	
	}
	@Given("some other precondition")
	public void some_other_precondition() {
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(2))
				.withTimeout(Duration.ofSeconds(30))
				.ignoring(ElementClickInterceptedException.class);
		Login_Page.username.click();
		Login_Page.username.sendKeys("testingSAT@bijlipay.co.in");
		
	}
	@When("I complete action")
	public void i_complete_action() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebElement password=driver.findElement(By.cssSelector("input:contains('password')"));
//		password.click();
//		password.sendKeys("password");
//		driver.findElement(By.cssSelector("div:contains('Password')")).sendKeys("password");
//		
		Login_Page.password.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Login_Page.password.sendKeys("password");
		Login_Page.loginbutton.click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementByID('/html/body/div[1]/div/div/main/div/div[2]/div/div[3]/div').value = 'password';");

		//Password xpath
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.click();
		password.sendKeys("password");
		Login_Page.loginbutton.click();
		Login_Page.leadcreation.click();
		Login_Page.Merchantname.click();
	    Login_Page.Merchantname.sendKeys("jj");
		
		
	}
	@When("some other action")
	public void some_other_action() {
		driver.findElement(By.xpath("//div/i[text()='check_box_outline_blank']")).click();
		
		//div[contains(text(),'KYC Exception')]
	}
	@When("yet another action")
	public void yet_another_action() {

	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}
	@Then("check more outcomes")
	public void check_more_outcomes() {

	}

}
