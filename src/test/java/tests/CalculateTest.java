package tests;

import json.DataProviderClass;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class CalculateTest extends BaseTest {

    @BeforeClass
    @Parameters("build")
    public void chooseBuild(@Optional("1") String build) throws InterruptedException {
        steps.selectBuild(build);
    }

    @BeforeMethod
    private void initialize() {
        steps.clearInputs();
    }

    @DataProvider(name = "jsonDataProvider")
    public Object[][] getJsonDataProvider() throws IOException {
        String jsonPath = "src/test/java/json/dataForTests.json";

        return DataProviderClass.getTestsDataFromJson(jsonPath);

    }

//    @Ignore
    @Test(dataProvider = "jsonDataProvider")
    public void testCalculator_Build_Prototype(String operation,
                                               String operand1, String operand2,
                                               String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    //Negative test

    @DataProvider(name = "negativeDataProvider")
    public Object[][] getJsonNegativeDataProvider() throws IOException {
        String jsonPath = "src/test/resources/negativeDataForTest.json";

        return DataProviderClass.getTestsDataFromJson(jsonPath);

    }
    @Test(dataProvider = "negativeDataProvider", priority = 2)
    public void testCalculator_Negative_Test_Add_Option(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Add");

        steps.enterNumbers(operand1, operand2)
                .checkForNegativeInput(expectedResult);
    }
    @Test(dataProvider = "negativeDataProvider", priority = 2)
    public void testCalculator_Negative_Test_Subtract_Option(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Subtract");
        steps.enterNumbers(operand1, operand2)
                .checkForNegativeInput(expectedResult);
    }
    @Test(dataProvider = "negativeDataProvider", priority = 2)
    public void testCalculator_Negative_Test_Multiply_Option(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Multiply");

        steps.enterNumbers(operand1, operand2)
                .checkForNegativeInput(expectedResult);
    }
    @Test(dataProvider = "negativeDataProvider", priority = 3)
    public void testCalculator_Negative_Test_Divide_Option(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Divide");

        steps.enterNumbers(operand1, operand2)
                .checkForNegativeInput(expectedResult);
    }
    @Test(dataProvider = "negativeDataProvider", priority = 2)
    public void testCalculator_Negative_Test_Concatenate_Option(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Concatenate");

        steps.enterNumbers(operand1, operand2)
                .checkForNegativeInput(expectedResult);
    }
}
