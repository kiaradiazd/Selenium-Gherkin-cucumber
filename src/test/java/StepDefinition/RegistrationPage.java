package StepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pages.ProductCategoryPage.visibility_productCategory;

public class RegistrationPage {
    @Then("^User should be able to view the Registration page$")
    public void product_category_validation(){
        String actualProductCategory = visibility_productCategory();
        assertEquals(actualProductCategory, "User Registration Page");
    }
}
