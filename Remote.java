
/**
 * Remote class
 */
public class Remote
{
    // instance variables - replace the example below with your own
    private Switch lightSwitch;

    /**
     * Constructor for objects of class Remote
     */
    public Remote()
    {
        // initialise instance variables
       
    }

    //method to attach a switch to the remote
    public void attach(Switch aSwitch)
    {
       lightSwitch = aSwitch;
    }
    
    //method to flip the switch
    public void pressButton()
    {
        lightSwitch.flip();
    }
}
