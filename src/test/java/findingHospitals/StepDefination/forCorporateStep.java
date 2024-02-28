package findingHospitals.StepDefination;

import java.io.IOException;

import com.utils.HelperClass;

import findingHospitals.PageObjects.healthWellness;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forCorporateStep {
	healthWellness hw;
	@Given("user should be on practo.com home page")
	public void user_should_be_on_practo_com_home_page() {
		hw=new healthWellness(HelperClass.getDriver());
	    
	}

	@When("user selects for corporate element")
	public void user_selects_for_corporate_element() {
	    hw.clickCorporate();
	}

	@When("user clicks Health and wellness plan")
	public void user_clicks_health_and_wellness_plan() {
	   hw.selectingHealth();
	}

	@When("user enters valid email and valid details")
	public void user_enters_valid_email_and_valid_details() throws IOException, InterruptedException{
	    hw.setName();
	    hw.setOrganization();
	    hw.setContact();
	    hw.setMail();
	    hw.setSize();
	    hw.setInterested();
	}

	@Then("validate the demo button")
	public void validate_the_demo_button() throws InterruptedException {
		hw.demoClick();

	    
	}

	@Then("capture the thank you message")
	public void capture_the_thank_you_message() throws InterruptedException {
		hw.thankYou();
		hw.refresh();
	    
	}

	@When("user enters invalid email and valid remaining details")
	public void user_enters_invalid_email_and_valid_remaining_details() throws IOException, InterruptedException {
		  hw.setName();
		    hw.setOrganization();
		    hw.setContact();
		    hw.setMail();
		    hw.setSize();
		    hw.setInterested();
		    hw.refresh();
		
	   
	}

	@Then("navigate directly to to the home page")
	public void navigate_directly_to_to_the_home_page() {
	    hw.navigateHome();
	}
	
	


}
