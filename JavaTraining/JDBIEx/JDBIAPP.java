//javac -d bin -sourcepath . -cp lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar JDBIApp.java
// Running java -cp bin;lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar JDBIApp

import java.util.List;
import model.Country;
import service.CountryDetails;
public class JDBIApp
{
    public static void main(String[] args)
    {
        CountryDetails cd = new CountryDetails();
        int cCount = cd.GetCountryCount();
        System.out.println( " \n Number of countries: " + cCount );

        List<Country> lc = cd.getCountryList();
        for( Country c: lc)
        System.out.println(c);
        
        Country cty = cd.getCountryById(2);
        System.out.println(cty);

        cd.insertOneCountry( " Singapore ", " Middle " );
        cd.updateCountry(2, "UpdatedSingapore" );
        
    }
}