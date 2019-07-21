package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CHhomepage {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("^i enter url$")
	public void i_enter_url()  {
	    driver.get("https://www.gov.uk/");
	}

	@When("^i search for companies house$")
	public void i_search_for_companies_house() {
		driver.findElement(By.xpath(".//input[@id='search-main-3b348447']")).clear();
		driver.findElement(By.xpath(".//input[@id='search-main-3b348447']")).sendKeys("companies house");
	}

	@Then("^i click on search button$")
	public void i_click_on_search_button()  {
		driver.findElement(By.xpath(".//button[@class='gem-c-search__submit']")).click();
	    
	}

	@Then("^i click on companies house title$")
	public void i_click_on_companies_house_title()  {
		driver.findElement(By.xpath(".//div[@id='js-results']//li[1]//a[1]")).click();
	    
	}
	
	
	@When("^i click on Benefits title$")
	public void i_click_on_Benefits_title() {
		driver.findElement(By.xpath(".//ul[@class='categories-list']//a[contains(text(),'Benefits')")).click();
	}

	@Then("^i click on How benefits work$")
	public void i_click_on_How_benefits_work() { 
		driver.findElement(By.xpath(".//h3[contains(text(),'How benefits work')]")).click();
	}

	@Then("^i click on Benefits calculator$")
	public void i_click_on_Benefits_calculator() {
		driver.findElement(By.xpath("")).click();
	}

	@Then("^i clcik on Policy in Practice$")
	public void i_clcik_on_Policy_in_Practice() { 
		driver.findElement(By.xpath("")).click();
	}

	@Then("^i click on Start Calculation button$")
	public void i_click_on_Start_Calculation_button() { 
		driver.findElement(By.xpath("")).click();
	}

	@Then("^i enter Name$")
	public void i_enter_Name() { 
		driver.findElement(By.xpath(".//input[@id='input_name']")).clear();
		driver.findElement(By.xpath(".//input[@id='input_name']")).sendKeys("suresh");
	}

	@Then("^i select Relationship status$")
	public void i_select_Relationship_status() {
		driver.findElement(By.xpath(".//label[@class='radio-inline input_relationship_status selected']//span[@class='overlay']")).click();
	}

	@Then("^i enter Post code$")
	public void i_enter_Post_code() { 
		driver.findElement(By.xpath(".//input[@id='input_postcode']")).clear();
		driver.findElement(By.xpath(".//input[@id='input_postcode']")).sendKeys("CF24 0JH");
	}

	@Then("^i enter Date of Birth$")
	public void i_enter_Date_of_Birth() { 
		driver.findElement(By.xpath(".//input[@id='input_dob_user']")).clear();
		driver.findElement(By.xpath(".//input[@id='input_dob_user']")).sendKeys("01/01/1980");
	}

	@Then("^i enter your Partners date of birth$")
	public void i_enter_your_Partners_date_of_birth() { 
		driver.findElement(By.xpath(".//input[@id='input_dob_partner']")).clear();
		driver.findElement(By.xpath(".//input[@id='input_dob_partner']")).sendKeys("02/08/1980");
		
	}
	    
	@Then("^i enter benefit claim start date$")
	public void i_enter_benefit_claim_start_date() { 
		driver.findElement(By.xpath(".//input[@id='input_dateofclaim']")).clear();
		driver.findElement(By.xpath(".//input[@id='input_dateofclaim']")).sendKeys("01/01/2019");
	}

	@Then("^i select no of dependant children$")
	public void i_select_no_of_dependant_children() { 
		driver.findElement(By.xpath(".//select[@id='input_number_of_children']")).sendKeys("3");
		
	}

	@Then("^i select no of other Adults in household$")
	public void i_select_no_of_other_Adults_in_household() {		
		driver.findElement(By.xpath(".//select[@id='input_numberof_nondependants']")).sendKeys("1");
		
	}

	@Then("^i select any one disabled person$")
	public void i_select_any_one_disabled_person() { 
		driver.findElement(By.xpath(".//label[@class='radio-inline input_placeholder_disability selected']")).click();
	}

	@Then("^i click on continue to property details button$")
	public void i_click_on_continue_to_property_details_button() { 
		driver.findElement(By.xpath(".//a[@class='btn primary continue-button right-button']")).click();
	}
}
