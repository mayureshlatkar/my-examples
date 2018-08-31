import java.util.*;
public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(3);
       // a.add(10.2);
        System.out.println( " Printing using Enhanced loop. " );
        for (Integer i: a)
        {
            System.out.println(i);
        }
        System.out.println( " Printing using iterator. " );

        Iterator<Integer> i = a.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}