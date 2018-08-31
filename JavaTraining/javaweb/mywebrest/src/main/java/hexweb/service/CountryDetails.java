package hexweb.service;

import java.util.List;
import hexweb.model.Country;
import hexweb.dao.MyDAO;
import org.skife.jdbi.v2.DBI;

public class CountryDetails
{
    public MyDAO loadDAO(){
        DBI dbi = DBConnect.getConnection();
        MyDAO mDao = dbi.onDemand(MyDAO.class);
        return mDao;   
    }
    public int GetCountryCount()
    {
        int cc = loadDAO().countCountry();
        return cc;
    }
    public List<Country> getCountryList()
    {
        List<Country> lcy = loadDAO().getCountryList();
        return lcy;    
    }
    public Country getCountryById(int id)
    {
        Country cy = loadDAO().findById(id);
        return cy;
    }

    public void insertOneCountry(String cName, String cStat)
    {
        loadDAO().insertCountry(cName, cStat);
    }

    public void updateCountry(int id, String cName)
    {
        loadDAO().updateCountry(id, cName);
    }
}