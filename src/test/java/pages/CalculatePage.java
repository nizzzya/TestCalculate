package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalculatePage extends BasePage {
    private Select select;

    @FindBy(xpath = "//select[@id=\"selectBuild\"]")
    WebElement drpBuild;

    @FindBy(id = "number1Field")
    WebElement firstNumber;

    @FindBy(name = "number2")
    WebElement secondNumber;

    WebElement drpOperation = driver.findElement(By.id("selectOperationDropdown")),
            cbIntNumber = driver.findElement(By.xpath("//*[@class=\"element checkbox\"]"));

    @FindBy(xpath = "//input[@type=\"button\"]")
    WebElement button;

    @FindBy(id = "numberAnswerField")
    WebElement answer;

    public void chooseBuild(String val) {
        select = new Select(drpBuild);
        select.selectByValue(val);
    }

    public void inputFirstNumber(String val) {
        firstNumber.sendKeys(val);
    }

    public void clearFirstNumInput() {
        firstNumber.clear();
    }

    public void inputSecondNumber(String val) {
        secondNumber.sendKeys(val);
    }

    public void clearSecondNumInput() {
        secondNumber.clear();
    }

    public void chooseOperation(String val) {
        select = new Select(drpOperation);
        select.selectByVisibleText(val);
    }

    public void calculate() {
        button.click();
    }

    public void checkOnlyIntegerVariable(Boolean check) {
        if (check) cbIntNumber.click();
    }

    public void checkOnCorrectResult(String expectedValue) {
        String actualResult = answer.getAttribute("value");
        assertEquals(actualResult, expectedValue);

    }
}
