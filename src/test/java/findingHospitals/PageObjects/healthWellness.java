package findingHospitals.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.utils.excelUtils;

public class healthWellness extends BasePage {
	static Properties p;

	public healthWellness(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// javascript executor intialization
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// xpath for corporate dropdown
	@FindBy(xpath = "//span[@class=\"u-d-item up-triangle\"]//span[2]")
	WebElement forCorporate;
	// xpath for corporate elements
	@FindBy(xpath = "//div[@class=\"u-d nav-dropdown text-left active-state\"]/div/a")
	List<WebElement> optionElements;
	// xpath for name input element
	@FindBy(id = "name")
	WebElement nameElement;
	// xpath for organization input element
	@FindBy(id = "organizationName")
	WebElement organizationElement;
	// xpath for contact input element
	@FindBy(id = "contactNumber")
	WebElement contactElement;
	// xpath for email input element
	@FindBy(id = "officialEmailId")
	WebElement emailIdElement;
	// xpath for organization size element
	@FindBy(id = "organizationSize")
	WebElement sizeElement;
	// xpath for interestedin element
	@FindBy(id = "interestedIn")
	WebElement interestedElement;
	// xpath for demo button
	@FindBy(xpath = "//*[@id=\"header\"]//button")
	WebElement demoButton;
	// xpath for verify button
	@FindBy(xpath = "//*[@id=\"recaptcha-verify-button\"]")
	WebElement captchaVerify;
	// xpath for schedule ademo button
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/header[2]/div[2]/div/form/button")
	WebElement demo;
	// xpath for thanku message
	@FindBy(xpath = "(//div[@class='u-m-t--10'])[2]")
	WebElement thankUMessage;
	@FindBy(xpath = ("(//h1[@class='ui header title'])[1]"))
	WebElement formTitle;

	// reading data from excel input
	String File = System.getProperty("user.dir") + "/src//test//resources//Book1.xlsx ";

	// method to click for corporate option
	public void clickCorporate() {
		forCorporate.click();
	}

	// method to select health and wellness option
	public void selectingHealth() {
		for (WebElement option : optionElements) {
			if (option.getText().equals("Health & Wellness Plans")) {
				option.click();
				break;
			}

		}
	}

	// method to set name
	public void setName() throws IOException, InterruptedException {
		Thread.sleep(5000);
		nameElement.sendKeys(excelUtils.getCellData(File, "Sheet1", 1, 0));
	}

	// method to set organization name
	public void setOrganization() throws IOException {
		organizationElement.sendKeys(excelUtils.getCellData(File, "Sheet1", 1, 1));
	}

	// method to set contact
	public void setContact() throws IOException {
		contactElement.sendKeys(excelUtils.getCellData(File, "Sheet1", 1, 2));
	}

	// method to set email
	public void setMail() throws IOException {
		emailIdElement.sendKeys(excelUtils.getCellData(File, "Sheet1", 1, 3));
	}

	// method to select size option
	public void setSize() {
		Select sc = new Select(sizeElement);
		sc.selectByIndex(1);
	}

	// method to select interested option
	public void setInterested() throws InterruptedException {
		Select sc1 = new Select(interestedElement);
		sc1.selectByVisibleText("Taking a demo");

	}

	// method to selecct demoClick
	public void demoClick() throws InterruptedException {
		if (demo.isEnabled()) {
			js.executeScript("arguments[0].click();", demo);
			Thread.sleep(2000);
		} else {
			System.out.println("Scghedule a demo button is not enabled");
		}

	}

	// method to get text from thank you element
	public void thankYou() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println(thankUMessage.getText());

	}

	public void navigateHome() {
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	// method to set invalid email
	public void setMaill() throws IOException {
		emailIdElement.sendKeys(excelUtils.getCellData(File, "Sheet1", 1, 4));
	}

	// method to refresh the page
	public void refresh() {
		driver.navigate().refresh();

	}

	// method to navigate back
	public void back() {
		driver.navigate().back();
	}

	public String formOpen() {
		System.out.println(formTitle.getText());
		return formTitle.getText();
	}

	public void demoValidate() {
		if (demo.isEnabled()) {
			System.out.println("Schedule ademo button is enabled");
		} else {
			System.out.println("Schedule ademo button is not enabled");
		}
	}

}
