package APCS.testing;

class test 
{
    public static void main(String[] args)
    {
        int x = 0;
        for (int row = 5; row <= 11; row++)
        {
            for (int col = 3; col <= 18; col++)
            {
              x++;
            }
        }
        System.out.println(x);
    }
}