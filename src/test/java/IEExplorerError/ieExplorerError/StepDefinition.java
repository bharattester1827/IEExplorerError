package IEExplorerError.ieExplorerError;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Basepage {
	Homepage homepage = new Homepage();
	
	@Given("^IE opened and website opened$")
	public void ie_opened_and_website_opened() {
	    System.out.println("browser opened and website load - hurray");
	}

	@When("^Enter valid username and password$")
	public void enter_valid_username_and_password()  {
	   //homepage.SigninBtn();
	   homepage.usernameenter();
	   homepage.ClickonNextbtn();
	   homepage.passwordenter();
	   homepage.Clickonpasswordnextbtn();
	}

	@Then("^login successfully$")
	public void login_successfully()  {
	    System.out.println(driver.getTitle());
	}


}
