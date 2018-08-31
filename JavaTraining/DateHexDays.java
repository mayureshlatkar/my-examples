import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class DateHexDays
{
    public static void main(String[] args)throws ParseException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( " Enter a DOJ(dd/MM/yyyy)" );
        String dojStr = sc.nextLine();

        System.out.println( " Enter today's date (dd/MM/yyyy): " );
        String todayStr = sc.nextLine();

        SimpleDateFormat dojSdf = new SimpleDateFormat("dd/MM/yyyy");
        dojSdf.setLenient(false);
        Date dojDate = dojSdf.parse(dojStr);

        SimpleDateFormat todaySdf = new SimpleDateFormat("dd/MM/yyyy");
        todaySdf.setLenient(false);
        Date todayDate = todaySdf.parse(todayStr);
        
        long diff = todayDate.getTime() - dojDate.getTime();
        System.out.println(" Difference in miliseconds: " + diff);
        
        long days = diff / (1000*60*60*24) + 1;

        System.out.println( " No of days in company: " + days );

    }
}