/*
This class takes 2 numbers and does the following: 
The sum
The difference
The Product
The average
The distance (absolute value of the difference)
The maximum ( the larger of the two )
The minimum ( the smaller of the two )
*/
public class Pair
{
    private int num1;
    private int num2;
    /*
    Constructor

    Initializes the numbers inputted in the driver to the instance data.

    Input: 
    2 integers

    Output: 
    None
    */
    public Pair(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sum()
    {
        int sum = num1 + num2;
        return sum;
    }
    public int diff()
    {
        int diff = num1 - num2;
        return diff;
    }
    public int average()
    {
        int ave = (num1 + num2) / 2;
        return ave;
    }
    public int multiple()
    {
        int mult = num1 * num2;
        return mult;
    }
    public int dist()
    {
        int distance = Math.abs(num1 - num2);
        return distance;
    }
    public int max()
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    public int min()
    {
        if(num1 < num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    /** ToString
     * 
     * Returns a string representation of the instance data
     * 
     * Inputs:
     * None
     * 
     * Outputs:
     * String with both inputted numbers in it
     */
    public String toString()
    {
        String output = "Num1: " + num1 + "\nNum2: " + num2;
        return output;
    }
}