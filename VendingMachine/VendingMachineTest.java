

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
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
    public void testFillUp()
    {
       VendingMachine testVendingMachine = new VendingMachine();
       testVendingMachine.fillUp(20);
       int cans = testVendingMachine.getCanCount();
       assertEquals(30, cans);
       
       testVendingMachine.fillUp(5);
       cans = testVendingMachine.getCanCount();
       assertEquals(35, cans);
    }

    @Test
    public void testInsertToken()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.insertToken();
        int cans = testVendingMachine.getCanCount();
        int tokens = testVendingMachine.getTokenCount();
        assertEquals(9, cans);
        assertEquals(1, tokens);
    }
}
