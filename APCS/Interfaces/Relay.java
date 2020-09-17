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
        TimeB[] raceLegs = new TimeB[3];
        raceLegs[0] = new TimeB(905);
        raceLegs[1] = new TimeB(0,1,43);
        raceLegs[2] = new TimeB("0:45:17");
        
        System.out.println("First runner:  " + raceLegs[0].toString());
        System.out.println("Second runner: " + raceLegs[1].toString());
        System.out.println("Third runner:  " + raceLegs[2].toString());
        System.out.println("Sum: " + raceLegs[0].add(raceLegs[1].add(raceLegs[2])));
     }
        
}       
/*
1. There is no reference to TimeA in Time.
2. NA
3. There is a reference to Time.java next to the class name
and the work impliments.
4. The output for all of the sections is "some time".
5. The toString prints out some time and not any useful info
6. It is 1 hour, 2 minutes, and 45 seconds.
7. This is correct.
8. It is no longer correct, as the sum remains the same.
*/    