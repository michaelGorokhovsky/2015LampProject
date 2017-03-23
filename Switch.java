
/**
 * Switch class
 */
public class Switch
{
    // instance variables
    private boolean isOn;
    private Plug pluggles;
    /**
     * Constructors for objects of class Switch
     */
    public Switch()
    {
        pluggles = new Plug();
        pluggles.isOn = false;
        isOn = false;;
    }
    public Switch(boolean initialState)
    {
        pluggles = new Plug();
        pluggles.isOn = initialState;
        isOn = initialState;
    }

    /**
     * methods
     * 
     */
    //returns state of switch
    public boolean state()
    {
        // put your code here
        return isOn;
    }
    
    //flips both the switch and the plug
    public void flip()

    {
        isOn =!isOn;
        pluggles.isOn = isOn;
    }
    
    //returns plug
    public Plug wherePlug()
    {
        return pluggles;
    }
}
