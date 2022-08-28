// Vowel_Consonant

import java.util.Scanner;
public class Vowel_Consonant
{
    public static void main(String[] args)
    {
    System.out.println("Enter any Single Character : ");
    Scanner sc = new Scanner(System.in);
    boolean isVowel = false; //boolean
    char ch = sc.next().charAt(0); //Read Character

    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            isVowel = true;
    }
    if (isVowel) //isVowel == true
    {
        System.out.println(ch + " is Vowel");
    }
    else
    {
        if (!isVowel) //( ( ch >= 'a' && ch <= 'z' ) || ( ch >= 'A' && ch <= 'Z' ) ) //isVowel == false
        {
            System.out.println(ch+ " is Consonant");
        }
        else
        {
            System.out.println(ch + " is Not a Alphabet ");
        }

        
    }
    }
}
