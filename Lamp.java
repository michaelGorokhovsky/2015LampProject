
/**
 * CPS 109 Lamp Project
 * Michael Gorokhovsky
 * 500681974
 * 
 * Lamp class
 */
public class Lamp
{
    // instance variables
    private Plug pluggles;
    /**
     * Constructor for objects of class Lamp
     */
    public Lamp()
    {
        pluggles = new Plug();
    }

    //method to return the state of the lamp
    public boolean state()
    {
        // put your code here
        return pluggles.state();
    }
    
    //method to attach a plug to the lamp
    public void attach(Plug plug)
    {
        pluggles = plug;
    }
}
