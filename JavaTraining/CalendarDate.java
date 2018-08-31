import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDate
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();

        Date d = cal.getTime();
        System.out.println( " date as is: " + d );

        SimpleDateFormat sdf1 = new SimpleDateFormat( " dd/MM/YYYY hh:mm:ss : " );
        String dStr = sdf1.format(d);
        System.out.println( " Formatted by SimpleDateFormat " + dStr);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);

        System.out.println(" Year: " + year);
        System.out.println(" Month: " + month);
        System.out.println(" Day of Month: " + dayOfMonth);
        System.out.println(" day of week: " + dayOfWeek);
        System.out.println(" Week of Year: " + weekOfYear);
    }
}