import java.util.*;

public class TestCollections
{
    public static void main(String[] args)
    {
        ArrayList<Trainee> aTr = new ArrayList<Trainee>();
        aTr.add( new Trainee(200, " Geetha "));
        aTr.add( new Trainee(100, " Seetha "));
        aTr.add( new Trainee(300, " Mala "));
        aTr.add( new Trainee(400, " Kavi "));

        System.out.println( " UNSORTED LIST : "  + aTr );

        Collections.sort(aTr);
        System.out.println( " After sorting using comparable: " + aTr);


        Collections.sort(aTr, new SortByName() );
        System.out.println( " After sorting using comparator: " + aTr );

        TreeSet<Trainee> aTrSet = new TreeSet<Trainee>(new SortByName());
        aTrSet.add( new Trainee(200, " Mayuresh "));
        aTrSet.add( new Trainee(100, " Akash "));
        aTrSet.add( new Trainee(300, " Rohit "));
        aTrSet.add( new Trainee(400, " Pranav "));

        System.out.println( " Tree set example is sorted automatically. " );
        System.out.println( " Tree set is: " + aTrSet );


        NavigableSet<Trainee> reverseNs = aTrSet.descendingSet() ;
        System.out.println( " Reverse order: " + reverseNs);       
    
}
}