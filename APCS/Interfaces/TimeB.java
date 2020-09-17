/**
 * TimeA - a class to store records of race times that run 
 * in units measured in hours/minutes/seconds.
 * 
 * @author dlevine
 * @version August 31, 2006
 *
 */
public class TimeB implements Time {

    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Simple constructor assumes data is in proper format
     * 
     * @param h number of hours
     * @param m number of minutes
     * @param s number of seconds
     */
    public TimeB(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    /**
     * Constructor that assumes a total number of seconds
     * 
     * @param total the total number of seconds taken
     */
    public TimeB(int total) {
        hours = total / 3600;
        minutes = (total / 60) % 60;
        seconds = total % 60;
    }

    /**
     * Constructor that assumes a properly formatted time String
     * 
     * @param time the time as a string
     */
    public TimeB(String time) {
        String[] data = time.split(":");
        hours = Integer.parseInt(data[0]);
        minutes = Integer.parseInt(data[1]);
        seconds = Integer.parseInt(data[2]);
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
        return new TimeB(totalTime / 3600, (totalTime / 60) % 60, 
        totalTime % 60); // reduce them to smallest values and return
    }
    /** Gets the seconds value from instance data
     * 
     * @return the number of seconds
     */
    public int getSeconds()
    {
        return seconds;
    }
       /** Gets the minutes value from instance data
     * 
     * @return the number of minutes
     */
    public int getMinutes()
    {
        return minutes;
    }
       /** Gets the hours value from instance data
     * 
     * @return the number of hours
     */
    public int getHours()
    {
        return hours;
    }
    
    /**
     * Return a String representation of this time
     * @return this time represented as a String in hh:mm:ss format
     */
    public String toString() 
    {
        String representation = "Hours: " + hours + ", Minutes: "
        + minutes + ", Seconds: " + seconds;
         return representation;
    } 
}
