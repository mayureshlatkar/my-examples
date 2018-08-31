import java.io.*;
import java.util.*;

public class IOBuffer
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println( " Enter your name: " );
            String name = reader.readLine();
            System.out.println( " Your name is: " + name );
            System.out.println( " Enter any double value: " );
            String input = reader.readLine();
            double number = Double.parseDouble(input);
            System.out.println(input +  ": it's square root is - " + Math.sqrt(number) );


        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}