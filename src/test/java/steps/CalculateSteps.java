package steps;

import pages.CalculatePage;

public class CalculateSteps {
    CalculatePage calculatePage = new CalculatePage();

    public void clearInputs() {
        calculatePage.clearFirstNumInput();
        calculatePage.clearSecondNumInput();
    }


    public CheckResultSteps enterNumbers(String firstNum, String secondNum) throws InterruptedException {
        calculatePage.inputFirstNumber(firstNum);
        calculatePage.inputSecondNumber(secondNum);

        calculatePage.calculate();

        calculatePage.waitSpiner();


        return new CheckResultSteps();
    }

    public void chooseOperation(String operation) {
        calculatePage.chooseOperation(operation);
    }

    public void selectBuild(String build) {
        calculatePage.chooseBuild(build);
    }



}
