import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormat
{
    public static void main(String[] args)
    throws ParseException
    {
        Date d1 = new Date();
        System.out.println( " Date as is: " + d1);
        SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/YYYY");
        String dateS = sf1.format(d1);
        System.out.println( " After applying date format by SimpleDateFormat: " + dateS );

    }
}