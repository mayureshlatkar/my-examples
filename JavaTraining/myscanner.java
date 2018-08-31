import java.util.Scanner;


public class myScanner{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for int i: ");
        int i = sc.nextInt();
        System.out.println("values is "+ i);
        sc.nextLine();
       
        System.out.println("Enter data for int j: ");
        int j = sc.nextInt();
        System.out.println("values is " + j);
       sc.nextLine();

       boolean b= (i>j) && (j++>i);
       System.out.println("boolean value of b is: "+b);
       System.out.println("new value of j is :" + j);
       
//ternary operator example
       int k=(i>j)?10:20;
       System.out.println("Value of K is :" + k);
       
       
        // sc.nextLine();
        //System.out.println("Enter a string: ");

       String str = sc.next();
        System.out.println("String is: " + str);
    }


}