package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        PageFactory.initElements(driver, this);
    }

    @AfterClass
    public void ternDown() {
        driver.quit();
    }
}
