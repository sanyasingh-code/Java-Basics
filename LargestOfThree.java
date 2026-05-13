import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int a,b,c;
    
    System.out.println("Enter 1st number: ");
    a = in.nextInt();
    System.out.println("Enter 2nd number: ");
    b = in.nextInt();
    System.out.println("Enter 3rd number: ");
    c = in.nextInt();
    
    if(a>b && a>c)
     System.out.println("Largest Number: " +a);
     
    else if(b>a && b>c)
     System.out.println("Largest Number: " +b);
     
    else
     System.out.println("Largest Number: " +c);
}
}
