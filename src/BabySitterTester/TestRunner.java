package BabySitterTester;

import java.util.ArrayList;

import org.junit.*;

import BabySitter.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner
{
    public static void main(String[] args)
    {
        ArrayList<Class> classesToTest = new ArrayList<>();
        boolean anyFailures = false;

        classesToTest.add(BabySitterTest.class);
        classesToTest.add(WorkPaymentCalculatorTest.class);

        for (Class classToTest : classesToTest)
        {
            Result testResult = JUnitCore.runClasses(classToTest);
            for (Failure failure : testResult.getFailures())
            {
                System.out.println(failure.toString());
            }
            if (!testResult.wasSuccessful())
            {
                anyFailures = true;
            }
        }
        if (anyFailures)
        {
            System.out.println("\nThere was at least one failure. Please see above");
        }
        else
        {
            System.out.println("ALL TEST PASSED");
        }

    }
}
