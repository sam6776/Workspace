import java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
        // Variable declaration, taking inputs and testing
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        boolean notEqual = true;
        int num1;
        int num2;

        // Taking number inputs and testing to make sure they're not the same 
        // to not cause an error in the min and max methods
        do { 
            System.out.print("Input a number: ");
            num1 = input1.nextInt();
            System.out.print("Input another number that isn't equal to the previous one: ");
            num2 = input2.nextInt();
            if(num1 == num2)
            {
                notEqual = false;
                System.out.println("Numbers are equal. Please input different numbers.");
            }
            else{
                notEqual = true;
            }
        } while (notEqual == false);
        try {
            input1.close();
            input2.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        // Invoking the Pairs class, calling the constructor, and testing the methods
        Pair nums = new Pair(num1, num2);
        System.out.println("sum: " + nums.sum());
        System.out.println("Average: " + nums.average());
        System.out.println("Difference: " + nums.diff());
        System.out.println(nums.dist());
        System.out.println(nums.max());
        System.out.println(nums.min());
        System.out.println(nums.multiple());
        System.out.println(nums);
    }
}
