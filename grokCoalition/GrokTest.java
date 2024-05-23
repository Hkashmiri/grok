

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GrokTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GrokTest
{
    private PowerPill blue;
    private PowerPill pink;
    private PowerPill green;
    private PowerPill yellow;
    private PowerPill indigo;
    private PowerPill red;
    private Grok grok1;

    /**
     * Default constructor for test class GrokTest
     */
    public GrokTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        blue = new PowerPill("blue");
        pink = new PowerPill("pink", 100);
        green = new PowerPill("green", 50);
        yellow = new PowerPill("yellow", 5);
        red = new PowerPill("red", 60);
        indigo = new PowerPill("indigo", 70);
        grok1 = new Grok(100);
        grok1.pickupPowerPill(pink);
        grok1.pickupPowerPill(green);
        grok1.pickupPowerPill(indigo);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void takePowerPillTest()
    {
        grok1.pickupPowerPill(pink);
        grok1.pickupPowerPill(green);
        grok1.pickupPowerPill(indigo);
        grok1.takePowerPill();
        grok1.takePowerPill();
        grok1.takePowerPill();
        grok1.takePowerPill();
    }
}

