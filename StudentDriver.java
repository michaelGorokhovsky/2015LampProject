/* Sample Driver/Test/Harness for CPS109 Assignment 1 Fall 2015 "Lamp" -- student version.
 */

public class StudentDriver
{
    public static void main(String[] args)
    {
        System.out.println("Testing Switch Methods\n_________________________________");
        System.out.println("Making a new Switch with the no constructor having no parameters");
        Switch aSwitch= new Switch();
        System.out.println("After construction A, Switch is on?: " + aSwitch.state());
        aSwitch.flip();
        System.out.println("After flipping, Switch is on?: " + aSwitch.state());
        System.out.println("Making a new Switch with constructor having its parameter set to true");
        aSwitch= new Switch(true);
        System.out.println("After construction, Switch is on?: " + aSwitch.state());
        aSwitch.flip();
        System.out.println("After flipping, Switch is on?: " + aSwitch.state());
        
        System.out.println("\nTesting Plug Methods\n_________________________________");
        Plug aPlug = aSwitch.wherePlug();
        System.out.println("Switch is on? " + aSwitch.state() +
            " Plug is on? " + aPlug.state());
        aSwitch.flip();
        System.out.println("Switch is on? " + aSwitch.state() +
            " Plug is on? " + aPlug.state());
        
        System.out.println("\nTesting Lamp Methods\n_________________________________");
        Lamp aLamp = new Lamp();
        System.out.println("After construction, Lamp is on?: " + aLamp.state());
        aLamp.attach(aSwitch.wherePlug());
        System.out.println("After plugging, Lamp is on?: " + aLamp.state());

        System.out.println("\nTesting Remote Methods\n_________________________________");
        Remote aRemote = new Remote();
        aRemote.attach(aSwitch);
        System.out.println("Before pressing remote button");
        System.out.println("Switch on? " + aSwitch.state() + 
            " Plug on? " + aPlug.state());
        System.out.println("After pressing remote button");
        aRemote.pressButton();
        System.out.println("Switch on? " + aSwitch.state() + 
            " Plug on? " + aPlug.state());
            
       Switch bSwitch = new Switch();
       System.out.println("After construction B, bSwitch is on?: " + bSwitch.state());
       System.out.println("After construction B, aSwitch is on?: " + aSwitch.state());
        bSwitch.flip();
        System.out.println("After flipping, bSwitch is on?: " + bSwitch.state());
        System.out.println("After flipping, aSwitch is on?: " + aSwitch.state());
        
        System.out.println("\nTesting Plug Methods B\n_________________________________");
        Plug bPlug = bSwitch.wherePlug();
        System.out.println("Switch is on? " + bSwitch.state() +
          " Plug is on? " + bPlug.state());
       System.out.println("aSwitch? " + aSwitch.state()+ " aPlug? "
            + aPlug.state() );
        bSwitch.flip();
        System.out.println("Switch is on? " + bSwitch.state() +
            " Plug is on? " + bPlug.state());

            
   }
}
