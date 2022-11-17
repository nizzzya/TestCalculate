package steps;

import pages.CalculatePage;

public class CalculateSteps {
    CalculatePage calculatePage = new CalculatePage();


    public CheckResultSteps calculate(String firstNum, String secondNum, String operation) throws InterruptedException {
        calculatePage.inputFirstNumber(firstNum);
        calculatePage.inputSecondNumber(secondNum);
        calculatePage.chooseOperation(operation);
//        calculatePage.checkOnlyIntegerVariable(onlyInt);

        calculatePage.calculate();
//        calculatePage.waitResult();
        Thread.sleep(5000);

        return new CheckResultSteps();
    }

    public void selectBuild(String build) {
        calculatePage.chooseBuild(build);
    }



}
