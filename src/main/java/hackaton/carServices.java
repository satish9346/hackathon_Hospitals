//package hackaton;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.idealized.Javascript;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class carServices {
//	public static WebDriver driver;
//	 
//	public static void main(String[] args) throws InterruptedException {
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.practo.com/");
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		WebElement search=driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
//
//		search.clear();
//
//		search.sendKeys("Chennai");
//
//		Thread.sleep(3000);
//
//		List<WebElement>l=driver.findElements(By.xpath("//*[@class=\"c-omni-suggestion-item__content__title\"]"));
//
//		for(WebElement a1:l) {
//
//			if (a1.getText().equalsIgnoreCase("Chennai")) {
//
//				JavascriptExecutor js =(JavascriptExecutor)driver;
//
//				js.executeScript("arguments[0].click();", a1);
//
//				break;
//
//			}
//
//		}
//
//		driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input")).sendKeys("dentist");
//
//		Thread.sleep(2000);
//
//     	driver.findElement(By.xpath("(//div[@class=\"c-omni-suggestion-item\"])[1]")).click();
//
//		/*driver.findElement(By.xpath("(//div[@class='c-filter__box u-pos-rel c-dropdown'])[1]")).click();
//
//		List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"c-dropdown__list__item\"]"));
//
//		for(WebElement a:li) {
//
//				if (a.getText().equals("Male Doctor")) {
//
//					a.click();
//
//					break;
//
//				}
//
//		}*/
//
//		WebElement ele1=driver.findElement(By.xpath("(//div[@class='c-filter__box u-pos-rel c-dropdown'])[1]"));
//
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//
//		js.executeScript("arguments[0].click();", ele1);
//
//		List<WebElement> genderList=driver.findElements(By.xpath("//div[@data-qa-id='doctor_gender_section']//li"));
//
//		for(WebElement a:genderList) {
//
//				if (a.getText().equals("Male Doctor")) {
//
//					a.click();
//
//					Thread.sleep(3000);
//
//					break;
//
//				}
//
//		}
//
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
//
//		WebElement ele2=driver.findElement(By.xpath("(//div[@class='c-filter__box u-pos-rel c-dropdown'])[2]"));
//
//		js.executeScript("arguments[0].click();", ele2);
//
//		List<WebElement> storiesList=driver.findElements(By.xpath("//div[@data-qa-id=\"doctor_review_count_section\"]//li"));
//
//		for(WebElement a:storiesList) {
//
//				if (a.getText().equalsIgnoreCase("30+ Patient Stories")) {
//
//					a.click();
//
//					Thread.sleep(3000);
//
//					break;
//
//				}
//
//		}
//
//		
//
//
//
//		WebElement ele3=driver.findElement(By.xpath("(//div[@class='c-filter__box u-pos-rel c-dropdown'])[3]"));
//
//		js.executeScript("arguments[0].click();", ele3);
//
//		List<WebElement> experienceList=driver.findElements(By.xpath("//div[@data-qa-id=\"years_of_experience_section\"]//li"));
//
//		for(WebElement a:experienceList) {
//
//				if (a.getText().equalsIgnoreCase("10+ Years of experience")) {
//
//					a.click();
//
//					Thread.sleep(3000);
//
//					break;
//
//				}
//
//		}
//		WebElement ele5=driver.findElement(By.xpath("//span[@data-qa-id=\"all_filters\"]"));
//
//		js.executeScript("arguments[0].click();", ele5);
//		Thread.sleep(5000);
//
//		WebElement ele6=driver.findElement(By.xpath("//span[@data-qa-id=\"₹0-₹500_label\"]"));
//
//		js.executeScript("arguments[0].click();", ele6);
//		
//		WebElement ele7=driver.findElement(By.xpath("//span[@data-qa-id=\"Available in next 7 days_label\"]"));
//		
//		js.executeScript("arguments[0].click();", ele7);
//		Thread.sleep(2000);
//
//
//		WebElement ele4=driver.findElement(By.xpath("//div[@data-qa-id=\"sort_by_section\"]"));
//		js.executeScript("arguments[0].click();", ele4);
//		
//
//		List<WebElement> sortByList=driver.findElements(By.xpath("//div[@data-qa-id=\"sort_by_section\"]//li"));
//
//		for(WebElement a:sortByList) {
//
//				if (a.getText().equalsIgnoreCase("Experience - High to Low")) {
//					
//					js.executeScript("arguments[0].click();", a);
//					Thread.sleep(3000);
//
//
//					
//
//					break;
//
//				}
//
//		}
//
//        List<WebElement> doctorDetails =driver.findElements(By.xpath("//div[@class='info-section']"));
//
//		for(int i=0;i<5;i++) {
//
//			Thread.sleep(2000);
//
//			System.out.println(doctorDetails.get(i).getText());
//
//			System.out.println("=====================");
//
//		}
//
//		driver.findElement(By.xpath("//span[@class=\"practo-logo\"]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[5]/a/div[1]")).click();
//
//		WebElement popularSurgeries=driver.findElement(By.xpath("//div[@class=\"rounded-12px border-white-2 border\"]/h1"));
//
//		js.executeScript("arguments[0].scrollIntoView();", popularSurgeries);
//
//		List<String> surgeriesList =new ArrayList<String>();
//
//		List<WebElement>sur=driver.findElements(By.xpath("//div[@class=\"flex flex-col items-center text-center\"]"));
//
//		for(WebElement c:sur) {
//
//			surgeriesList.add(c.getText());
//
//		}
//
//		System.out.println(surgeriesList);
//		driver.navigate().back();
//		driver.findElement(By.xpath("//span[@class=\"u-d-item up-triangle\"]//span[2]")).click();
//		/*List<WebElement>corporate=driver.findElements(By.xpath("//div[@class=\"u-d nav-dropdown text-left active-state\"]/div/a"));
//		for(WebElement option:corporate) {
//			if(option.getText().equals("Health & Wellness Plans")) {
//				option.click();
//			}
//			
//		}*/
//		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span/div/div[1]/a")).click();
//		Thread.sleep(50000);
//		WebElement name=driver.findElement(By.id("name"));
//		name.sendKeys("Satish");
//		WebElement organization=driver.findElement(By.id("organizationName"));
//		organization.sendKeys("klp organization");
//		WebElement contact=driver.findElement(By.id("contactNumber"));
//		contact.sendKeys("9346061029");
//		WebElement email=driver.findElement(By.id("officialEmailId"));
//		email.sendKeys("gsatishreddy2001@gmail.com");
//		WebElement dropdown=driver.findElement(By.id("organizationSize"));
//		Select sc=new Select(dropdown);
//		sc.selectByVisibleText("<500");
//		WebElement interested=driver.findElement(By.id("interestedIn"));
//		Select sc1=new Select(interested);
//		sc1.selectByVisibleText("Taking a demo");
//		
//	
//			WebElement demo=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header[2]/div[2]/div/form/button"));
//			js.executeScript("arguments[0].click();", demo);
//			Thread.sleep(2000);
//
//			System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]")).getText());
//					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt=\"thank you\"])[2]")));
//		
//		
//		//span[@data-qa-id="all_filters"]
//		
//		//span[@data-qa-id="all_filters"]
//
//		//span[@data-qa-id="Available in next 4 hours_label"]
//
//}
//}   
//
