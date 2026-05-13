import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int a,b, result=0, ch;
    
    System.out.println("Enter 1st number: ");
    a = in.nextInt();
    System.out.println("Enter 2nd number: ");
    b = in.nextInt();
    
    System.out.println("1.Enter 1 for Addition\n");
    System.out.println("2.Enter 2 for Substraction\n");
    System.out.println("3.Enter 3 for Multiplication\n");
    System.out.println("4.Enter 4 for Division\n");
    
    System.out.println("Enter your choice: ");
    ch = in.nextInt();
    switch(ch)
    {
    case 1:
     result = a+b;
     System.out.println("Addition: " +result);
     break;
     
    case 2:
     result = a-b;
     System.out.println("Addition: " +result);
     break;
     
    case 3:
     result = a*b;
     System.out.println("Addition: " +result);
     break;
     
    case 4:
     result = a/b;
     System.out.println("Addition: " +result);
     break;
     
    default:
     System.out.println("Invalid Choice");
     break;
    }
}
}
