// sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 Using While Loop

import java.util.Scanner;
public class Sum_N_Natural_Num_While
{
    public static void main(String[] args)
    {
    System.out.print("Enter any Numbers : ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int count = 1,sum=0;

    while ( count <= n)
    {
        sum = n*(n+1)/2; //Logic
        System.out.print(count + "+"); //Series of Natural Numbers
        count++;
    }
    System.out.print(" Sum = " +sum);

    }
}
