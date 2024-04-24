package STEP_DEF;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java. awt. Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import POM.Extent_Report;
import POM.Login_Page;
import POM.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LeadCreation {
	public static WebDriver driver= StepDefinition_01.driver;
	public static Extent_Report extreport=StepDefinition_01.extreport;
	@Given("User is in SAT Portal Dashboard view")
	public void user_is_in_sat_portal_dashboard_view() {
		Extent_Report.setUp("SAT Portal Lead creation test");
		extreport=new Extent_Report();
		Extent_Report.testname("Lead creation");
		driver.get(URL.Loginpage);
		driver.manage().window().maximize();
		Login_Page.username.click();
		Login_Page.username.sendKeys("testingSAT@bijlipay.co.in");
		Login_Page.password.click();
		Login_Page.password.sendKeys("password");	
		Login_Page.loginbutton.click();
//		RestAssured.baseURI="https://uatapp.bijlipay.co.in/";
//		RequestSpecification requestspecification= RestAssured.given();
//		Response response= requestspecification.request(Method.GET,"MBK/#/inventory/Phonepehome");
//		System.out.println(response.asPrettyString());
//		System.out.println(response.getStatusLine());
	}
	@When("User is going to create a lead by lead creation functionality")
	public void user_is_going_to_create_a_lead_by_lead_creation_functionality() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Login_Page.dynamicselection.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Bijlipay.click();
		Login_Page.leadcreation.click();
	}
	@Then("Entering {string} detail")
	public void entering_detail(String string) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Merchantname.click();
		Login_Page.Merchantname.sendKeys(string);

	}
	@Then("Enters contact name {string}")
	public void enters_contact_name(String string) {
		Login_Page.Contactname.click();
		Login_Page.Contactname.sendKeys(string);

	}
	@Then("Enters contact number {string}")
	public void enters_contact_number(String string) {
		Login_Page.contactnumber.click();
		Login_Page.contactnumber.sendKeys(string);
	}
	@Then("Enters alternate conatct number{string}")
	public void enters_alternate_conatct_number(String string) {
		Login_Page.alternatecontactnumber.click();
		Login_Page.alternatecontactnumber.sendKeys(string);
	}

	@Then("Enters mail id {string}")
	public void enters_mail_id(String string) {
		Login_Page.mailid.click();
		Login_Page.mailid.sendKeys(string);

	}
	@Then("Enters merchant address {string}")
	public void enters_merchant_address(String string) {
		Login_Page.merchantaddress.click();
		Login_Page.merchantaddress.sendKeys(string);

	}
	@Then("Enters pincode {string}")
	public void enters_pincode(String string) throws AWTException {
		Login_Page.pincode.click();
		Login_Page.pincode.sendKeys(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	@Then("Enters region {string}")
	public void enters_region(String string) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.selectregion.click();
		//		WebElement selectregion=Login_Page.selectregion;
		//		Select select=new Select(selectregion);
		//		select.selectByVisibleText(string);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='CHENNAI']")).click();

	}
	@Then("Enters lead source {string}")
	public void enters_lead_source(String string) {
		Login_Page.leadsource.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='LS_THE SHAMRAO VITHAL COOPERATIVE BANK']")).click();

	}
	@Then("Enters device type {string}")
	public void enters_device_type(String string) {
		Login_Page.devicetype.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='MPOS']")).click();

	}
	@Then("Enters device count {string}")
	public void enters_device_count(String string) {

		Login_Page.devicecount.sendKeys(string);
	}
	@Then("Submits the form")
	public void submits_the_form() {
		Login_Page.submit.click();
		Extent_Report.logpass("Lead created succesfully");
		driver.navigate().refresh();
		Extent_Report.afterScenario();
//		driver.findElement(By.xpath("//button[@class='q-btn inline relative-position q-btn-item non-selectable q-btn-rectangle q-btn-flat q-focusable q-hoverable text-grey-9 vertical-middle cursor-pointer']")).click();
//		driver.findElement(By.xpath("//div[text()='Logout']")).click();
	}




}
