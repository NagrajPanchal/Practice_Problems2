//  Reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;
public class Reverse_While
{
    public static void main(String[] args)
    {
    int reverse=0,rem;
    System.out.println("Enter numbers ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // While Loop
    while ( n != 0 )
    {
        rem = n % 10;
        reverse = reverse * 10 + rem;
        n /= 10;
    }
    System.out.println("Reverse number : " + reverse);
    }
}
