package findingHospitals.StepDefination;

import org.testng.Assert;

import com.utils.HelperClass;

import findingHospitals.PageObjects.doctorDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homePageStep {
	 doctorDetails dp;
	@Given("user should open the browser and navigates to practo.com site with url")
	public void user_should_open_the_browser_and_navigates_to_practo_com_site_with_url() {
	    dp=new doctorDetails(HelperClass.getDriver());
	}

	@Then("verify the title of practo.com site")
	public void verify_the_title_of_practo_com_site() {
		 Assert.assertEquals(dp.title(),"Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests");
	   
	}

}
