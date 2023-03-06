package src.test.java;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.java.WriteLoops;

/**
 * The test class src.test.java.WriteLoopsTest.
 *
 * @author  kyounger
 * @version 1.2
 */
public class WriteLoopsTest
{
    /**
     * Default constructor for test class src.test.java.WriteLoopsTest
     */
    public WriteLoopsTest()
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
    public void TestOneToFive()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(5, writeLoo1.oneToFive());
    }
    @Test
    public void TestOneToTen()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(10, writeLoo1.oneToTen());
    }
    @Test
    public void TestStartAtTwentyOne()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(11, writeLoo1.startAtTwentyOne());
    }

    @Test
    public void TestCountDown()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(100, writeLoo1.countDown());
    }

    @Test
    public void Test2to32()
    {
        //error should be 17?
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(17, writeLoo1.byTwoTo32()); // error in source
    }

    @Test
    public void TestCountDownFrom5000()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(455, writeLoo1.countDownFrom5000());
    }

    @Test
    public void TestNestedFors()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(100, writeLoo1.nestedFors());
    }

    @Test
    public void TestHelloZipCode()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(47, writeLoo1.helloZipCode());
    }

    @Test
    public void TestDriveHome()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(6, writeLoo1.driveHome());
    }



    @Test
    public void TestCheckGameScore()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(true, writeLoo1.checkGameScore());
    }

    @Test
    public void TestCheckGameScoreDoWhile()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(false, writeLoo1.checkGameScoreDoWhile());
    }

    @Test
    public void TestCheckServer()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(3, writeLoo1.checkServerStatus());
    }

    @Test
    public void oneToFive() {
    }

    @Test
    public void oneToTen() {
    }

    @Test
    public void startAtTwentyOne() {
    }

    @Test
    public void countDown() {
    }

    @Test
    public void byTwoTo32() {
    }

    @Test
    public void countDownFrom5000() {
    }

    @Test
    public void nestedFors() {
    }

    @Test
    public void helloZipCode() {
    }

    @Test
    public void simpleLoops() {
    }

    @Test
    public void driveHome() {
    }

    @Test
    public void checkGameScore() {
    }

    @Test
    public void checkGameScoreDoWhile() {
    }

    @Test
    public void checkServerStatus() {
    }

    @Test
    public void loop50by7() {
    }

    @Test
    public void foo() {
    }

    @Test
    public void rewriteFooAsFor() {
    }

    @Test
    public void rewriteFooAsWhile() {
    }

    @Test
    public void manageYardAndJunior() {
    }

    @Test
    public void tallyVote1() {
    }

    @Test
    public void tallyVote2() {
    }
}
