package comhex;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest
{
    private Calc calcEx;

    @BeforeClass
    public static void beforeClassInvoked()
    {
        System.out.println( " Before class invoked. " );
    }
    
    @AfterClass
    public static void afterClassInvoked()
    {
        System.out.println( " After class invoked. " );
    }
    
    
    @Before
    public void beforeTest()
    {
        calcEx = new Calc(4,4);
        System.out.println( " Before testing the test case" );
    }
    @After
    public void afterTest()
    {
        System.out.println( " After testing the test case. " );
    }

    @Test
    public void mulTest()
    {
        int expectedResult = 16;
        int actRes = calcEx.mul();
        System.out.println( " Executing mulTest " );
        assertEquals(expectedResult, actRes);
    }

    @Test
    public void addTest()
    {
        int expectedResult = 8;
        int actRes = calcEx.add();
        System.out.println( " Executing addTest " );
        assertEquals(expectedResult, actRes);
    }

    @Test
    public void CalcConstructorTest()
    {
        
        System.out.println( " Executing calc constructor test " );
        assertNotNull(calcEx);
    }
}