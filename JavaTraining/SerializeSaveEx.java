import java.io.*;

public class SerializeSaveEx
{
    public static void main(String[] args)
    {
        Trainee tr = new Trainee(200, "Geetha");
        try{
            FileOutputStream fileOut = new FileOutputStream("Trainee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(tr);
            out.close();
            fileOut.close();
            System.out.println( " Serialized data is saved in Trainee.ser " );
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}