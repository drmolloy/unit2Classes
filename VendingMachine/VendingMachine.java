

/**
 * Write a description of class VendingMachine here.
 * 
 * @dmolloy
 * @9/18/2014)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int numberOfCans;
    private int numberOfTokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
      
    }

    /**
     * This method adds the number of cans added to the vending machine to the number of cans in the machine.
     * @post Cans will have an integer value.
     * @param  Number of cans that will be added to the machine.
     */
    public void fillUp(int cans)
    {
        numberOfCans = numberOfCans + cans;
    }

    /**
     *This method allows the user to put a token into the machine and a token will be added to the total tokens in the machine and a can will removed from the number of cans in the machine.
     
     * @pre The numberOfTokens and numberOfCans will have an int value.
     
     */
    public void insertToken()
    {
        this.numberOfTokens = this.numberOfTokens + 1;
        this.numberOfCans = this.numberOfCans - 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getCanCount()
    {
       return this.numberOfCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokenCount()
    {
       return this.numberOfTokens;
    }

}
