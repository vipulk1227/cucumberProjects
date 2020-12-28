package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HeathStep {

WebDriver driver;

	@Given("user opened browser")
	public void user_opened_browser() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\eclipse\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	}

	@Given("user navigaed to home url")
	public void user_navigaed_to_home_url() {
	   driver.get("https://www.amazon.in/");
	   String title=driver.getTitle();
	   Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",title);
	}

	@When("user search for product {string}")
	public void user_search_for_product(String product) {
	   WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
	   searchBox.sendKeys(product);
	  
	   WebElement searchboxButton=driver.findElement(By.xpath("//input[@type='submit' and @ value='Go' ]"));
	   searchboxButton.click();
	}

	@Then("Search result page is displayed")
	public void search_result_page_is_displayed() throws InterruptedException {
	   WebDriverWait webdriverwait=new WebDriverWait(driver,20);
	   webdriverwait.until(ExpectedConditions.titleContains("Amazon.in : Laptop"));
		
		Assert.assertEquals("Amazon.in : Laptop",driver.getTitle());
		driver.close();
	}

}
