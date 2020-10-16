package APCS.arr;

public class driver 
{
    public static void main(String args[])
    {
        char[][] arr = new char[26][26];
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String first = "";
        for(int x = 0; x < 26; x++)
        {
            for(int y = 0;y < 26; y++)
            {
                arr[x][y] = letters.charAt(y);
            }
            first = letters.charAt(0) + "";
            letters = letters.substring(1) + first;
        }
        for(int x = 0; x < 26; x++)
        {
            for(int y = 0;y < 26; y++)
            {
                System.out.print(arr[x][y]);
                if(y == 25)
                {
                    System.out.println();
                }
            }
        }
    } 
}   
