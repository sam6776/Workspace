package APCS.Pairs;
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
    /** Constructor
     * 
     * constructs the pair
     * 
     * @param num1, the first number
     * @param num2, the second number
     */
    public Pair(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    /** Sum
     * Adds the two numbers together
     * 
     * @return sum, the two numbers added together
     */
    public int sum()
    {
        int sum = num1 + num2;
        return sum;
    }
    /** Diff
     * Gives the value of the first number minus the second
     * 
     * @return diff, the difference
     */
    public int diff()
    {
        int diff = num1 - num2;
        return diff;
    }
    /** Average
     * Gives the mean of the two numbers
     * 
     * @return ave, the average
     */
    public int average()
    {
        int ave = (num1 + num2) / 2;
        return ave;
    }
    /** Multiply
     * Multiplies the two numbers toegther
     * @return mult, the product of the two numbers
     */
    public int multiple()
    {
        int mult = num1 * num2;
        return mult;
    }
    /** Distance
     * Gives the distance, which is the absolute value
     * of the difference
     * @return distance
     */
    public int dist()
    {
        int distance = Math.abs(num1 - num2);
        return distance;
    }
    /** Max
     * Gives the larger of the two numbers
     * 
     * @return max, larger number
     */
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
    /** Min
     * 
     * Tests to find the smaller of the two numbers
     * 
     * @return min
     */
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
     * @return output, the first and second number
     */
    public String toString()
    {
        String output = "Num1: " + num1 + "\nNum2: " + num2;
        return output;
    }
}