package pages;


import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = BaseTest.getDriver();
    }
}
