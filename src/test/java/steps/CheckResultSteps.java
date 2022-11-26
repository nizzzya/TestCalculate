package steps;

import pages.CalculatePage;

public class CheckResultSteps {
    CalculatePage calculatePage = new CalculatePage();

    public CheckResultSteps checkSolution (String expectedResult) {
        calculatePage.checkOnCorrectResult(expectedResult);
        return this;
    }

    public CheckResultSteps checkForNegativeInput ( String expectedResult ) {
        calculatePage.checkUncorrectedResult(expectedResult);
        return this;
    }
}
