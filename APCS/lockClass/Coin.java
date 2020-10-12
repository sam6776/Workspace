package APCS.lockClass;
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin implements lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int key;
   private boolean isLocked;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      key = 0;
      isLocked = false;
      if(!(isLocked))
      {
         flip();
      }
   }

   /** Coin
    * Overloaded constructor that takes the key and the state of being locked as an input
    * @param key the key for the lock
    * @param locked the status of the method
    */
   public Coin(int key, boolean locked)
   {
      this.key = key;
      isLocked = locked;
      if(!(isLocked))
      {
         flip();
      }
   }
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      if(!(isLocked)) // locks the method if it is locked
      {
         face = (int) (Math.random() * 2);
      }
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS); // not locked because it doesn't change data
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if(!(isLocked)) // locks the method if it is locked
      {
         if (face == HEADS)
         {
            faceName = "Heads";
         }  
         else
         { 
            faceName = "Tails";
         }
         return faceName;
      }
      faceName = "The class is currently locked, pleace unlock it."; // different string returned if the class is locked
      return faceName;
   }

    @Override
    /** lock
     *  Locks the methods if the key given equals the original key
     * @param key the key for the class
     */
    public void lock(int key) 
    {
        if(this.key == key) // locks if the keys are the same
        {
           isLocked = true;
        }
        else
        {
           System.out.println("The key given is incorrect."); // tells if it isn't correct
        }
    }

    /** unlock
     * Unlocks the methods if the key given equals the original key
     * @param key the key for the class
     */
    @Override
    public void unlock(int key)
     {
        if(this.key == key) // unlocks if the keys are the same
        {
           isLocked = false;
        }
        else
        {
           System.out.println("The key given is incorrect.");
        }
    }

    /** setKey
     *  Sets the key for the class to be a specific integer value
     * @param currentKey the current key
     * @param newKey the new key
     */
    @Override
    public void setKey(int currentKey, int newKey) 
     {
        if(currentKey == key) // checking if the old key is correct
        {
           key = newKey;
        }
        else
        {
           System.out.println("The current key given was incorrect");
        }
    }

    /** locked
     *  Tests whether the class is locked or unlocked
     * @return if the class is locked
     */
    @Override
    public boolean locked() 
    {
        return isLocked; // returns if it is locked
    }
}
