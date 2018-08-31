import java.util.*;

public class SortByName implements Comparator<Trainee>
{
    public int compare( Trainee t1, Trainee t2 )
    {
        String st1 = t1.name;
        String st2 = t2.name;
        int val = st1.compareTo(st2);
        return val;
    }
}