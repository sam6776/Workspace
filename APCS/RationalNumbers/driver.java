package APCS.RationalNumbers;

public class driver 
{
    public static void main(String args[])
    {
        // Test the compareTo with a negative output
        Rational first = new Rational(5, 9);
        Rational second = new Rational(6, 9);
        System.out.println("Negative: " + first.compareToConvert(first.compareTo(second)));

        // Test the compareTo with a positive output
        Rational third = new Rational(9, 5);
        Rational fourth = new Rational(7, 10);
        System.out.println("Positive: " + third.compareToConvert(third.compareTo(fourth)));

        // Test the compareTo if they're the same value
        Rational fifth = new Rational(1, 2);
        Rational sixth = new Rational(2, 4);
        System.out.println("Same: " + fifth.compareToConvert(fifth.compareTo(sixth)));
    }
}
