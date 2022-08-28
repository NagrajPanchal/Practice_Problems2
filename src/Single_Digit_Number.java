//  Read a single Digit Number and write in word

import java.util.Scanner;
public class Single_Digit_Number
{
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter Single digit Number : ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i >= n; i++)
        {
            n = scan.nextInt();

            if (n < 0) {
                System.out.println(n + " is Negative");
            } else if (n > 0) {
                if (n == 1) {
                    System.out.println("One");
                }
                if (n == 2) {
                    System.out.println("Two");
                }
                if (n == 3) {
                    System.out.println("Three");
                }
                if (n == 4) {
                    System.out.println("Four");
                }
                if (n == 5) {
                    System.out.println("Five");
                }
                if (n == 6) {
                    System.out.println("Six");
                }
                if (n == 7) {
                    System.out.println("Seven");
                }
                if (n == 8) {
                    System.out.println("Eight");
                }
                if (n == 9) {
                    System.out.println("Nine");
                }
                }
            else
            {
                System.out.println("Zero");
                System.out.println("Enter 0 or apart from 1-9 then Exit");
                break;
            }

        }

    }
}
