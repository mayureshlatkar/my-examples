package hexjdbi.dao;



import hexjdbi.model.Country;



import java.sql.ResultSet;

import java.sql.SQLException;



import org.skife.jdbi.v2.StatementContext;

import org.skife.jdbi.v2.tweak.ResultSetMapper;





public class CountryMapper 

implements ResultSetMapper<Country>{



public Country map( int idx, ResultSet rs, StatementContext ctx)

throws SQLException{

System.out.println("hai");

int id = rs.getInt("id");

String cName = rs.getString("countryName");

String css =rs.getString("status");

//CountryStatusE cse = CountryStatusE.valueOf(css);

return new Country(id, cName,css); 

}

}

