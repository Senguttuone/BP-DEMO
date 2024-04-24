package POM;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	@FindBy(xpath="/html/body/div[1]/div/div/main/div/div[2]/div/div[2]/div/div/input")
	public static WebElement username;
	@FindBy(xpath="//input[@type='password']")
	public static WebElement password;
	@FindBy(xpath="//div/button[contains(@class,'bg-purple-9 text-white')]")
	public static WebElement loginbutton;
	@FindBy(xpath="//div[text()='Exception']")
	public static WebElement Exception;
	@FindBy(xpath="//div[contains(text(),'Stock Inventory (Bijlipay)')]")
	public static WebElement StockInventory;
	@FindBy(xpath="//div[@class='lg-q-title md-q-caption sm-q-caption text-weight-light text-center' and contains(text(),'Implementation')]")
	public static WebElement Implementation;
	@FindBy(xpath="//div[text()='Stock Inventory (Phonepe)']")
	public static WebElement StockInventoryphonepe;
	@FindBy(xpath="//div[text()='Service Request' and @class='lg-q-title sm-q-caption text-weight-light text-center']")
	public static WebElement Servicerequest;
	@FindBy(xpath="//div[text()='Aging Tracker']")
	public static WebElement Agingtracker;
	@FindBy(xpath="//div[text()='Merchant Tracker']")
	public static WebElement Merchanttracker;
	@FindBy(xpath="//i[text()='arrow_drop_down' and @class='q-icon q-if-control material-icons']")
	public static WebElement dropdown;
	@FindBy(xpath="//div[text()='Year']")
	public static WebElement year;
	@FindBy(xpath="//div/div[text()='Lead Creation']")
	public static WebElement leadcreation;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div/div/div/div[2]/div/div/form/div[1]/div/div/div[1]/div/div/input")
	public static WebElement Merchantname;
	@FindBy(xpath="//div[text()='*Contact Name']/following-sibling::input")
	public static WebElement Contactname;
	@FindBy(xpath="//div[text()='*Contact Number']/following-sibling::input")
	public static WebElement contactnumber;
	@FindBy(xpath="//div[text()='*Alternate Contact Number']/following-sibling::input")
	public static WebElement alternatecontactnumber;
	@FindBy(xpath="//div[text()='*Mail_Id']/following-sibling::input")
	public static WebElement mailid;
	@FindBy(xpath="//div[text()='*Merchant Address']/following-sibling::input")
	public static WebElement merchantaddress;
	@FindBy(xpath="//div[text()='Pincode']/following-sibling::input")
	public static WebElement pincode;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div/div/div/div[2]/div/div/form/div[1]/div/div/div[10]/div/i")
	public static WebElement selectregion;
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div[2]/main/div/div/div/div/div[2]/div/div/form/div[1]/div/div/div[11]/div/i")
	public static WebElement leadsource;
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div[2]/main/div/div/div/div/div[2]/div/div/form/div[1]/div/div/div[12]/div/i")
	public static WebElement devicetype;
	@FindBy(xpath="//div[text()='Device Count']/following::input")
	public static WebElement devicecount;
	@FindBy(xpath="//div[contains(text(),'Submit')]")
	public static WebElement submit;
	@FindBy(xpath="//i[text()='arrow_drop_down']")
	public static WebElement dynamicselection;
	@FindBy(xpath="//div[text()='Bijlipay']")
	public static WebElement Bijlipay;
	@FindBy(xpath="//div[text()='WIP Lead']")
	public static WebElement WIP;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/main/div/div/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/button/div[2]/div")
	public static WebElement UPDATE;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[13]/div/i")
	public static WebElement Select_merchant_state;
	@FindBy(xpath="//div[text()='TAMIL NADU']")
	public static WebElement Tamil_nadu;	
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[14]/div/i")
	public static WebElement Select_merchant_district;
	@FindBy(xpath="//div[text()='Chennai']")
	public static WebElement Chennai;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[15]/div/i")
	public static WebElement merchant_sub_district;
	@FindBy(xpath="//div[text()='Chennai']")
	public static WebElement merchant_sub_district_chennai;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[16]/div/i")
	public static WebElement merchant_town_village;
	@FindBy(xpath="//div[text()='Chennai(MCorp)']")
	public static WebElement chennai_Mcorp;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[18]/div/i")
	public static WebElement lead_source;
	@FindBy(xpath="//div[text()='LS_FEDERAL BANK']")
	public static WebElement federalbank;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[19]/div/i")
	public static WebElement select_device;
	@FindBy(xpath="//div[text()='MPOS']")
	public static WebElement MPOS;
	@FindBy(xpath="//div[@class='q-if row no-wrap items-end relative-position q-input q-if-has-label text-grey-9']")
	public static WebElement device_count_entry;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[21]/div/i")
	public static WebElement Select_merchant_category;
	@FindBy(xpath="//div[text()='Govt Entities']")
	public static WebElement Govt_Entity;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[22]/div/i")
	public static WebElement MDR_plan;
	@FindBy(xpath="//div[text()='Default']")
	public static WebElement MDR_plan_default;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[30]/div/i")
	public static WebElement select_plan;
	@FindBy(xpath="//div[text()='2 Year Plan']")
	public static WebElement twoyearplan;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[35]/div/div/input")
	public static WebElement amount_collected;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[36]/div/i")
	public static WebElement transaction_made_on;
	@FindBy(xpath="//span[text()='16']")
	public static WebElement date;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[38]/div/i")
	public static WebElement payement_type;
	@FindBy(xpath="//div[text()='NEFT']")
	public static WebElement NEFT;
	@FindBy(xpath="(//div[@class='q-if-label ellipsis full-width absolute self-start'])[2]")
	public static WebElement neftnumber_field;
	@FindBy(xpath="/html/body/div[3]/div/form/div/div[40]/div/i")
	public static WebElement select_merchant_type;
	@FindBy(xpath="//div[text()='Sole Proprietorship']")
	public static WebElement sole_proprietership;
	@FindBy(xpath="//button[@class='q-btn inline relative-position q-btn-item non-selectable q-btn-rectangle q-focusable q-hoverable bg-purple-9 text-white']")
	public static WebElement wipsubmit;
	@FindBy(xpath="//div[text()='Lead Validation']")
	public static WebElement Lead_Validation;
	@FindBy(xpath="//input[@class='col q-input-target q-no-input-spinner text-left']")
	public static WebElement Lead_search;
	@FindBy(xpath="(//i[text()='arrow_upward'])[1]")
	public static WebElement Date_sort;
	@FindBy(xpath="(//span[@class='label text-negative'])[1]")
	public static WebElement finance_status;
	@FindBy(xpath="(//span[@class='label text-negative'])[2]")
	public static WebElement SAT_status;
	@FindBy(xpath="//button[@class='q-btn inline relative-position q-btn-item non-selectable disabled q-btn-rectangle q-btn-outline q-focusable q-hoverable text-grey-9']")
	public static WebElement validate_button;
	@FindBy(xpath="//button[@class='q-btn inline relative-position q-btn-item non-selectable q-mx-sm q-btn-rectangle q-btn-outline q-focusable q-hoverable text-negative']")
	public static WebElement reject_button;
	
	
	//div[text()='Dashboard']
	
	
	
	
	
	
	
	public void InitElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}


