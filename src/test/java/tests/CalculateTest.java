package tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalculateTest extends BaseTest{

    @Test
    public void check() throws InterruptedException {
        steps.selectBuild("8");
        steps.calculate("2" , "3", "Add")
                .checkSolution("5");
    }
}
