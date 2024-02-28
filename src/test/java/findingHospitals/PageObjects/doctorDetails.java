package findingHospitals.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.excelUtils;

public class doctorDetails extends BasePage {

	public doctorDetails(WebDriver driver) {
		super(driver);
	}

	// xpath of gender dropdown
	@FindBy(xpath = "(//div[@class='c-filter__box u-pos-rel c-dropdown'])[1]")
	WebElement genders;
	// xpath for gender dropdown elements
	@FindBy(xpath = "//div[@data-qa-id='doctor_gender_section']//li")
	List<WebElement> genderList;

	// xpath of patient stories dropdown
	@FindBy(xpath = "(//div[@class='c-filter__box u-pos-rel c-dropdown'])[2]")
	public WebElement patientStories;
	// xpath for gender dropdown elements
	@FindBy(xpath = ("//div[@data-qa-id=\"doctor_review_count_section\"]//li"))
	public List<WebElement> storiesList;
	//// xpath for patientStorieselement
	@FindBy(xpath = "//ul[@data-qa-id=\"doctor_review_count_list\"]/li[1]")
	public WebElement patientStoriesElement;

	// xpath of experience dropdown
	@FindBy(xpath = "(//div[@class='c-filter__box u-pos-rel c-dropdown'])[3]")
	public WebElement experienceElement;
	// xpath for experience dropdown elements
	@FindBy(xpath = ("//div[@data-qa-id=\"years_of_experience_section\"]//li"))
	public List<WebElement> experienceList;

	// xpath of sortBy dropdown
	@FindBy(xpath = "//span[@class=\"c-sort-dropdown__selected c-dropdown__selected\"]")
	public WebElement sortBy;
	// xpath for sortBy dropdown elements
	@FindBy(xpath = ("//div[@data-qa-id=\"sort_by_section\"]//li"))
	public List<WebElement> sortByList;

	// xpath of dropDown elements
	@FindBy(xpath = "//*[@class=\"c-dropdown__list__item\"]")
	public List<WebElement> dropDownElements;
	// xpath of doctorDetails
	@FindBy(xpath = "//*[@class=\"c-dropdown__list__item\"]")
	public List<WebElement> doctorDetails;
	// xpath for allFilters
	@FindBy(xpath = "//span[@data-qa-id=\"all_filters\"]")
	public WebElement allFilters;
	// xpath for fee radio button
	@FindBy(xpath = "//span[@data-qa-id=\"₹0-₹500_label\"]")
	public WebElement fee;
	// xpath for availability radio button
	@FindBy(xpath = "//span[@data-qa-id=\"Available in next 7 days_label\"]")
	public WebElement availability;
	// xpath for allfilters list
	@FindBy(xpath = "//label[@class=\"u-c-pointer u-d-block c-filter__label\"]//span/span")
	List<WebElement> allfilterslist;
	// xpath for all filters
	@FindBy(xpath = "//span[@class='u-spacer--right-thin']")
	WebElement allfilters;
	@FindBy(xpath = "//div[@class='info-section']")
	List<WebElement> doctorprofile;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	// method to click gender dropDown
	public void genderClick(String gender) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(genders));
		js.executeScript("arguments[0].click();", genders);
		Thread.sleep(3000);
		for (WebElement a : genderList) {
			if (a.getText().equalsIgnoreCase(gender)) {
				js.executeScript("arguments[0].click();", a);
				Thread.sleep(3000);
				break;
			}
		}

	}

	// method to click patientStories dropDown
	public void storiesClick(String patientStory) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(patientStories));
		js.executeScript("arguments[0].click();", patientStories);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", patientStoriesElement);
		Thread.sleep(5000);
	}

	// method to click experience dropDown
	public void experienceClick(String experience) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(experienceElement));
		js.executeScript("arguments[0].click();", experienceElement);
		Thread.sleep(5000);
		for (WebElement a : experienceList) {
			if (a.getText().equalsIgnoreCase(experience)) {
				js.executeScript("arguments[0].click();", a);
				Thread.sleep(5000);
				break;

			}
		}
	}

	// method to click experience dropDown
	public void sortByClick(String filter) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(sortBy));
		js.executeScript("arguments[0].click();", sortBy);
		Thread.sleep(5000);
		for (WebElement a : sortByList) {
			if (a.getText().equalsIgnoreCase(filter)) {
				js.executeScript("arguments[0].click();", a);
				Thread.sleep(5000);
				break;
			}
		}
	}

	// reading data from excel input
	String File = System.getProperty("user.dir") + "/src//test//resources//Book1.xlsx ";

	// method to display doctor details
	public void displayDetails() throws InterruptedException, IOException {
		System.out.println("Total number of doctors : " + doctorprofile.size());
		int c = 5;
		excelUtils.setCellData(File, "Sheet1", 4, 2, "Doctor Details");

		for (int i = 0; i < doctorprofile.size(); i++) {

			String Doctordetails = doctorprofile.get(i).getText();
			System.out.println("Details are:" + Doctordetails);
			excelUtils.setCellData(File, "Sheet1", c, 2, Doctordetails);
			c += 1;

		}
	}

	// method to get title of the page
	public String title() {
		return driver.getTitle();

	}

	// method to navigate back
	public void navigateBack() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
	}

	// method to select fee radio button
	public void fee() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", allfilters);
		Thread.sleep(3000);
		for (WebElement exp : allfilterslist) {
			if (exp.getText().equalsIgnoreCase("Above ₹500")) {
				js.executeScript("arguments[0].click();", exp);
				Thread.sleep(5000);
				break;
			}
		}
	}

	// method to select availability radio button
	public void availability() throws InterruptedException {
		allfilters.click();
		for (WebElement exp : allfilterslist) {
			if (exp.getText().equalsIgnoreCase("Available Tomorrow")) {
				exp.click();
				break;
			}
		}
	}

	// method to select male doctor
	public void maleClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(genders));

		js.executeScript("arguments[0].click();", genders);
		Thread.sleep(3000);
		for (WebElement a : genderList) {
			if (a.getText().equalsIgnoreCase("Male Doctor")) {
				js.executeScript("arguments[0].click();", a);
				Thread.sleep(3000);
				break;
			}
		}

	}

}
