//package findingHospitals.StepDefination;
//
//import java.io.IOException;
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
//public class regressionScenarios_findHospitals {
//	  homePage hw;
//	  doctorDetails dw;
//	  surgery s;
//	  healthWellness Hw;
//	@Given("user prsent in practo.com home page")
//	public void user_prsent_in_practo_com_home_page() {
//		hw = new homePage(HelperClass.getDriver());
//		dw = new doctorDetails(HelperClass.getDriver());
//		s = new surgery(HelperClass.getDriver());
//		Hw = new healthWellness(HelperClass.getDriver());
//	}
//	@When("user searches doctor details in particular {string}")
//	public void user_searches_doctor_details_in_particular(String string) throws InterruptedException {
//	    hw.enterLocation(string);
//	    hw.clickDoctor();
//	    hw.dentistClick();
//	}
//
//	@Then("the top five doctor details should be displayed")
//	public void the_top_five_doctor_details_should_be_displayed() throws InterruptedException {
//	   dw.displayDetails();
//	}
//
//	@Given("user is on dentists  page")
//	public void user_is_on_dentists_page() {
//	   dw=new doctorDetails(HelperClass.getDriver());
//	}
//	@Then("user clicks on genderdropdown and able to select male doctors from gender dropdown")
//	public void user_clicks_on_genderdropdown_and_able_to_select_male_doctors_from_gender_dropdown() throws InterruptedException {
//	   dw.maleClick();
//	}
//
//	@Then("user clicks on {string} dropdown and select Experience - High to Low from sort by dropdown")
//	public void user_clicks_on_dropdown_and_select_experience_high_to_low_from_sort_by_dropdown(String string) throws InterruptedException {
//		dw = new doctorDetails(HelperClass.getDriver());
//		dw.sortByClick(string);
//	}
//
//	@Then("user clicks on {string} dropdown and select ten plus years experience  from experience dropdown")
//	public void user_clicks_on_dropdown_and_select_ten_plus_years_experience_from_experience_dropdown(String string) throws InterruptedException {
//		dw = new doctorDetails(HelperClass.getDriver());
//		dw.experienceClick(string);
//	}
//
//	@Given("user is on practo website")
//	public void user_is_on_practo_website() {
//		s = new surgery(HelperClass.getDriver());
//	}
//
//	@When("use navigates to surgaries section")
//	public void use_navigates_to_surgaries_section() {
//	   s.clickSurgeries();
//	}
//
//	@Then("all surgeries listed in the page are extracted and stored in a list")
//	public void all_surgeries_listed_in_the_page_are_extracted_and_stored_in_a_list() {
//	    s.listingSurgeries();
//	}
//
//	@Given("user is on health and wellness form page")
//	public void user_is_on_health_and_wellness_form_page() {
//		Hw = new healthWellness(HelperClass.getDriver());
//	}
//
//	@When("user fills out the form with valid email and valid details")
//	public void user_fills_out_the_form_with_valid_email_and_valid_details() throws IOException, InterruptedException {
//		    Hw.clickCorporate();
//		    Hw.selectingHealth();
//		    Hw.setName();
//		    Hw.setOrganization();
//		    Hw.setContact();
//		    Hw.setMail();
//		    Hw.setSize();
//		    Hw.setInterested();
//
//	}
//
//	@Then("user should able to click the schedule a demo button")
//	public void user_should_able_to_click_the_schedule_a_demo_button() throws InterruptedException {
//		Hw.demoClick();
//		Hw.refresh();
//	}
//
//	@Given("user is on form page")
//	public void user_is_on_form_page() {
//		Hw = new healthWellness(HelperClass.getDriver());
//
//	}
//	@When("user enters valid name valid organization and valid details")
//	public void user_enters_valid_name_valid_organization_and_valid_details() throws IOException, InterruptedException {
//		    Hw.setName();
//		    Hw.setOrganization();
//		    Hw.setContact();
//		    Hw.setMail();
//		    Hw.setSize();
//		    Hw.setInterested();
//	}
//
//	
//
//
//	@When("user click schedule a demo button")
//	public void user_click_schedule_a_demo_button() throws IOException, InterruptedException {
//		    Hw.demoClick();
//	}
//
//	@Then("Thank You message should be displayed")
//	public void thank_you_message_should_be_displayed() throws InterruptedException {
//	   Hw.thankYou();
//	   Hw.refresh();
//	}
//
//	@When("user fills out the form with valid and invalid details")
//	public void user_fills_out_the_form_with_valid_and_invalid_details() throws IOException, InterruptedException {
//		    Hw = new healthWellness(HelperClass.getDriver());
//		    Hw.setName();
//		    Hw.setOrganization();
//		    Hw.setContact();
//		    Hw.setMaill();
//		    Hw.setSize();
//		    Hw.setInterested();
//
//	}
//
//	@Then("user should see the error messages for invalid data")
//	public void user_should_see_the_error_messages_for_invalid_data() throws InterruptedException {
//		  Hw.demoValidate();
//		  Hw.demoClick();
//	}
//
//}
