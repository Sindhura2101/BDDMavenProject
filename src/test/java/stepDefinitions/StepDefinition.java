package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.nopCommerce.pageObject.AddNewCustomerPage;
import com.nopCommerce.pageObject.AdminPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base {

	@Given("user launch chrome")
	public void user_launch_chrome() {
		// System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium java
		// Software\\chromedriver_win32\\chromedriver.exe");
		// driver=new ChromeDriver();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("---remote-allow-origins=*", "ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		ad = new AdminPage(driver);
		addCust = new AddNewCustomerPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		ad.setUserName(email);
		ad.setPassword(password);
	}

	@When("User click login button")
	public void user_click_login_button() throws Exception {
		ad.clickLogin();
		Thread.sleep(2000);
	}

	@Then("page title {string}")
	public void page_title(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

	@When("User click on Customers menu")
	public void user_click_on_customers_menu() {
		addCust.clickOnCustomersMenu();
	}

	@When("User click on customers menu item")
	public void user_click_on_customers_menu_item() {
		addCust.clickOnCustomersMenuItem();
	}

	@When("User click on add new button")
	public void user_click_on_add_new_button() {
		addCust.clickOnAddNewButton();
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		 Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user enter customer info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_customer_info_as_and_and_and_and_and_and(String email, String password, String fname,
			String lname, String gender, String comName, String adminComment) {
		addCust.setEmail(email);
		addCust.setPassword(password);
		addCust.setFirstName(fname);
		addCust.setLastName(lname);
		addCust.SetGender(gender);
		addCust.setCompanyName(comName);
		addCust.setAdminComment(adminComment);
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
		addCust.clickOnSave();
	}

	@Then("User can view confirmation msg {string}")
	public void user_can_view_confirmation_msg(String string) throws Exception {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
		Thread.sleep(2000);
	}

}
