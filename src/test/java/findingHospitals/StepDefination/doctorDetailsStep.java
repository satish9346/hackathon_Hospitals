package findingHospitals.StepDefination;

import java.io.IOException;

import com.utils.HelperClass;

import findingHospitals.PageObjects.doctorDetails;
import findingHospitals.PageObjects.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class doctorDetailsStep {
	doctorDetails dp=new doctorDetails(HelperClass.getDriver());
	homePage hp;
	@Given("user is on practo.com home page")
	public void user_is_on_practo_com_home_page() {
		
		hp=new homePage(HelperClass.getDriver());
	    
	}

	@Then("user should clear the location and send the {string} name")
	public void user_should_clear_the_location_and_send_the_name(String string) throws InterruptedException {
		hp.enterLocation(string);
	   
	}

	@When("user searches for doctor {string} in home page search bar")
	public void user_searches_for_doctor_in_home_page_search_bar(String string) throws InterruptedException {
	   hp.selectSpeciality(string);
	}

	@When("user selects male from {string} dropdown")
	public void user_selects_male_from_dropdown(String string) throws InterruptedException {
	   dp.genderClick(string);
	}

	@When("user selects thirty plus Patient Stories from {string} dropdown")
	public void user_selects_thirty_plus_patient_stories_from_dropdown(String string) throws InterruptedException {
		dp.storiesClick(string);
	  
	}

	@When("user selects ten plus years   from {string} dropdown")
	public void user_selects_ten_plus_years_from_dropdown(String string) throws InterruptedException {
		
	    dp.experienceClick(string);
	}

	@When("user selects experience high-low from {string} dropdown")
	public void user_selects_experience_high_low_from_dropdown(String string) throws InterruptedException {
	    dp.sortByClick(string);
	}


	@When("user selects {string} from allFilters")
	public void user_selects_from_all_filters(String string) throws InterruptedException {
	   dp.fee();
	   dp.availability();
	}
	@When("user selects {string} from dropdown")
	public void user_selects_from_dropdown(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  dp.availability();
	}

	@Then("validate top {int} doctor details are displayed in experience order")
	public void validate_top_doctor_details_are_displayed_in_experience_order(Integer int1) throws InterruptedException, IOException {
	    dp.displayDetails();
	}

	@Then("user should navigate back to home page by clicking practo icon")
	public void user_should_navigate_back_to_home_page_by_clicking_practo_icon() {
	   dp.navigateBack();
	}

}
