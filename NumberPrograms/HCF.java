import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int hcf = 1;
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);
    }
}
