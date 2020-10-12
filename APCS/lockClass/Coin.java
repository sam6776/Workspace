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
      if(!(isLocked))
      {
         face = (int) (Math.random() * 2);
      }
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if(!(isLocked))
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
      faceName = "The class is currently locked, pleace unlock it.";
      return faceName;
   }

    @Override
    public void lock(int key) 
    {
        if(this.key == key)
        {
           isLocked = true;
        }
        else
        {
           System.out.println("The key given is incorrect.");
        }
    }

    @Override
    public void unlock(int key)
     {
        if(this.key == key)
        {
           isLocked = false;
        }
        else
        {
           System.out.println("The key given is incorrect.");
        }
    }

    @Override
    public void setKey(int key)
     {
        this.key = key;
    }

    @Override
    public boolean locked() 
    {
        return isLocked;
    }
}
