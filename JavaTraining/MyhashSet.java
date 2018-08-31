import java.util.*;

public class MyhashSet
{
    public static void main(String[] args)
    {
        int empId[] = {1,2,31,2,21,6,4,3,7,2,8};

        Set<Integer> hs1 = new HashSet<Integer>();

        for( Integer a: empId)
        {
            boolean b = hs1.add(a);
            if( b == false)
            
                System.out.println( a + " is duplicate - result is " + b + " so not added. ");
        }    
            System.out.println( " Added elements are: " + hs1 );
        
    }
}