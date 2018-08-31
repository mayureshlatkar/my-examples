import java.util.*;


public class StackExample
{
    public static void main(String[] args)
    {
        Stack<Character> l = new Stack<Character>();
        l.push( 'a' );
        l.push( 'b' );
        l.push( 'c' );
        System.out.println(l.peek());
        System.out.println( " Position is: " + l.search('a'));
    }
}