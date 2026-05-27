import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter term:");
        int num = in.nextInt();
        int f = fact(num);
        System.out.println("Factorial of a number: " +f);
    }
static int fact(int n)
{
    if(n==1)
    return 1;
    
    return n * fact(n-1);
}
}
