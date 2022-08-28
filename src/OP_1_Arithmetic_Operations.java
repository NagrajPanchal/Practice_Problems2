// Enter two numbers and do the following arithmetic Operations find max and min.

import java.util.Scanner;
public class OP_1_Arithmetic_Operations
{
    public static void main(String[] args)
    {
        double w,x,y,z;
        int a,b,c;
        System.out.println("Enter a Value : ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    System.out.println("Enter b Value : ");
    b = sc.nextInt();
    System.out.println("Enter c Value : ");
    c = sc.nextInt();

    w=a+b*c;
    x=c+a/b;
    y=a%b+c;
    z=a*b+c;
        System.out.println("Arithmetic Operations Result is : ");
        System.out.println(a+"+"+b+"*"+c+"="+w);
        System.out.println(c+"+"+a+"/"+b+"="+x);
        System.out.println(a+"%"+b+"+"+c+"="+y);
        System.out.println(a+"*"+b+"+"+c+"="+z);

        if ((w >= x) && (w>= y) && (w>=z))
        {
            System.out.println("Maximum value is : " +w);
        }
        if ((w <= x) && (w<= y) && (w<=z))
        {
            System.out.println("Minimum value is : " +w);
        }
        if ((x >= w) && (x>= y) && (x>=z))
        {
            System.out.println("Maximum value is : " +x);
        }
        if ((x <= w) && (x<= y) && (x<=z))
        {
            System.out.println("Minimum value is : " +x);
        }
        if ((y >= w) && (y>= x) && (y>=z))
        {
            System.out.println("Maximum value is : " +y);
        }
        if ((y <= w) && (y<= x) && (y<=z))
        {
            System.out.println("Minimum value is : " +y);
        }
        if ((z >= w) && (z>= x) && (z>=y))
        {
            System.out.println("Maximum value is : " +z);
        }
        if ((z <= w) && (z<= x) && (z<=y))
        {
            System.out.println("Minimum value is : " +z);
        }
    }
}
