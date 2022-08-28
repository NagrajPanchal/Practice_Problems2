// Read a Number 1,10,100,1000 and display unit, ten hundred
import java.util.Scanner;
public class Number_Display_Unit
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        if (num == 1) {
                sum = num * 10000;
                System.out.println(sum);
            } else if (num == 10) {
                sum = num * 1000;
                System.out.println(sum);
            } else if (num == 100) {
                sum = num * 100;
                System.out.println(sum);
            } else if (num == 10000) {
                sum = num * 1;
                System.out.println(sum);
            }else {
                System.out.println("Number is Invalid");
            }


    }
}
