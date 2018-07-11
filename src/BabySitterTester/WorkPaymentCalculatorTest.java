package BabySitterTester;

import org.junit.*;
import static org.junit.Assert.*;

import BabySitter.WorkPaymentCalculator;
import BabySitter.DefaultHours;

public class WorkPaymentCalculatorTest
{
    private static WorkPaymentCalculator workPaymentCalculator;

    @BeforeClass
    public static void setup()
    {
        workPaymentCalculator = new WorkPaymentCalculator(
                DefaultHours.START_TIME.getValue(),
                DefaultHours.END_TIME.getValue(),
                DefaultHours.BED_TIME.getValue());
    }

    @AfterClass
    public static void cleanup()
    {
        if(workPaymentCalculator != null)
        {
            workPaymentCalculator = null;
        }
    }

    @Test
    public void validObject()
    {
        assertNotNull(workPaymentCalculator);
    }

    @Test
    public void calculatePay()
    {
        int expected = 132;
        int actual = workPaymentCalculator.calculatePay();
        assertEquals(expected, actual);
    }

    @Test
    public void payFromStartToBed()
    {
        int expected = 36;
        int actual = workPaymentCalculator.payFromStartToBed();
        assertEquals(expected, actual);
    }

    @Test
    public void payFromBedToMidnight()
    {
        int expected = 32;
        int actual = workPaymentCalculator.payFromBedToMidnight();
        assertEquals(expected, actual);
    }

    @Test
    public void payFromMidnightToEnd()
    {
        int expected = 64;
        int actual = workPaymentCalculator.payFromMidnightToEnd();
        assertEquals(expected, actual);
    }
}