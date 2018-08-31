import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class DateFormat2
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a date(dd/mm/yyyy): " );
        String strD = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy" );
        sdf.setLenient(false);
        Date usrD = sdf.parse(strD);

        System.out.println( " Date as is: " + usrD );
        String dateS = sdf.format(usrD);
        System.out.println( " After applying format by SimpleDateFormat " + dateS );
    }


}