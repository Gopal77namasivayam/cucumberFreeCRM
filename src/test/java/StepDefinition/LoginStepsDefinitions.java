//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepsDefinitions {
//
//	WebDriver driver;
//
//	@Given("^user is already on Login Page$")
//	public void user_is_in_login_page() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_the_login_page_is_freecrm() throws InterruptedException {
//		Thread.sleep(2000);
//		String title = driver.getTitle();
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//		System.out.println(title);
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enter_usernameand_password(String username, String Password) {
//		// driver.findElement(By.xpath("//input[@name='username']")).clear();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		// driver.findElement(By.xpath("//input[@name='password']")).clear();
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//
//		driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_in_home_page() {
//		String homepagetitle = driver.getTitle();
//		Assert.assertEquals("CRMPRO", homepagetitle);
//	}
//
//	@Then("^user clicked contacts links$")
//	public void user_clicked_contacts_links() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//
//	@Then("^user enetred \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//		
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
//		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastname);
//		driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		 driver.quit();
//	}
//
//}
