package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class loginStepDefination {
	WebDriver driver;
	loginPage lp = new loginPage();
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
	   System.out.println("Step 1: User is on Login Page");
	   lp.openbrowser();
	   lp.openLoginPage();
	}

	@When("title of login page is {string}")
	public void title_of_login_page_is(String title) {
	    System.out.println("Step 2: Title of the page is Sign in | Scotiabank");
	    String expectedTitle = title;
	    String title1= lp.getTitle();
	    Assert.assertEquals(expectedTitle, title1);
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String email, String password) {
	    System.out.println("Step 3: User enter email id and Password");
	    lp.enterEmailAndPassword(email, password);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	   System.out.println("Step 4: User click on login Button");
	   lp.clickOnLoginButton();
	}

	@Then("user get error message")
	public void user_get_error_message() {
	   System.out.println("Step 5: User get the error");
	   String expected = "Please enter a username or card number without special characters.";
	   String actual = lp.readError();
	   Assert.assertEquals(expected, actual);
	}

	@Then("user quit")
	public void user_quit() {
	   System.out.println("Step 6: User Quit");
	   lp.closeBrowser();
	}
	

}
