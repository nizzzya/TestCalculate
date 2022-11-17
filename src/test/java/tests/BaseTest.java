package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import steps.CalculateSteps;

public class BaseTest {
    private static WebDriver driver = new ChromeDriver();
    public CalculateSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        steps = new CalculateSteps();
    }

    @AfterClass
    public void ternDown() throws InterruptedException {
        driver.quit();
    }
}
