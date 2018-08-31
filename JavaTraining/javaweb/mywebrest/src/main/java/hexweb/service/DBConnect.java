package hexweb.service;
import org.skife.jdbi.v2.DBI;

public class DBConnect
{
    private static DBI dbi = null;
    public static DBI getConnection()
    {
        if(dbi == null)
        {
            try{

                Class.forName("com.mysql.jdbc.Driver");
                dbi = new DBI( "jdbc:mysql://localhost:3306/dblearn?useSSL=false","dblearn","dblearn" );
            } catch(Exception e){
                System.out.println(e);

            }
        }
            return dbi;
    }
}