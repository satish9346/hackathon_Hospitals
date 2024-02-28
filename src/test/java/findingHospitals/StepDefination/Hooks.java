package findingHospitals.StepDefination;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Hooks {

	 public static WebDriver driver;
	 static Properties p;
     
	@BeforeAll
    public static void setup() throws IOException
    {    	

    	driver=HelperClass.initialBrowser();			//to launch browser
		p=HelperClass.getProperties();					//to get properties from config.properties file

    	driver.manage().window().maximize();			//to maximize the window

    	driver.get(p.getProperty("URL"));
    	//returns the url from config.properties file
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;   
	}
		
    
    @AfterAll
    public static void tearDown() {
        		
       driver.quit();									//to close all browser windows
       
    }
    @AfterStep
    public void addScreenshot(Scenario scenario) {		//method to take screenshots for every step after succefully get passed
        
    	// this is for cucumber junit report
    	
        if(!scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
      
    }
}