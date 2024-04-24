package STEP_DEF;

import java.util.Iterator;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java. awt. Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.Extent_Report;
import POM.Login_Page;
import POM.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WIP_Lead_Data_Update {
	public static WebDriver driver= StepDefinition_01.driver;
	public static Extent_Report extreport=StepDefinition_01.extreport;
	@Given("User Login using valid credentials")
	public void user_login_using_valid_credentials() {
		Extent_Report.setUp("SAT Portal Lead creation WIP Data");
		extreport=new Extent_Report();
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
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_Page.Bijlipay.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Login_Page.leadcreation.click();
		
 
	    
	}
	@Given("User selecting bijlipay lead creation WIP status")
	public void user_selecting_bijlipay_lead_creation_wip_status() {
		Extent_Report.testname("Lead creation WIP-open");
		Login_Page.WIP.click();
		Extent_Report.logpass("WIP Selection");
		
		  
	}
	@When("User clicking on WIP update")
	public void user_clicking_on_wip_update() {
		Extent_Report.testname("Lead creation WIP-UPDATE");
		Login_Page.UPDATE.click();
		Extent_Report.logpass("WIP UPDATE WINDOW OPENED");
	    
	}
	@When("User Selects state {string}")
	public void user_selects_state(String string) throws AWTException, InterruptedException {
		Extent_Report.testname("Lead creation WIP-State selection");
		Login_Page.Select_merchant_state.click();
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.xpath("//div[text()='"+string+"']")).click();
//		List<WebElement> list= driver.findElements(By.xpath("//div[@class='q-popover scroll column no-wrap animate-popup-up']/div/div/div/div"));
//		System.out.println(list.get(0).getText());
//		for(WebElement state:list)
//		{	
//			System.out.println(state.getText()); 
//			if(state.getText().equalsIgnoreCase(string))
//			{
//				state.click();
//				break;
//			}
//			
//		}
		Extent_Report.logpass("STATE SELECTION");

		}
	@When("User selects merchant district {string}")
	public void user_selects_merchant_district(String string) {
		Extent_Report.testname("Lead creation WIP-District selection");
		Login_Page.Select_merchant_district.click();
	    Login_Page.Chennai.click();
	    Extent_Report.logpass("DISTRICT SELECTION");


 
	    
	}
	@When("User selects merchant subdistrict {string}")
	public void user_selects_merchant_subdistrict(String string) {
		Extent_Report.testname("Lead creation WIP-SubDistrict selection");
		Login_Page.merchant_sub_district.click();
		Login_Page.merchant_sub_district_chennai.click();
		Extent_Report.logpass("SUBDISTRICT SELECTION");
		
 
	    
	}
	@When("User selects merchant sub district {string}")
	public void user_selects_merchant_sub_district(String string) {
		Extent_Report.testname("Lead creation WIP-Town village selection");
	   Login_Page.merchant_town_village.click();
	   Login_Page.chennai_Mcorp.click();
	   Extent_Report.logpass("TOWN VILLAGE SELECTION");
		
 
	    
	}
	@When("User selects lead source banks {string}")
	public void user_selects_lead_source_banks(String string) throws InterruptedException, AWTException {
		Extent_Report.testname("Lead creation WIP-Lead source selection");
		Login_Page.lead_source.click();
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		Login_Page.federalbank.click();
		 Extent_Report.logpass("LEAD SOURCE SELECTION");
 
	    
	}
	@When("User selects device type {string}")
	public void user_selects_device_type(String string) throws InterruptedException, AWTException {
		Extent_Report.testname("Lead creation WIP-Device type selection");
		Login_Page.select_device.click();
//		Login_Page.MPOS.click();
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Extent_Report.logpass("DEVICE TYPE SELECTION");
		
	    
	}
	@When("user enters device count {string}")
	public void user_enters_device_count(String string) {
		Extent_Report.testname("Lead creation WIP-Device Count entry");
		Login_Page.devicecount.click();
		Login_Page.devicecount.clear();
		Login_Page.devicecount.sendKeys(string);
		Extent_Report.logpass("DEVICE COUNT ENTERED");
 
	    
	}
	@When("User selects merchant category type {string}")
	public void user_selects_merchant_category_type(String string) throws InterruptedException, AWTException,StaleElementReferenceException  {
		Extent_Report.testname("Lead creation WIP-Merchant category selection");
		Login_Page.Select_merchant_category.click();
//		Thread.sleep(3000);
//		Login_Page.Govt_Entity.click();
		//div[@class='q-item-label'] //div[@class='q-item-label']
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='q-item-label']"));
		for(WebElement type:list)
		{
		if(type.getText().equalsIgnoreCase(string))
		{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			break;
		}
		}
		Extent_Report.logpass("MERCHANT CATEGORY ");
	   }
	@When("User selects MDR plan as {string}")
	public void user_selects_mdr_plan_as(String string) throws InterruptedException {
		Extent_Report.testname("Lead creation WIP-MDR Plan selection");
		Login_Page.MDR_plan.click();
		Thread.sleep(3000);
		Login_Page.MDR_plan_default.click();  
		Extent_Report.logpass("MDR Plan selection");
	}
	@When("User selects Plan period {string}")
	public void user_selects_plan_period(String string) throws InterruptedException {
		Extent_Report.testname("Lead creation WIP-Plan period");
		Login_Page.select_plan.click();
		Thread.sleep(1000);
		Login_Page.twoyearplan.click(); 
		Extent_Report.logpass("Plan period selection");
		
	}
	@When("User enters amount collected {string}")
	public void user_enters_amount_collected(String string) {
		Login_Page.amount_collected.click();
		Login_Page.amount_collected.sendKeys(string);
		//		Login_Page.amount_collected.sendKeys(string);
//		List<WebElement> list= driver.findElements(By.xpath("//div[@class='q-if-label ellipsis full-width absolute self-start']"));
//		for(WebElement type:list)
//		{
//			System.out.println(type.getText());
//		if(type.getText().equalsIgnoreCase("*Amout Collected"))
//		{
//			System.out.println(type);
//			type.sendKeys(string);
//		}
//		}
		
	    
	}
	@When("User select transaction date on calendar {string}")
	public void user_select_transaction_date_on_calendar(String string) throws InterruptedException {
		Login_Page.transaction_made_on.click();
		Thread.sleep(30);
//		Login_Page.date.click();
 
	    
	}
	@When("User select payment type as {string}")
	public void user_select_payment_type_as(String string) {
 //default for neft
	    
	}
	@When("User enters NEFT number {string}")
	public void user_enters_neft_number(String string) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(10000);

	    
	}
	@When("User selects merchant type {string}")
	public void user_selects_merchant_type(String string) {
//		Login_Page.select_merchant_type.click();
//		List<WebElement> list= driver.findElements(By.xpath("//div[@class='q-item-label']"));
//		for(WebElement type:list)
//		{
//			int i=0;
//			System.out.println("|"+type.getText()+"|");
//		if(type.getText().equalsIgnoreCase(string))
//		{
//			
//			System.out.println("1");
//			System.out.println(type.getText());  
//			list.get(i).click();
//			
//		}
//		i++;
//
//		}
		
	    
	}
	@Then("User submits to SAT")
	public void user_submits_to_sat() {
		Extent_Report.testname("Lead creation WIP-Data Submitted");
		Login_Page.wipsubmit.click();
		Extent_Report.logpass("SUBMISSION");
		Extent_Report.afterScenario();
		driver.close();
		

	}

	 ////div[@class='q-item-main q-item-section cursor-pointer menu-item-color' and text()='Lead Validation']  

}
