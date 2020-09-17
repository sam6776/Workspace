/**
 * TimeA - a class to store records of race times that run 
 * in units measured in hours/minutes/seconds.
 * 
 * @author dlevine
 * @version August 31, 2006
 *
 */
public class TimeB implements Time {

    private int total;
    
    /**
     * Simple constructor assumes data is in proper format
     * @param h number of hours
     * @param m number of minutes
     * @param s number of seconds
     */
    public TimeB(int h, int m, int s) 
    {
        total = 3600 * h + 60 * m + s;
    }
    
    /**
     * Constructor that assumes a total number of seconds
     * @param total the total number of seconds taken
     */   
    public TimeB(int total) 
    {
        this.total = total;
    }
    
    /**
     * Constructor that assumes a properly formatted time String
     * @param time the time as a string
     */
    public TimeB(String time) 
    {
        String[] data = time.split(":");
        total = (3600 * Integer.parseInt(data[0])) + 
        (60 * Integer.parseInt(data[1])) + 
        (Integer.parseInt(data[2]));
    }

    /**
     * Adds the given time to the current time, producing the sum
     * 
     * @param other the given time to add
     * @return the sum of this time and the other time
     */
    public Time add(Time other) {
        // cast the Time object to a type TimeA
        TimeB otherTime = (TimeB) other;
        // add them all together
        int totalTime = ((this.getHours() + otherTime.getHours()) * 3600)
                + ((this.getMinutes() + otherTime.getMinutes()) * 60) + (this.getSeconds() + otherTime.getSeconds());
        return new TimeB(totalTime); // reduce them to smallest values and return
    }
    /** Gets the seconds value from instance data
     * 
     * @return the number of seconds
     */
    public int getSeconds()
    {
        return total % 60;
    }
       /** Gets the minutes value from instance data
     * 
     * @return the number of minutes
     */
    public int getMinutes()
    {
        return (total / 60) % 60;
    }
       /** Gets the hours value from instance data
     * 
     * @return the number of hours
     */
    public int getHours()
    {
        return total / 3600;
    }
    
    /**
     * Return a String representation of this time
     * @return this time represented as a String in hh:mm:ss format
     */
    public String toString() 
    {
        String representation = "Hours: " + total / 3600 + ", Minutes: "
        + (total / 60) % 60 + ", Seconds: " + total % 60;
         return representation;
    } 
}
