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

    @DataProvider(name = "testCalculator_WithDataProvider")
    public static Object[][] provideDataWithOperationsForBuilds() {
        Object[][] o = new Object[][]{
                {Operation.Add.value, "1", "1", "2"},
                {Operation.Add.value, "0", "0", "0"},
                {Operation.Add.value, "-1", "-1", "-2"},
                {Operation.Add.value, "-1", "1", "0"},
                {Operation.Add.value, "1", "-1", "0"},
                {Operation.Add.value, "1", "-12", "-11"},

                {Operation.Subtract.value, "-1", "-1", "0"},
                {Operation.Subtract.value, "1", "-1", "2"},
                {Operation.Subtract.value, "-1", "1", "-2"},
                {Operation.Subtract.value, "0", "0", "0"},
                {Operation.Subtract.value, "", "", "0"},
                {Operation.Subtract.value, "1", "1", "0"},

                {Operation.Multiply.value, "1", "1", "1"},
                {Operation.Multiply.value, "3", "3", "9"},
                {Operation.Multiply.value, "-2", "0", "0"},
                {Operation.Multiply.value, "0", "-1", "0"},
                {Operation.Multiply.value, "-1", "-1", "1"},
                {Operation.Multiply.value, "0", "0", "0"},

                {Operation.Divide.value, "1", "1", "1"},
                {Operation.Divide.value, "0", "1", "0"},
                {Operation.Divide.value, "8", "2", "4"},
                {Operation.Divide.value, "5", "2", "2.5"},
                {Operation.Divide.value, "-1", "1", "-1"},
                {Operation.Divide.value, "1", "-1", "-1"},
                {Operation.Divide.value, "-1", "-1", "1"},

                {Operation.Concatenate.value, "1", "1", "11"},
                {Operation.Concatenate.value, "-1", "1", "-11"},
                {Operation.Concatenate.value, "1", "-1", "1-1"},
                {Operation.Concatenate.value, "-1", "-1", "-1-1"},
                {Operation.Concatenate.value, "0", "1", "01"},
                {Operation.Concatenate.value, "1", "0", "10"},
                {Operation.Concatenate.value, "0", "0", "00"},

                //Double data for tests
                {Operation.Add.value, "1.2", "1.02", "2.22"},
                {Operation.Add.value, "-1.3", "-1.003", "-2.303"},
                {Operation.Add.value, "-1.9", "1.9", "0"},
                {Operation.Add.value, "0.1", "0.-1", "0"},
                {Operation.Add.value, "0.1", "-12", "-11.9"},

                {Operation.Subtract.value, "-1.2", "-1.2", "0"},
                {Operation.Subtract.value, "1.2", "-1.2", "2.4"},
                {Operation.Subtract.value, "-0.1", "1", "-1.1"},
                {Operation.Subtract.value, "0.000001", "0.000001", "0"},

                {Operation.Multiply.value, "0.1", "1", "0.1"},
                {Operation.Multiply.value, "2", "0.3", "0.6"},
                {Operation.Multiply.value, "-0.22222222", "0", "0"},
                {Operation.Multiply.value, "0", "-1.0000001", "0"},
                {Operation.Multiply.value, "-1.1", "-1.1", "1.21"},

                {Operation.Divide.value, "0.1", "0.1", "1"},
                {Operation.Divide.value, "0", "1.12345678", "0"},
                {Operation.Divide.value, "0.8", "2", "0.4"},
                {Operation.Divide.value, "5", "0.2", "25"},
                {Operation.Divide.value, "-1.12345678", "1", "-1.1234567"},
                {Operation.Divide.value, "1", "-0.1", "-10"},
                {Operation.Divide.value, "-1.12345678", "-1.12345678", "1"},

                {Operation.Concatenate.value, "1.22", "1.22", "1.221.22"},
                {Operation.Concatenate.value, "-1.2", "1.2", "-1.21.2"},
                {Operation.Concatenate.value, "1.01", "-1.01", "1.01-1.01"},
                {Operation.Concatenate.value, "-1.1", "-0.1", "-1.1-0.1"},
                {Operation.Concatenate.value, "0", "1.1", "01.1"},
                {Operation.Concatenate.value, "1.12345678", "0", "1.123456780"}

        };
        return o;
    }

    @Test(dataProvider = "jsonDataProvider")
//    @Test(dataProvider = "testCalculator_WithDataProvider")
    public void testCalculator_Build_Prototype(String operation,
                                               String operand1, String operand2,
                                               String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    //Negative test
    @Ignore
    @Test
    @Parameters({"firstInput", "secondInput"})
    public void testCalculator_Negative_Test(String firstInput, String secondInput) throws InterruptedException {

        steps.chooseOperation("Divide");

        steps.enterNumbers(firstInput, secondInput)
                .checkSolution("0");
    }
}
