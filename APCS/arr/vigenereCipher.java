package APCS.arr;
public class vigenereCipher 
{
	public static void main(String[] args) 
	{
		char[][] arr = new char[26][26];
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String first = "";
		
		for( int x = 0; x < 26; x++)
		{
			for(int y = 0; y < 26; y++)
			{
				arr[x][y] = letters.charAt(y);  //use y becuase it will go through the string
			}
			first = letters.charAt(0) + "";  // get the first character in the string
			letters = letters.substring(1) + first;	
		}
		
		//print array to console
		for( int x = 0; x < 26; x++)
		{
			for(int y = 0; y < 26; y++)
			{
				System.out.print(arr[x][y] + " "); 
			}
			System.out.println();
		}
	}
	public String encrypt()
	{
		String encrypted = "";
		return encrypted;
	}

}
