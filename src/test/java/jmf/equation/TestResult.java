package jmf.equation;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PolynomeSecondDegreTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All tests passed successfully: " + result.wasSuccessful());
    }
}