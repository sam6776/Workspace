/**
 * Relay.java - a class to handle the data for a relay race.
 * 
 * The time records for each runner of the relay race are stored in
 * an array.  The contents of this array are printed to the console
 * window and (not yet implemented) the total time is also printed.
 * 
 * @author dlevine
 * @version August 31, 2006
 *
 */
public class Relay 
{

     public static void main(String[] args) 
     {
        TimeA[] raceLegs = new TimeA[3];
        raceLegs[0] = new TimeA(903);
        raceLegs[1] = new TimeA(0,1,43);
        raceLegs[2] = new TimeA("0:45:17");
        
        System.out.println("First runner:  " + raceLegs[0].toString());
        System.out.println("Second runner: " + raceLegs[1].toString());
        System.out.println("Third runner:  " + raceLegs[2].toString());
       
     }
        
}       
        