import java.util.*;

public class TreeMapTrainee
{
    public static void main(String[] args)
    {
        TreeMap<Integer, Trainee> hm = new TreeMap<Integer, Trainee>();
        hm.put(11, new Trainee(200, " Salah "));
        hm.put(10, new Trainee(400, " Sachin "));
        hm.put(12, new Trainee(300, " Yuvraj "));
        hm.put(07, new Trainee(250, " Cristiano "));

        Set s = hm.entrySet();
        Iterator it = s.iterator();
        System.out.println( " Key   | Value " );
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey()  + "  |  " + me.getValue() );
        }


    }

}