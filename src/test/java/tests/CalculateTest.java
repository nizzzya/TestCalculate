package tests;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculateTest extends BaseTest {

    @BeforeMethod
    private void clearInputs() {
        steps.clearInputs();
    }

    //Select Calculator's build

    @BeforeGroups("Build_Prototype")
    private void selectBuildPrototype() {
        steps.selectBuild("0");
    }

    @BeforeGroups("Build_1")
    private void selectBuild1() {
        steps.selectBuild("1");
    }

    @BeforeGroups("Build_2")
    private void selectBuild2() {
        steps.selectBuild("2");
    }

    @BeforeGroups("Build_3")
    private void selectBuild3() {
        steps.selectBuild("3");
    }

    @BeforeGroups("Build_4")
    private void selectBuild4() {
        steps.selectBuild("4");
    }

    @BeforeGroups("Build_5")
    private void selectBuild5() {
        steps.selectBuild("5");
    }

    @BeforeGroups("Build_6")
    private void selectBuild6() {
        steps.selectBuild("6");
    }

    @BeforeGroups("Build_7")
    private void selectBuild7() {
        steps.selectBuild("7");
    }

    @BeforeGroups("Build_8")
    private void selectBuild8() {
        steps.selectBuild("8");
    }

    @BeforeGroups("Build_9")
    private void selectBuild9() {
        steps.selectBuild("9");
    }

    //Select operation for group
    @BeforeGroups("Add")
    private void selectOperationAdd() {
        steps.chooseOperation("Add");
    }

    @BeforeGroups("Subtract")
    private void selectOperationSubtract() {
        steps.chooseOperation("Subtract");
    }

    @BeforeGroups("Multiply")
    private void selectOperationMultiply() {
        steps.chooseOperation("Multiply");
    }

    @BeforeGroups("Divide")
    private void selectOperationDivide() {
        steps.chooseOperation("Divide");
    }

    @BeforeGroups("Subtract")
    private void selectOperationConcatenate() {
        steps.chooseOperation("Concatenate");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_Prototype"})
    public void addPositiveNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_Prototype"})
    public void addNegativeNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_Prototype"})
    public void addDifferentNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_Prototype"})
    public void addWithZeroNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_Prototype"})
    public void subtractPositiveNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_Prototype"})
    public void subtractNegativeNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_Prototype"})
    public void subtractDifferentNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_Prototype"})
    public void subtractWithZeroNumBuildPrototype() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_Prototype"})
    public void multiplyPositiveNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_Prototype"})
    public void multiplyNegativeNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_Prototype"})
    public void multiplyDifferentNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_Prototype"})
    public void multiplyWithZeroNumBuildPrototype() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_Prototype"})
    public void dividePositiveNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_Prototype"})
    public void divideNegativeNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_Prototype"})
    public void divideDifferentNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_Prototype"})
    public void divideWithZeroNumBuildPrototype() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_Prototype"})
    public void concatenatePositiveNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_Prototype"})
    public void concatenateNegativeNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_Prototype"})
    public void concatenateDifferentNumBuildPrototype() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_Prototype"})
    public void concatenateWithZeroNumBuildPrototype() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }

    //Group build 1
    //Group Add
    @Test(groups = {"Add", "Build_1"})
    public void addPositiveNumBuild1() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_1"})
    public void addNegativeNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_1"})
    public void addDifferentNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_1"})
    public void addWithZeroNumBuild1() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_1"})
    public void subtractPositiveNumBuild1() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_1"})
    public void subtractNegativeNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_1"})
    public void subtractDifferentNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_1"})
    public void subtractWithZeroNumBuild1() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_1"})
    public void multiplyPositiveNumBuild1() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_1"})
    public void multiplyNegativeNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_1"})
    public void multiplyDifferentNumBuild1() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_1"})
    public void multiplyWithZeroNumBuild1() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_1"})
    public void dividePositiveNumBuild1() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_1"})
    public void divideNegativeNumBuild1() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_1"})
    public void divideDifferentNumBuild1() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_1"})
    public void divideWithZeroNumBuild1() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_1"})
    public void concatenatePositiveNumBuild1() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_1"})
    public void concatenateNegativeNumBuild1() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_1"})
    public void concatenateDifferentNumBuild1() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_1"})
    public void concatenateWithZeroNumBuild1() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }

    //end Group build 1



    //Group build 2
    //Group Add
    @Test(groups = {"Add", "Build_2"})
    public void addPositiveNumBuild2() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_2"})
    public void addNegativeNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_2"})
    public void addDifferentNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_2"})
    public void addWithZeroNumBuild2() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_2"})
    public void subtractPositiveNumBuild2() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_2"})
    public void subtractNegativeNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_2"})
    public void subtractDifferentNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_2"})
    public void subtractWithZeroNumBuild2() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_2"})
    public void multiplyPositiveNumBuild2() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_2"})
    public void multiplyNegativeNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_2"})
    public void multiplyDifferentNumBuild2() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_2"})
    public void multiplyWithZeroNumBuild2() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_2"})
    public void dividePositiveNumBuild2() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_2"})
    public void divideNegativeNumBuild2() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_2"})
    public void divideDifferentNumBuild2() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_2"})
    public void divideWithZeroNumBuild2() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_2"})
    public void concatenatePositiveNumBuild2() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_2"})
    public void concatenateNegativeNumBuild2() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_2"})
    public void concatenateDifferentNumBuild2() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_2"})
    public void concatenateWithZeroNumBuild2() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }


    //Group build 3
    //Group Add
    @Test(groups = {"Add", "Build_3"})
    public void addPositiveNumBuild3() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_3"})
    public void addNegativeNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_3"})
    public void addDifferentNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_3"})
    public void addWithZeroNumBuild3() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_3"})
    public void subtractPositiveNumBuild3() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_3"})
    public void subtractNegativeNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_3"})
    public void subtractDifferentNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_3"})
    public void subtractWithZeroNumBuild3() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_3"})
    public void multiplyPositiveNumBuild3() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_3"})
    public void multiplyNegativeNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_3"})
    public void multiplyDifferentNumBuild3() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_3"})
    public void multiplyWithZeroNumBuild3() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_3"})
    public void dividePositiveNumBuild3() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_3"})
    public void divideNegativeNumBuild3() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_3"})
    public void divideDifferentNumBuild3() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_3"})
    public void divideWithZeroNumBuild3() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_3"})
    public void concatenatePositiveNumBuild3() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_3"})
    public void concatenateNegativeNumBuild3() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_3"})
    public void concatenateDifferentNumBuild3() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_3"})
    public void concatenateWithZeroNumBuild3() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }




    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_4"})
    public void addPositiveNumBuild4() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_4"})
    public void addNegativeNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_4"})
    public void addDifferentNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_4"})
    public void addWithZeroNumBuild4() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_4"})
    public void subtractPositiveNumBuild4() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_4"})
    public void subtractNegativeNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_4"})
    public void subtractDifferentNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_4"})
    public void subtractWithZeroNumBuild4() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_4"})
    public void multiplyPositiveNumBuild4() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_4"})
    public void multiplyNegativeNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_4"})
    public void multiplyDifferentNumBuild4() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_4"})
    public void multiplyWithZeroNumBuild4() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_4"})
    public void dividePositiveNumBuild4() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_4"})
    public void divideNegativeNumBuild4() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_4"})
    public void divideDifferentNumBuild4() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_4"})
    public void divideWithZeroNumBuild4() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_4"})
    public void concatenatePositiveNumBuild4() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_4"})
    public void concatenateNegativeNumBuild4() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_4"})
    public void concatenateDifferentNumBuild4() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_4"})
    public void concatenateWithZeroNumBuild4() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_5"})
    public void addPositiveNumBuild5() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_5"})
    public void addNegativeNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_5"})
    public void addDifferentNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_5"})
    public void addWithZeroNumBuild5() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_5"})
    public void subtractPositiveNumBuild5() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_5"})
    public void subtractNegativeNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_5"})
    public void subtractDifferentNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_5"})
    public void subtractWithZeroNumBuild5() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_5"})
    public void multiplyPositiveNumBuild5() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_5"})
    public void multiplyNegativeNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_5"})
    public void multiplyDifferentNumBuild5() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_5"})
    public void multiplyWithZeroNumBuild5() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_5"})
    public void dividePositiveNumBuild5() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_5"})
    public void divideNegativeNumBuild5() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_5"})
    public void divideDifferentNumBuild5() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_5"})
    public void divideWithZeroNumBuild5() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_5"})
    public void concatenatePositiveNumBuild5() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_5"})
    public void concatenateNegativeNumBuild5() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_5"})
    public void concatenateDifferentNumBuild5() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_5"})
    public void concatenateWithZeroNumBuild5() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_6"})
    public void addPositiveNumBuild6() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_6"})
    public void addNegativeNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_6"})
    public void addDifferentNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_6"})
    public void addWithZeroNumBuild6() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_6"})
    public void subtractPositiveNumBuild6() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_6"})
    public void subtractNegativeNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_6"})
    public void subtractDifferentNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_6"})
    public void subtractWithZeroNumBuild6() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_6"})
    public void multiplyPositiveNumBuild6() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_6"})
    public void multiplyNegativeNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_6"})
    public void multiplyDifferentNumBuild6() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_6"})
    public void multiplyWithZeroNumBuild6() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_6"})
    public void dividePositiveNumBuild6() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_6"})
    public void divideNegativeNumBuild6() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_6"})
    public void divideDifferentNumBuild6() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_6"})
    public void divideWithZeroNumBuild6() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_6"})
    public void concatenatePositiveNumBuild6() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_6"})
    public void concatenateNegativeNumBuild6() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_6"})
    public void concatenateDifferentNumBuild6() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_6"})
    public void concatenateWithZeroNumBuild6() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_7"})
    public void addPositiveNumBuild7() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_7"})
    public void addNegativeNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_7"})
    public void addDifferentNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_7"})
    public void addWithZeroNumBuild7() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_7"})
    public void subtractPositiveNumBuild7() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_7"})
    public void subtractNegativeNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_7"})
    public void subtractDifferentNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_7"})
    public void subtractWithZeroNumBuild7() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_7"})
    public void multiplyPositiveNumBuild7() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_7"})
    public void multiplyNegativeNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_7"})
    public void multiplyDifferentNumBuild7() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_7"})
    public void multiplyWithZeroNumBuild7() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_7"})
    public void dividePositiveNumBuild7() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_7"})
    public void divideNegativeNumBuild7() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_7"})
    public void divideDifferentNumBuild7() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_7"})
    public void divideWithZeroNumBuild7() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_7"})
    public void concatenatePositiveNumBuild7() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_7"})
    public void concatenateNegativeNumBuild7() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_7"})
    public void concatenateDifferentNumBuild7() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_7"})
    public void concatenateWithZeroNumBuild7() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_8"})
    public void addPositiveNumBuild8() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_8"})
    public void addNegativeNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_8"})
    public void addDifferentNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_8"})
    public void addWithZeroNumBuild8() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_8"})
    public void subtractPositiveNumBuild8() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_8"})
    public void subtractNegativeNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_8"})
    public void subtractDifferentNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_8"})
    public void subtractWithZeroNumBuild8() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_8"})
    public void multiplyPositiveNumBuild8() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_8"})
    public void multiplyNegativeNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_8"})
    public void multiplyDifferentNumBuild8() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_8"})
    public void multiplyWithZeroNumBuild8() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_8"})
    public void dividePositiveNumBuild8() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_8"})
    public void divideNegativeNumBuild8() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_8"})
    public void divideDifferentNumBuild8() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_8"})
    public void divideWithZeroNumBuild8() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_8"})
    public void concatenatePositiveNumBuild8() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_8"})
    public void concatenateNegativeNumBuild8() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_8"})
    public void concatenateDifferentNumBuild8() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_8"})
    public void concatenateWithZeroNumBuild8() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }



    //Group build 1
//Group Add
    @Test(groups = {"Add", "Build_9"})
    public void addPositiveNumBuild9() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("5");
    }

    @Test(groups = {"Add", "Build_9"})
    public void addNegativeNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("-5");
    }

    @Test(groups = {"Add", "Build_9"})
    public void addDifferentNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("1");
    }

    @Test(groups = {"Add", "Build_9"})
    public void addWithZeroNumBuild9() throws InterruptedException {
        steps.enterNumbers("0", "3")
                .checkSolution("3");
    }

    //Group Subtract
    @Test(groups = {"Subtract", "Build_9"})
    public void subtractPositiveNumBuild9() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("-1");
    }

    @Test(groups = {"Subtract", "Build_9"})
    public void subtractNegativeNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("1");
    }

    @Test(groups = {"Subtract", "Build_9"})
    public void subtractDifferentNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-5");
    }

    @Test(groups = {"Subtract", "Build_9"})
    public void subtractWithZeroNumBuild9() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("-3");
    }

    //Group Multiply
    @Test(groups = {"Multiply", "Build_9"})
    public void multiplyPositiveNumBuild9() throws InterruptedException {
        steps.enterNumbers("2", "3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_9"})
    public void multiplyNegativeNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "-3")
                .checkSolution("6");
    }

    @Test(groups = {"Multiply", "Build_9"})
    public void multiplyDifferentNumBuild9() throws InterruptedException {
        steps.enterNumbers("-2", "3")
                .checkSolution("-6");
    }

    @Test(groups = {"Multiply", "Build_9"})
    public void multiplyWithZeroNumBuild9() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Divide
    @Test(groups = {"Divide", "Build_9"})
    public void dividePositiveNumBuild9() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_9"})
    public void divideNegativeNumBuild9() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("3");
    }

    @Test(groups = {"Divide", "Build_9"})
    public void divideDifferentNumBuild9() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-3");
    }

    @Test(groups = {"Divide", "Build_9"})
    public void divideWithZeroNumBuild9() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("0");
    }

    //Group Concatenate
    @Test(groups = {"Concatenate", "Build_9"})
    public void concatenatePositiveNumBuild9() throws InterruptedException {
        steps.enterNumbers("6", "2")
                .checkSolution("62");
    }

    @Test(groups = {"Concatenate", "Build_9"})
    public void concatenateNegativeNumBuild9() throws InterruptedException {
        steps.enterNumbers("-9", "-3")
                .checkSolution("-9-3");
    }

    @Test(groups = {"Concatenate", "Build_9"})
    public void concatenateDifferentNumBuild9() throws InterruptedException {
        steps.enterNumbers("-9", "3")
                .checkSolution("-93");
    }

    @Test(groups = {"Concatenate", "Build_9"})
    public void concatenateWithZeroNumBuild9() throws InterruptedException {
        steps.selectBuild("1");
        steps.enterNumbers("0", "3")
                .checkSolution("03");
    }




}
