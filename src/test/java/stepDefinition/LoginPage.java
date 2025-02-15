package stepDefinition;

import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void User_successfully_enters_the_log_in_details() throws InterruptedException {
        enterUsername();
        enterPassword();
        submitButton();
    }

    @When("User clicks on the New Registration button")
    public void User_clicks_on_the_New_Registration_button() throws InterruptedException{
        registerButton();
    }


}
