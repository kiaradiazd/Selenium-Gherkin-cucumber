package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {

    public static String registration_heading_xpath = "//*[@id=\"ShoeType\"]/font/font";

    public static String visibility_productCategory(){
        String getRegistration = driver.findElement(By.xpath(registration_heading_xpath)).getText();
        return getRegistration;
    }
}
