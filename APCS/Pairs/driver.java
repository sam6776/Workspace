import java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notEqual = true;
        int num1;
        int num2;
        do { 
            System.out.print("Input a number: ");
            num1 = input.nextInt();
            System.out.print("Input another number that isn't equal to the previous one: ");
            num2 = input.nextInt();
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
            input.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        Pair nums = new Pair(num1, num2);
        System.out.println("sum: " + nums.sum());
        System.out.println(nums.average());
        System.out.println(nums.diff());
        System.out.println(nums.dist());
        System.out.println(nums.max());
        System.out.println(nums.min());
        System.out.println(nums.multiple());
        System.out.println(nums);
    }
}
