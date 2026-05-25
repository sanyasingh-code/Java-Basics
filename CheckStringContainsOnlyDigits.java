import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        int len = s1.length();
        int c=0;
        for(int i=0; i<len; i++)
        {
            char ch = s1.charAt(i);
            if(ch<'0' || ch>'9')
            {
                c++;
                break;
            }
        }
        if(c==0)
        System.out.println("Only Digits");
        else
        System.out.println("Not Only Digits");
    }
}
