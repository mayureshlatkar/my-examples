import java.io.*;
public class SerializeRead
{
    public static void main(String[] args)
    {
        Trainee tr;
        try{
            FileInputStream fileIn = new FileInputStream("Trainee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tr = (Trainee) in.readObject();
            in.close();
            fileIn.close();

         }catch(IOException e)
         {
             e.printStackTrace();
             return;
         }catch (ClassNotFoundException c)
         {
             System.out.println(" Trainee class not found ");
             c.printStackTrace();
             return;
         }
         System.out.println( " Deserialized Trainee.... " );
         System.out.println( " Name: " + tr.name );
         System.out.println( " RegNo. : " + tr.regNo);
    }
}