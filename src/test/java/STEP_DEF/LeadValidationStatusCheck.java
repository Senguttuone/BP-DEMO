package STEP_DEF;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.Extent_Report;
import POM.Login_Page;
import POM.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadValidationStatusCheck {
	public static WebDriver driver= StepDefinition_01.driver;
	public static Extent_Report extreport=StepDefinition_01.extreport;
	@Given("User is in lead validation page and clicks on date sorting")
	public void user_is_in_lead_validation_page_and_clicks_on_date_sorting() {
		Extent_Report.setUp("SAT Portal Lead Validation test");
		extreport=new Extent_Report();
		Extent_Report.testname("login using valid credentials-> select bijlipay-> lead validation -> sort by date ");
		driver.get(URL.Loginpage);
		driver.manage().window().maximize();
		Login_Page.username.click();
		Login_Page.username.sendKeys("testingSAT@bijlipay.co.in");
		Login_Page.password.click();
		Login_Page.password.sendKeys("password");	
		Login_Page.loginbutton.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Login_Page.dynamicselection.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Bijlipay.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Lead_Validation.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Date_sort.click();
		Extent_Report.logpass("Date sort done successfully");

	}
	@Given("User is searching in search tab with a valid lead id {string}")
	public void user_is_searching_in_search_tab_with_a_valid_lead_id(String string) {
		Extent_Report.testname("User searching a valid lead ID in table");
		Login_Page.Lead_search.click();
		Login_Page.Lead_search.sendKeys(string);

		List<WebElement> list=driver.findElements(By.xpath("//span[@class='label text-primary']"));
		for(WebElement TID:list)
		{
			if(TID.getText().equalsIgnoreCase(string))
			{
				TID.click();
				Extent_Report.logpass("Lead ID found and searching functionality working as expected");
			}
			
		}


	}
	@When("User confirming the Finance approval status is pending")
	public void user_confirming_the_finance_approval_status_is_pending() {
		Extent_Report.testname("Validating finacnce status");
		if((Login_Page.finance_status.getText()).contains("pending"))
		{
			Extent_Report.logpass("finance approval pending as expected");
		}
		else
		{
			Extent_Report.logfail("finance approval success before approval");
		}

	}
	@When("User confirms SAT status before finance approval as pending")
	public void user_confirms_sat_status_before_finance_approval_as_pending() {
		Extent_Report.testname("Validating SAT Status");
		if((Login_Page.SAT_status.getText()).contains("pending"))
		{
		Extent_Report.logpass("SAT status pending as expected");
		}
		else
		{
			Extent_Report.logfail("SAT approval success before approval");
		}


	}
	@When("User confirms VALIDATE button is disabled before finance approval")
	public void user_confirms_validate_button_is_disabled_before_finance_approval() {
		Extent_Report.testname("Validate button should disable before finance approval");
		if(Login_Page.validate_button.isEnabled())
		{
			Extent_Report.logfail("Validate disabled as expected");
		}
		else
		{
			Extent_Report.logfail("Validate enabled before finance approval");
		}


	}
	@Then("User confirms REJECT LEAD button is Enabled")
	public void user_confirms_reject_lead_button_is_enabled() {
		Extent_Report.testname("Reject lead to be enabled");
		if(Login_Page.reject_button.isEnabled())
		{
			Extent_Report.logpass("Reject button is enabled as expectd");
		}
		else
		{
			Extent_Report.logfail("Test fail - Rejection button disabled");
		}


	}
	@Then("User confirms the lead details has come to lead validation list")
	public void user_confirms_the_lead_details_has_come_to_lead_validation_list() {
		Extent_Report.testname("Lead is in lead validation table after WIP data entry");
		Extent_Report.logpass("Test successfull");
		Extent_Report.afterScenario();


	}

}
