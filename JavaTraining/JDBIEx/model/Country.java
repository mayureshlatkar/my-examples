package model;



public class Country{

private int id;

private String countryName;

private String cse;



public String getCse()
{
    return cse;
}

public void setCse(String cse )
{
    this.cse = cse;
}

public int getId()
{
     return id;
}

public void setId( int id )
{
    this.id = id;
}

public String getCountryName()
{
    return countryName;
}

public void setCountryName( String countryName)
{
    this.countryName = countryName;
}

public Country( int id, String countryName, String cse)
{
    this.id = id;
    this.countryName = countryName;
    this.cse = cse;
}

public String toString()
{   
    String str = "Id is : " + id + " CountryName : " + countryName + "CountryStatus :" + cse;

    return str;

}

}
