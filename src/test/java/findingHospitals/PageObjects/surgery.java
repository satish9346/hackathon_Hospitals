package findingHospitals.PageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.excelUtils;

public class surgery extends BasePage {

	public surgery(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	// reading data from excel input
	String File = System.getProperty("user.dir") + "/src//test//resources//Book1.xlsx ";
	// xpath for surgery element
	@FindBy(xpath = "//div[contains(text(),'Surgeries')]")
	public WebElement surgeries;
	// xpath for practo logo
	@FindBy(xpath = ("//span[@class=\"practo-logo\"]"))
	public WebElement practoLogo;
	// xpath for popular surgeries element
	@FindBy(xpath = ("//div[@class=\"rounded-12px border-white-2 border\"]/h1"))
	public WebElement popularSurgeries;
	// xpath for all surgeries
	@FindBy(xpath = ("//div[@class=\"flex flex-col items-center text-center\"]"))
	public List<WebElement> allSurgeries;

	// method to click practoLogo
	public void clickIcon() {
		practoLogo.click();

	}

	// method to click surgeries
	public void clickSurgeries() {
		surgeries.click();
	}

	// method to scroll till popularsurgeries
	public void scrollToSurgeries() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", popularSurgeries);
	}

	// method to get text from piopularSurgeries
	public String surgeriesText() {
		return popularSurgeries.getText();
	}

	// method to store all surgeries into list
	public void listingSurgeries() throws IOException {
		int row = 4;
		List<String> surgeriesList = new ArrayList<String>();
		for (WebElement c : allSurgeries) {

			String str = c.getText();
			surgeriesList.add(str);
			excelUtils.setCellData(File, "Sheet1", row, 0, str);
			row++;

		}
		System.out.println(surgeriesList);
		int n = surgeriesList.size();
	}

	// method to navigate back
	public void navigateHome() {
		driver.navigate().back();
	}

}
