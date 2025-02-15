package stepDefinition;

import static pages.HomePage.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

public class HomePage {

    @Given("User navigates to the login page")
    public void User_navigates_to_the_login_page() throws InterruptedException {
        clickMenu();
        clickSignin();
    }


    @Given("User navigates to the Online Products page")
    public void userNavigatesToTheOnlineProductsPage() throws InterruptedException {
        clickMenu();
        clickOnlineProducts();

    }
}



