package APCS.arr;

public class encryption 
{
    private String encryptedText;
    private String decryptedText;
    private String plainText;
    private char arr[][];
    private String key;

    public encryption(String plain)
    {
        arr = new char[26][26];
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
        plainText = plain;
        encryptedText = "";
        key = "corsair";
        decryptedText = "";
    }
    public String encrypt()
    {
        for(int n = 0; n < plainText.length(); n++)
        {
            char plainChar = plainText.charAt(n);
            if(n < key.length())
            {
                char keyChar = key.charAt(n);
                encryptedText += arr[keyChar][plainChar];
            }
            else{
                char keyChar = plainText.charAt(n - key.length());
                encryptedText += arr[keyChar][plainChar];
            }
        }
        return encryptedText;
    }
    public String decrypt()
    {
        for(int i = 0; i < encryptedText.length(); i++)
        {
            char encryptChar = encryptedText.charAt(i);
            if(i < key.length())
            {
                char keyChar = key.charAt(i);
                for(int a = 0; a < 26; a++)
                {
                    for(int b = 0; b < 26; b++)
                    {
                        if(arr[a][b] == encryptChar && arr[a][0] == keyChar)
                        {
                            decryptedText += arr[0][b];
                        }
                    }
                }
            }
        }
        return decryptedText;
    }  
}
