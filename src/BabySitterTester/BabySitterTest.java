package BabySitterTester;

import BabySitter.*;

import static org.junit.Assert.*;

import org.junit.*;

public class BabySitterTest
{
    private static BabySitter babysitter;

    @BeforeClass
    public static void setup()
    {
        babysitter = new BabySitter();
    }

    @AfterClass
    public static void cleanup()
    {
        if(babysitter != null)
        {
            babysitter = null;
        }
    }

    @Test
    public void validObjectCreation()
    {
        assertNotNull(babysitter);
    }

    @Test
    public void getStartTime()
    {
        int expected = 17;
        int actual = babysitter.getStartTime();
        assertEquals(expected, actual);
    }

    @Test
    public void getEndTime()
    {
        int expected = 4;
        int actual = babysitter.getEndTime();
        assertEquals(expected, actual);
    }

    @Test
    public void getBedTime()
    {
        int expected = 20;
        int actual = babysitter.getBedTime();
        assertEquals(expected, actual);
    }

    @Test
    public void getPay()
    {
        int expected = 132;
        int actual = babysitter.getPay();
        assertEquals(expected, actual);
    }

}