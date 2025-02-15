package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.slf4j.IMarkerFactory;
import static pages.Registration.*;

import static pages.Registration.title;

public class registrationPage {

    @Then("User should be able to view the Registartion page")
    public void User_should_be_able_to_view_the_Registartion_page() throws InterruptedException {
        title();

    }


}
