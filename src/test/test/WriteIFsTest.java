package src.test.java;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.main.java.WriteIFs;

/**
 * The test class src.test.java.WriteIFsTest.
 *
 * @author  kyounger
 * @version 1.3
 */
public class WriteIFsTest
{
    private static final double _0_5 = 0.5;
    private static final double _0_04 = 0.04;

    /**
     * Default constructor for test class src.test.java.WriteIFsTest
     */
    public WriteIFsTest()
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
    public void TestIfs()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.playerDied(true);
        assertEquals("Game Over!", writeIFs1.ss);
    }


    @Test
    public void TestTherm()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        assertEquals("heating", writeIFs1.thermoSTAT(62));
    }
    @Test
    public void TestTherm1()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        assertEquals("cooling", writeIFs1.thermoSTAT(81));
    }
    @Test
    public void TestCheckFuel1()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.checkFuel(_0_5);
        assertEquals(0, writeIFs1.x);
    }
    @Test
    public void TestCheckFuel2()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.checkFuel(_0_04);
        assertEquals(99, writeIFs1.x);
    }
    @Test
    public void TestFireControl()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        Object oo = new Object();
        writeIFs1.tt_s = 1;
        writeIFs1.fireplaceControl(oo);
        assertEquals(213, writeIFs1.tt_s);
    }
    @Test
    public void TestFireControl2()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        Object oo = new Object();
        writeIFs1.oo1 = 65;
        writeIFs1.tt_s = 1;
        writeIFs1.fireplaceControl(oo);
        assertEquals(1, writeIFs1.tt_s);
    }
    @Test
    public void TestFireControl3()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        Object oo = new Object();
        writeIFs1.oo2 = 80;
        writeIFs1.tt_s = 1;
        writeIFs1.fireplaceControl(oo);
        assertEquals(1, writeIFs1.tt_s);
    }

}
