package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.LoggedIn.*;

public class LoggedIn {
    @Then("User should be able to view the product category page")
    public void User_should_be_able_to_view_the_product_category_page() throws InterruptedException{
        prodcat_shoe();
        prodcat_sneakers();
        prodcat_sports();

    }

}
