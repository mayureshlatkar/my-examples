import java.util.*;

public class ArrayListString
{
    public static void main(String[] args)
    {
        ArrayList<String> as = new ArrayList<String>();
        as.add("JAVA");
        as.add("GIT");
        as.add("ANGULAR");
        as.add("JIRA");

        System.out.println(" Before Sorting: ");
        Iterator it = as.iterator();
        while(it.hasNext() )
        {
            String s = (String)it.next();
            System.out.println( " String is: " + s );
        }
        Collections.sort(as);
        System.out.println( " After sorting and changing the arraylist to array " );
        
        String[] arrS = as.toArray(new String[as.size()]);
        //OR{
        //int sizeS = as.size();
        //String[] temp = new String[sizeS];
        //String[] arrS = as.toArray(temp);
        //}
        for(String str: arrS)
        {
            System.out.println(str);
        }
    }
}