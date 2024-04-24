package STEP_DEF;

import org.openqa.selenium.WebDriver;

import POM.Extent_Report;
import POM.Login_Page;
import POM.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition_Dashboard {
	public static WebDriver driver;
	public static Extent_Report extreport;


	@Given("User is loging in using his credential")
	public void user_is_loging_in_using_his_credential() {
		Extent_Report.setUp("SAT Portal Dashboard Test");
		extreport=new Extent_Report();
		Extent_Report.testname("User login");
		driver= StepDefinition_01.driver;
		driver.get(URL.Loginpage);
		Login_Page.username.click();
		Login_Page.username.sendKeys("testingSAT@bijlipay.co.in");
		Login_Page.password.click();
		Login_Page.password.sendKeys("password");
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

	}
	@Given("He is checking the Exception count")
	public void he_is_checking_the_exception_count() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Extent_Report.testname("User checking the Exception count");
		Boolean exceptiondisplayed=Login_Page.Exception.isDisplayed();
		if(exceptiondisplayed)
			Extent_Report.logpass("exception displayed");
		else
			Extent_Report.logfail("Exception not displayed");
	}
	@Given("checks Stock Inventory")
	public void checks_stock_inventory() {
		Boolean StockInventory=Login_Page.StockInventory.isDisplayed();
		Extent_Report.testname("User is checking stock inventory");
		if(StockInventory)
			Extent_Report.logpass("Inventory displayed-success");
		else
			Extent_Report.logpass("Inventory not displayed-fail");


	}
	@Given("Checks Implementation")
	public void checks_implementation() {
		Boolean Implementation=Login_Page.Implementation.isDisplayed();
		Extent_Report.testname("User is checking for Implementation list");
		if(Implementation)
			Extent_Report.logpass("Implementation details displayed");
		else
			Extent_Report.logpass("Implementation details not-displayed");

	}
	@Then("checking for Phone pe Stock inventory")
	public void checking_for_phone_pe_stock_inventory() {
		Boolean Stockinventoryphonepe=Login_Page.StockInventoryphonepe.isDisplayed();
		Extent_Report.testname("User is viewing Stock inventory details of Phone pe");
		if(Stockinventoryphonepe)
			Extent_Report.logpass("Phonepe stock inventory - displayed");
		else
			Extent_Report.logfail("Phonepe stock inventory - notdisplayed");
	}
	@Then("Checking Internal and External service request")
	public void checking_internal_and_external_service_request() {
		Boolean Servicerequest=Login_Page.Servicerequest.isDisplayed();
		Extent_Report.testname("User is viewing Service request");
		if(Servicerequest)
			Extent_Report.logpass("Service request - displayed");
		else
			Extent_Report.logfail("Service request - notdisplayed");	
	}
	@Then("Checking aging tracker and Merchant tracker")
	public void checking_aging_tracker_and_merchant_tracker() {
		Boolean Merchanttracker=Login_Page.Merchanttracker.isDisplayed();
		Extent_Report.testname("User is viewing Merchantracker");
		if(Merchanttracker)
			Extent_Report.logpass("Merchant tracker - displayed");
		else
			Extent_Report.logfail("Merchant tracker - notdisplayed");

		Boolean Agingtracker=Login_Page.Agingtracker.isDisplayed();
		Extent_Report.testname("User is viewing Aging tracker");
		if(Agingtracker)
			Extent_Report.logpass("Aging tracker -displayed");
		else
			Extent_Report.logfail("Aging tracker- not displayed");
	}
	@Then("Selecting the Merchant tracker chart from days to year")
	public void selecting_the_merchant_tracker_chart_from_days_to_year() {

		Login_Page.dropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.year.click();

		Extent_Report.afterScenario();
		
	}

}
