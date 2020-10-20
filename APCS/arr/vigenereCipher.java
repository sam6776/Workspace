package APCS.arr;

import java.util.Scanner;

public class vigenereCipher 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a phrase to encrypt");
        String plainText = sc.nextLine();
        sc.close();
        encryption encrypt = new encryption(plainText);
        System.out.println(encrypt.encrypt());
	}
}
