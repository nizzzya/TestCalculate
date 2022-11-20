package tests;

import org.testng.annotations.*;

public class CalculateTest extends BaseTest {

    @BeforeMethod
    private void initialize() {
        steps.clearInputs();
    }

    @DataProvider(name = "testCalculator_WithDataProvider")
    public static Object[][] provideDataWithOperationsForBuilds() {
        return new Object[][]{
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
    }

    @BeforeGroups("Build_1")
    private void chooseBuild_1() {
        steps.selectBuild(Build.Build_1.value);
    }

    @BeforeGroups("Build_2")
    private void chooseBuild_2() {
        steps.selectBuild(Build.Build_2.value);
    }
    @BeforeGroups("Build_3")
    private void chooseBuild_3() {
        steps.selectBuild(Build.Build_3.value);
    }

    @BeforeGroups("Build_4")
    private void chooseBuild_4() {
        steps.selectBuild(Build.Build_4.value);
    }
    @BeforeGroups("Build_5")
    private void chooseBuild_5() {
        steps.selectBuild(Build.Build_5.value);
    }

    @BeforeGroups("Build_6")
    private void chooseBuild_6() {
        steps.selectBuild(Build.Build_6.value);
    }
    @BeforeGroups("Build_7")
    private void chooseBuild_7() {
        steps.selectBuild(Build.Build_7.value);
    }

    @BeforeGroups("Build_8")
    private void chooseBuild_8() {
        steps.selectBuild(Build.Build_8.value);
    }
    @BeforeGroups("Build_9")
    private void chooseBuild_9() {
        steps.selectBuild(Build.Build_9.value);
    }

    @BeforeGroups("Build_Prototype")
    private void chooseBuild_Prototype() {
        steps.selectBuild(Build.Prototype.value);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_1")
    public void testCalculator_Build_1(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_2")
    public void testCalculator_Build_2(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_3")
    public void testCalculator_Build_3(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_4")
    public void testCalculator_Build_4(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_5")
    public void testCalculator_Build_5(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_6")
    public void testCalculator_Build_6(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_7")
    public void testCalculator_Build_7(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_8")
    public void testCalculator_Build_8(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_9")
    public void testCalculator_Build_9(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    @Test(dataProvider = "testCalculator_WithDataProvider", groups = "Build_Prototype")
    public void testCalculator_Build_Prototype(String operation,
                                       String operand1, String operand2,
                                       String expectedResult) throws InterruptedException {
        steps.chooseOperation(operation);
        steps.enterNumbers(operand1, operand2)
                .checkSolution(expectedResult);
    }

    //Error test
    @Ignore
    @Test
    public void testCalculator_Error_Test() throws InterruptedException {
        steps.chooseOperation("Divide");
        steps.enterNumbers("1", "0")
                .checkSolution("0");
    }
}
