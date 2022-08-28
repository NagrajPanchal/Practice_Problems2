//  Reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner; // Import Package
public class Reverse_For // Class name
{ //class start
    public static void main(String[] args) //Main Class
    { // Main Class Start
    int reverse = 0, rem; // Declaration
    System.out.print("Enter any Numbers : "); // Display
    Scanner sc = new Scanner(System.in); // Read
        for (int num = sc.nextInt(); num > 0; num /= 10 ) // initialization; condition; increment/decrement
        { // For Loop Start
            rem = num % 10; // Logic Statement
            reverse = reverse * 10 + rem; // Logic Statement
        } // For loop close
        System.out.println("Reverse Number : " +reverse); //Print Statement

    } // Main class close
} // class close
