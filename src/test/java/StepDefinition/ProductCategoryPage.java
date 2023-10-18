package StepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pages.ProductCategoryPage.*;

public class ProductCategoryPage {
    @Then("^User navigates to the Login page$")
    public void product_category_validation(){
        String actualProductCategory = visibility_productCategory();
        assertEquals(actualProductCategory, "Formal Shoes");
    }
}
