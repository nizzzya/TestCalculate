package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatePage extends BasePage{

    @FindBy(xpath = "//select[@id=\"selectBuild\"]")
    WebElement dropdownBuild;

    public void chooseBuild() {
//        dropdownBuild.selectByValue("1");
    }
}
