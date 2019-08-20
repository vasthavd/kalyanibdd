package StepDefinitionCustomer;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BeanFactory.Customerbean;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	private WebDriver driver;
	private Customerbean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\vdandume\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Given("^user is on 'update customer' page$")
	public void user_is_on_update_customer_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Users\\NewVasthavWorkspace\\CustomerInformation\\Customer.html");
		bean = new Customerbean(driver);
		
	}

	@When("^get page title$")
	public void get_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    System.out.println("Getting Page Title");

	}

	@Then("^displays 'Page title verified'$")
	public void displays_Page_title_verified() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Update Customer Information";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Page title verified");
	
	}
	@When("^user enters invalid email Id$")
	public void user_enters_invalid_email_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^displays 'Email Id Should Be Filled'$")
	public void displays_Email_Id_Should_Be_Filled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setFirstName("");
	}

	@Then("^displays 'First Name Should Be Filled'$")
	public void displays_First_Name_Should_Be_Filled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^displays 'Last Name '$")
	public void displays_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	
	@Then("^displays 'Mobile Number Should Be Filled'$")
	public void displays_Mobile_Number_Should_Be_Filled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^user is on 'update Customer' page$")
	public void user_is_on_update_Customer_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters address$")
	public void user_enters_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^displays 'Address Should Be Filled'$")
	public void displays_Address_Should_Be_Filled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user selects invalid photo file$")
	public void user_selects_invalid_photo_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^displays 'Select a valid photo file'$")
	public void displays_Select_a_valid_photo_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters valid information$")
	public void user_enters_valid_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^update button gets enabled and user can update his information$")
	public void update_button_gets_enabled_and_user_can_update_his_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
