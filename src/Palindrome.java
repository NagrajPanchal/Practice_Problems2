// Palindrome

import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.print("Enter any Number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rem, sum= 0, c;
        c=num;

        while ( num > 0 )
        {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if ( c == sum )
            System.out.println(sum+" is Palindrome");
        else
        System.out.println(c+" is Not a Palindrome");
    }
}
