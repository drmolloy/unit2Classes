

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
       numberOfCans = 10;
    }

    /**
     * This method adds the number of cans added to the vending machine to the number of cans in the machine.
     * @post Cans will have an integer value.
     * @param  Number of cans that will be added to the machine.
     */
    public void fillUp(int cans)
    {
        this.numberOfCans = this.numberOfCans + cans;
    }


    /**
     *This method allows the user to put a token into the machine and a token will be added to the total tokens in the machine and a can will removed from the number of cans in the machine.
     
     * @pre The numberOfTokens and numberOfCans will have an int value.
     * @post the numberOfTokens will be 1 more than before and the numberOfCans will be 1 less than before
     *
     */
    public void insertToken()
    {
        this.numberOfTokens = this.numberOfTokens + 1;
        this.numberOfCans = this.numberOfCans - 1;
    }


    /**
     * this method returns the number of cans in the vending machine
     *
     * @pre     assumes that numberOfCans has an int value
     * 
     * @return  number of cans in the vending machine
     */
    public int getCanCount()
    {
       return this.numberOfCans;
    }


    /**
     * this method returns the number of tokens in the vending machine
     *
     * @pre     assumes that numberOfTokens has an int value
  
     * @return  number of tokens in the vending machine
     */
    public int getTokenCount()
    {
       return this.numberOfTokens;
    }

}
