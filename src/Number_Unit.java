public class Number_Unit
{

    public static void main(String[] args) {
        System.out.println("Unit Numbers Series : ");
        int i=10,num1 = 1, num2 = num1*i, num3 = num2*i, num4 = num3*i, num5 = num4*i;
        if (1 <= num1) {
        if (num1 <= num2) {
        if (num2 <= num3) {
        if (num3 <= num4) {
        if (num4 <= num5) {
            System.out.print(num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5);
             }
        else {
            System.out.print("Number Invalid");
             }
             }
             }
             }
             }
    }
}
