
//For compiling
//javac -d bin -sourcepath . -cp lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar JDBIApp.java
// For Running 
//java -cp bin;lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar JDBIApp

package hexjdbi;

import java.util.List;
import hexjdbi.model.Country;
import hexjdbi.service.CountryDetails;

public class JDBIAPP
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