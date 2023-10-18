package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductCategoryPage extends BrowserDriver {

    public static String productCategory_heading_xpath = "//*[@id=\"ShoeType\"]/font/font";

    public static String visibility_productCategory(){
        String actualProductCategory = driver.findElement(By.xpath(productCategory_heading_xpath)).getText();
        return actualProductCategory;
    }
}
