import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int lcm = 1;

        for(int i = 1; ; i++)
        {
            if(i % a == 0 && i % b == 0)
            {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }
}
