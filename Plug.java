
/**
 * Plug class
 */
public class Plug
{
    // instance variables
    //isOn ia public so that the state of the plug can be changed
    public boolean isOn;

    /**
     * Constructor for objects of class Plug
     */
    public Plug()
    {
        // initialise instance variables
        isOn = false;
    }
    
    //returning state of plug
    public boolean state()
    {
        // put your code here
       return isOn;
    }
}
