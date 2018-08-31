package hexBank;
import static org.junit.Assert.*;
import org.junit.Test;

import mockit.Expectations;
//import mockit.NonStrictExpectations;
import mockit.Mocked;
import org.junit.runner.RunWith;
import mockit.integration.junit4.JMockit;

import mockit.Mock;
import mockit.MockUp;

@RunWith(JMockit.class)
public class BankExpectTest{
  
  @Test
  public void testMakeConnection(
    @Mocked final DBManager dbManager){
    Bank bank = new Bank();
    new Expectations(){
        // DBManager is mocked here
        {
          DBManager.getConnectionString();
          result = "DUPLICATE";
        }
    };
    String status = bank.makeConnection();
    System.out.println(status);
    assertEquals("Status is FAIL ", "FAIL", status);
  }

  @Test
  public void testMakeConnectionJUnit(){
    Bank bank = new Bank();
    String status = bank.makeConnection();
    System.out.println( " JUnit testcase " + status );
    assertEquals( "SUCCESS", status );
  }



  @Test
  public void testRetrieveAccountHoldername(
    @Mocked final DBManager dbManager ){
    Bank bank = new Bank();
    new Expectations(){
      {
        dbManager.retrieveAccountHolderName(10);
        result = "Abhi";
      }
    };
    String name = bank.processAccount(10);
    assertEquals("Name is","Abhi" , name);
  }

















/*************
  @Test
  public void testMakeConnectionMockup(){
    new MockUp<DBManager>(){
      @Mock
      public String getConnectionString(){
        return "DUPLICATE";
      }
    };

    Bank bank = new Bank();
    String status = bank.makeConnection();
    System.out.println(status);
    assertEquals("Status is FAIL ", "FAIL", status);
  
  }
  ***/
}