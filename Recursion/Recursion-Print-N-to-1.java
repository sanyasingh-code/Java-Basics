import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter term:");
        int num = in.nextInt();
        print(num);
    }
static void print(int n)
{
    if(n==0)
    {
    return;
    }
    System.out.print(n + " ");
    print(n-1);
}
}
