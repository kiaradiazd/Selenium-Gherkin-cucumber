package StepDefinition;

import io.cucumber.java.en.When;
import static pages.SignPage.*;

public class SignInPage {

    @When("^User seccuessfully enters the log indetails$")
    public void user_logIn_to_login_page(){
        sendKeys_username();
        sendKeys_password();
        click_login_btn();
    }
}
