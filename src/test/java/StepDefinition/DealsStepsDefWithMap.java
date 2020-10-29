package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepsDefWithMap {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_in_login_page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@When("^title of login page is Free CRM$")
	public void title_of_the_login_page_is_freecrm() throws InterruptedException {
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		System.out.println(title);
	}

	@Then("^user enter username and password$")
	public void user_enter_usernameand_password(DataTable Credentials) {
		
		// List<Map<String, String>> loginmaps = Credentials.asMaps(String.class, String.class);
		for(Map<String, String> data : Credentials.asMaps(String.class, String.class))
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));
			 
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
		}
		
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']")).click();
	}

	@Then("^user is on home page$")
	public void user_in_home_page() {
		String homepagetitle = driver.getTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
	}

	@Then("^user clicked delas links$")
	public void user_clicked_contacts_links() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^user created delas data$")
	public void user_enters_contacts_details(DataTable dealData) {
		// Map<String, String> asMap = dealData.asMap(String.class, String.class);
		for (Map<String, String> data : dealData.asMaps(String.class, String.class))
		{
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
		 
		 
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		 driver.quit();
	}

}
