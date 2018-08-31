import java.io.*;
import java.util.*;

import jdk.nashorn.internal.ir.CatchNode;

public class IOBuffer1
{
    public static void main(String[] args)
    {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("MyFile.txt", true);
            System.out.println( " enter data to save in file. To Quit type quit: " );
            String s = " ";
            while( !s.equals("quit"))
            {
                s = reader.readLine();
                System.out.println(s);
                writer.write(s);
                writer.write(" \r\n ");

            }
            writer.write( " Good Bye!! " );
            writer.close();

            System.out.println(" Reading from file :- ");
            try
                (FileReader fReader = new FileReader("MyFile.txt"))
                {
                    int character;


                    while ((character = fReader.read()) != -1)
                    {
                        System.out.println((char) character);
                    }

                }catch (IOException e){
                    e.printStackTrace();
                }
            

        }catch (IOException ioe){
            ioe.printStackTrace();
        }


    }
}