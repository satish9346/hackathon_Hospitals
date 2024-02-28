package findingHospitals.PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends BasePage{

	public homePage(WebDriver driver) {
		super(driver);
	}
	    //xpath for location searchbar
		@FindBy(xpath="//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input")
		public WebElement searchLocation;
		
		//xpath for doctor speciality searchba 
		@FindBy(xpath="//*[@class=\"c-omni-suggestion-item__content__title\"]")
		public List<WebElement>autoSuggestion;
		
		//xpath of doctor speciality searchBar
		@FindBy(xpath="//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input")
		public WebElement doctorSearchbar;
		@FindBy(xpath="(//div[@class='c-omni-suggestion-item'])[1]")
		public WebElement speciality;
		
		//xpath of selecting doctor speciality list
		@FindBy(xpath="//div[@class=\"c-omni-suggestion-item\"]//div[@class=\"c-omni-suggestion-item__content__title\"]")
		public List<WebElement> specialityList;
		

	//Exeplicit wait 
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	//Javascript executor
	JavascriptExecutor js= (JavascriptExecutor)driver;
	//different methods for home page
	
	   //method for clearing default data and sending location
		public void enterLocation(String loc) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(searchLocation));
			searchLocation.clear();
			searchLocation.sendKeys(loc);
			Thread.sleep(3000);
			// wait.until(ExpectedConditions.elementToBeSelected(bangalore_suggestion));
			System.out.print(autoSuggestion.size());
			for (WebElement locsuggestion : autoSuggestion) {
				String text = locsuggestion.getText().trim(); // Trim text to remove leading/trailing whitespace
				System.out.print(text);
				if (text.equalsIgnoreCase(loc)) {
					js.executeScript("arguments[0].click();", locsuggestion);
					break;
				}
			}
		}
	
	
	
	   //method for sending service
	    public void selectSpeciality(String speciality) throws InterruptedException {
	    	Thread.sleep(5000);
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(doctorSearchbar));
			doctorSearchbar.sendKeys(speciality);
			Thread.sleep(2000);
			for(WebElement a:specialityList) {
			
				if(a.getText().equalsIgnoreCase(speciality)) {
					a.click();
					break;
				}
		    }
	   }
	  //method to click doctor speciality searchBar
	  	public void clickDoctor() {
	  		doctorSearchbar.click();
	  			
	  		}
	  	public void dentistClick() throws InterruptedException {
	  		doctorSearchbar.sendKeys("dentist");

			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", speciality);

	        
	  	}
	  		
}

