package tests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import json.DataProviderClass;
import json.DataTests;
import json.DataTestsItem;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

public class CalculateTest extends BaseTest {

    @BeforeClass
    @Parameters("build")
    public void chooseBuild(String build) throws InterruptedException {
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
    @Test(dataProvider = "negativeDataProvider")
    public void testCalculator_Negative_Test(String operation,
                                             String operand1, String operand2,
                                             String expectedResult) throws InterruptedException {

        steps.chooseOperation("Divide");

        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }
}
