import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter term:");
        int num = in.nextInt();
        int s = sum(num);
        System.out.println("Sum of N numbers: " +s);
    }
static int sum(int n)
{
    if(n==1)
    return 1;
    
    return n + sum(n-1);
}
}
