// Sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

import java.util.Scanner;
public class Sum_N_Natural_Numbers
{
    public static void main(String[] args)
    {

        int sum=0; // initialization 
        System.out.println("Enter any one Number");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            sum = n*(n+1)/2; //Logic
            if ( i <= n-1)
            {
                System.out.print(i + "+"); //Series of Natural Numbers
            }
        }
        System.out.print(n);
        System.out.println(" Sum = "+sum); //Sum of Natural Numbers
    }
}
