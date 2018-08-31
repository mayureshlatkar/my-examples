package hexweb.util;
import java.util.ArrayList;
import java.util.List;

import hexweb.model.Country;
import hexweb.service.CountryDetails;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/countries")
public class CountryRestService{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Country> getCountries()
    {
        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries = createCountryList();
        return listOfCountries;
    }

   
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Country getCountryById(@PathParam("id") int id)
    {
        CountryDetails cd = new CountryDetails();
        Country ct = cd.getCountryById(id);
        return ct;
    }


     
    //utility method to create country list.
    public List<Country> createCountryList()
    {
        CountryDetails cd = new CountryDetails();
        List<Country>listOfCountries = cd.getCountryList();

        for (Country a : listOfCountries){
            System.out.println(a);
        }
        return listOfCountries;
    }

    @POST
    @Path("/add")
    @Produces("text/html")
    public Response addCountry(
        @FormParam("country") String name,
        @FormParam("status") String status ){
            
            CountryDetails cd = new CountryDetails();
            cd.insertOneCountry(name, status);

            String str = " You have added new country. ";
            return Response.status(200).entity(str).build();
        }
    
}


