package hexjdbi.dao;
import java.util.List;



import hexjdbi.model.Country;



import org.skife.jdbi.v2.sqlobject.Bind;

import org.skife.jdbi.v2.sqlobject.SqlQuery;

import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;



public interface MyDAO
{

@SqlQuery("SELECT count(Id) from Country")
int countCountry();

@SqlQuery("Select * from Country")
@Mapper(CountryMapper.class)
List<Country> getCountryList();

@SqlQuery("Select * from Country where id = :ctid") //binding variable 
@Mapper(CountryMapper.class)
Country findById(@Bind("ctid") int ctid); //@ is called annotation

@SqlUpdate("Insert into Country(countryName,status) Values(:cn, :status)")
  void insertCountry( @Bind("cn") String cName,
        @Bind("status") String status);


@SqlUpdate("Update Country set countryName = :cn where id = :id") 
void updateCountry( @Bind("id") int id, @Bind("cn") String cName);

void close();

}

