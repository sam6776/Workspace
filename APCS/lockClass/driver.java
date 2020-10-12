package APCS.lockClass;

public class driver 
{
    public static void main(String args[])
    {
        Coin a = new Coin();
        a.flip(); // get a value
        System.out.println("The coin is locked: " + a.locked());
        System.out.println("Before locked: " + a);
        a.lock(0); // lock the lock using the default key
        System.out.println("After locked: " + a);
        a.setKey(0, 1234); // change the key
        a.unlock(1234); //unlock with the right key
        System.out.println("After unlock: " + a);
        a.lock(27); // lock with wrong key
        System.out.println("Locked with the wrong key above");

        System.out.println("\nnew coin making use of the new constructor");
        Coin b = new Coin(365, true); // new coin, locked by default with a key of 365
        System.out.println("Coin was chosen to be locked by default");
        System.out.println("Attempt to print coin B: " + b); // doesn't give a value
        b.unlock(365); // unlock it with key
        System.out.println("Coin b is locked: " + b.locked());
        b.flip(); // flip it to assign a state
        System.out.println("After unlocked: " + b); // print out the value after its been unlocked
    }    
}
