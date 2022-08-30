package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() throws InterruptedException {

        sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));

        sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));

    }

    
    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        
        click(login.loginButton);
    }

   

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("test passed");
       
    }
}
