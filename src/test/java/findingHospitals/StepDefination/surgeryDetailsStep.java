package findingHospitals.StepDefination;

import java.io.IOException;

import com.utils.HelperClass;

import findingHospitals.PageObjects.surgery;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class surgeryDetailsStep {
	surgery s;
	@Given("user should be in practo.com home page")
	public void user_should_be_in_practo_com_home_page() {
	    s=new surgery(HelperClass.getDriver());
	}

	@When("user should click on surgeries")
	public void user_should_click_on_surgeries() {
		s.clickSurgeries();
	    
	}

	@Then("user should store the all the surgeries in list and display in consol output")
	public void user_should_store_the_all_the_surgeries_in_list_and_display_in_consol_output() throws IOException {
	    s.scrollToSurgeries();
	    s.listingSurgeries();
	}

	



}
