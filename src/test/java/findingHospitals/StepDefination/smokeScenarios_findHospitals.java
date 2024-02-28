//package findingHospitals.StepDefination;
//
//import java.io.IOException;
//
//import org.testng.Assert;
//
//import com.utils.HelperClass;
//
//import findingHospitals.PageObjects.doctorDetails;
//import findingHospitals.PageObjects.healthWellness;
//import findingHospitals.PageObjects.homePage;
//import findingHospitals.PageObjects.surgery;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class smokeScenarios_findHospitals {
//	homePage hw;
//	doctorDetails dw;
//	surgery s;
//	healthWellness Hw;
//	
//	@Given("Browser should be opened and user navigates to practo.com site with url")
//	public void browser_should_be_opened_and_user_navigates_to_practo_com_site_with_url() {
//		hw=new homePage(HelperClass.getDriver());
//		dw=new doctorDetails(HelperClass.getDriver());
//		s= new surgery(HelperClass.getDriver());
//		Hw=new healthWellness(HelperClass.getDriver());
//	}
//	@Then("validate the practo.com site title")
//	public void validate_the_practo_com_site_title() {
//		 Assert.assertEquals(dw.title(),"Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests");
//	    
//	}
//
//
//	@When("user should clear the data present in home page location bar and  send the {string} name")
//	public void user_should_clear_the_data_present_in_home_page_location_bar_and_send_the_name(String string) throws InterruptedException {
//		hw=new homePage(HelperClass.getDriver());
//		hw.enterLocation(string);
//	}
//	@Then("navigate to doctor speciality search bar")
//	public void navigate_to_doctor_speciality_search_bar() {
//		hw=new homePage(HelperClass.getDriver());
//	    hw.clickDoctor();
//	}
//	@When("user should clear the data present in search  bar and user send the doctor dentist name")
//	public void user_should_clear_the_data_present_in_search_bar_and_user_send_the_doctor_dentist_name() throws InterruptedException {
//		hw=new homePage(HelperClass.getDriver());
//		hw.dentistClick();
//	    
//	}
//
//	
//
//	@Then("doctor details are displayed for entered speciality")
//	public void doctor_details_are_displayed_for_entered_speciality() throws InterruptedException {
//		dw=new doctorDetails(HelperClass.getDriver());
//		dw.displayDetails();
//	}
//
//	@When("user click surgries")
//	public void user_click_surgries() {
//		s= new surgery(HelperClass.getDriver());
//	    s.clickSurgeries();
//	}
//
//	@Then("user should verify the page is navigated to surgaries page")
//	public void user_should_verify_the_page_is_navigated_to_surgaries_page() {
//		s.scrollToSurgeries();
//	    Assert.assertEquals(s.surgeriesText(), "Popular Surgeries");
//	}
//
//	@Given("user is on surgeries page")
//	public void user_is_on_surgeries_page() {
//		s= new surgery(HelperClass.getDriver());
//
//	  
//	}
//
//	@When("user scrolls until popular surgaries")
//	public void user_scrolls_until_popular_surgaries() {
//	    s.scrollToSurgeries();
//	}
//
//	@Then("user should verify surgaries areextracted and  displayed in the consol output")
//	public void user_should_verify_surgaries_areextracted_and_displayed_in_the_consol_output() {
//	   s.listingSurgeries();
//	}
//
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//	   Hw=new healthWellness(HelperClass.getDriver());
//	}
//
//	@When("user clicks for corporate option")
//	public void user_clicks_for_corporate_option() {
//	    Hw.clickCorporate();
//	}
//
//	@When("user clicks  health and wellness option")
//	public void user_clicks_health_and_wellness_option() {
//	   Hw.selectingHealth();
//	}
//
//	@Then("schedule a demo form should be opened")
//	public void schedule_a_demo_form_should_be_opened() {
//		Assert.assertEquals(Hw.formOpen(),"Your Workplace Health and Wellness Partner");
//	   
//	}
//
//	@Given("user is on form page")
//	public void user_is_on_form_page() {
//		Hw=new healthWellness(HelperClass.getDriver());
//	   
//	}
//
//	@When("user enters valid name valid email and valid details")
//	public void user_enters_valid_name_valid_email_and_valid_details() throws IOException, InterruptedException {
//		Hw.setName();
//	    Hw.setOrganization();
//	    Hw.setContact();
//	    Hw.setMail();
//	    Hw.setSize();
//	    Hw.setInterested();
//	   
//	}
//
//
//	@Then("schedule a demo button should be enabled")
//	public void schedule_a_demo_button_should_be_enabled() throws IOException, InterruptedException {
//		
//	    Hw.demoValidate();
//	    Hw.refresh();
//	
//	    
//	    
//	}
//
//	@When("user click schedule a demo button")
//	public void user_click_schedule_a_demo_button() throws InterruptedException, IOException {
//		   
//		    Hw.demoClick();
//		    //Hw.refresh();
//		
//	   
//	}
//
//	@Then("Thank You message should be displayed confirming successful submission")
//	public void thank_you_message_should_be_displayed_confirming_successful_submission() throws InterruptedException {
//		   Hw.thankYou();
//	  
//	}
//	
//
//
//
//
//}
