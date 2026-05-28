import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = in.nextLine();
        String str1 = str.toUpperCase();
        int len = str1.length();
        int con=0;
        
        for(int i=0; i<len; i++)
        {
            char ch = str1.charAt(i);
            if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
            {
                con++;
            }
        }
        System.out.println("Number of Consonants: " + con);
    }
}
