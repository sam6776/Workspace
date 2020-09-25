package APCS.Interfaces;
/**
 * TimeA - a class to store records of race times that run 
 * in units measured in hours/minutes/seconds.
 * 
 * @author dlevine
 * @version August 31, 2006
 *
 */
public class TimeC implements Time {

    private String time;

    /**
     * Simple constructor assumes data is in proper format
     * 
     * @param h number of hours
     * @param m number of minutes
     * @param s number of seconds
     */
    public TimeC(int h, int m, int s) {
        time = "" + h + ":" + m + ":" + s;
    }

    /**
     * Constructor that assumes a total number of seconds
     * 
     * @param total the total number of seconds taken
     */
    public TimeC(int total) {
        int hours = total / 3600;
        int minutes = (total / 60) % 60;
        int seconds = total % 60;
        time = "" + hours + ":" + minutes + ":" + seconds;
    }

    /**
     * Constructor that assumes a properly formatted time String
     * 
     * @param time the time as a string
     */
    public TimeC(String time) 
    {
        this.time = time;
    }

    /**
     * Adds the given time to the current time, producing the sum
     * 
     * @param other the given time to add
     * @return the sum of this time and the other time
     */
    public Time add(Time other) {
        // cast the Time object to a type TimeA
        TimeC otherTime = (TimeC) other;
        int totalTime = ((this.getHours() + otherTime.getHours()) * 3600) +
        ((this.getMinutes() + otherTime.getMinutes()) * 60) +
         (this.getSeconds() + otherTime.getSeconds());
        int hrs = totalTime / 3600;
        int min = (totalTime / 60) % 60;
        int sec = totalTime % 60;
        String combo = "" + hrs + ":" + min + ":" + sec;

        return new TimeC(combo); // reduce them to smallest values and return
    }
    /** Gets the seconds value from instance data
     * 
     * @return the number of seconds
     */
    public int getSeconds()
    {
        String[] data = time.split(":");
        int seconds = Integer.parseInt(data[2]);
        return seconds;
    }
       /** Gets the minutes value from instance data
     * 
     * @return the number of minutes
     */
    public int getMinutes()
    {
        String[] data = time.split(":");
        int minutes = Integer.parseInt(data[1]);
        return minutes;
    }
       /** Gets the hours value from instance data
     * 
     * @return the number of hours
     */
    public int getHours()
    {
        String[] data = time.split(":");
        int hours = Integer.parseInt(data[0]);
        return hours;
    }
    
    /**
     * Return a String representation of this time
     * @return this time represented as a String in hh:mm:ss format
     */
    public String toString() 
    {
        String representation = "Hours: " + this.getHours() + ", Minutes: "
        + this.getMinutes()+ ", Seconds: " + this.getSeconds();
         return representation;
    } 
}
