package hexjdbi;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import mockit.Expectations;
import mockit.Mocked;
import mockit.MockUp;
import mockit.Mock;
import org.junit.Test;

import hexjdbi.model.Country;
import hexjdbi.dao.MyDAO;
import hexjdbi.service.CountryDetails;

public class CountryDetailsTest{

    @Test
    public void testCountryList(
        @Mocked final MyDAO dao){
            new Expectations() {
                {
                    List<Country> cm = new ArrayList<Country>();
                    cm.add(new Country(1, "India", "High"));
                    dao.getCountryList();
                    result = cm;
                }
            };

            new MockUp<CountryDetails>() {
                @Mock
                MyDAO loadDAO(){
                    System.out.println("fake loaddao dao");
                    return dao;
                }
            };

            CountryDetails cd = new CountryDetails();
            List<Country> ca = cd.getCountryList();
            assertEquals(1, ca.size());
        }
   

        @Test
        public void testGetCountryById(
            @Mocked final MyDAO dao){
                new Expectations() {
                    {
                        Country cm = new Country(1, "Malaysia", "Low");
                        dao.findById(1);
                        result = cm;
                    }
                };

                new MockUp<CountryDetails>() {
                    @Mock
                    MyDAO loadDAO(){
                        System.out.println("fake loaddao");
                        return dao;
                    }
                };

                CountryDetails cd = new CountryDetails();
                Country cy = cd.getCountryById(1);
                assertEquals("Malaysia", cy.getCountryName());
            }
      

            @Test
            public void testInsertOneCountry(
            @Mocked final MyDAO dao){
                new Expectations() {
                    {
                        System.out.println("fake Insert");
                        dao.insertCountry("America", "High");
                        result = any;
                    }
                };

                new MockUp<CountryDetails>() {
                    @Mock
                    MyDAO loadDAO(){
                        System.out.println("Fake loaddao insert");
                        return dao;
                    }
                };
                CountryDetails cd = new CountryDetails();
                cd.insertOneCountry("America", "High");
                assertTrue(true);
            }
}