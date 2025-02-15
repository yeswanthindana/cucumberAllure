package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.OnlineProductsPage.*;
public class onlineProductsPage {

    @When("User clicks on the Formal shoes dropdown")
    public void userClicksOnTheFormalShoesDropdown() throws InterruptedException {
        clickonformalshoes();
    }

    @Then("User should be able to view the products")
    public void userShouldBeAbleToViewTheProducts() throws InterruptedException{
        getprodexp();
    }
}
