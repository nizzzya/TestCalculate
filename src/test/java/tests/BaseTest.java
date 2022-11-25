package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import steps.CalculateSteps;

public class BaseTest {
    private static WebDriver driver;
    public CalculateSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) throws NullPointerException, InterruptedException {
        if("firefox".equalsIgnoreCase(browser)){
            driver = new FirefoxDriver();
        } else if ("chrome".equalsIgnoreCase(browser)) {
            driver = new ChromeDriver();
        }
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        steps = new CalculateSteps();
    }

    @AfterClass
    public void ternDown() throws InterruptedException {
        driver.quit();
    }
}
