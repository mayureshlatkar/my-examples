public class LearnException
{
    public static void main(String[] args)
    {
        try{
            int i = Integer.parseInt(args[0]);
            int k = 5;
            int r = k/i;
            System.out.println("Result is: " + r);

        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(" Arguements are not passed in command line. ");
        }
        
        
        
        catch (Exception e){
            System.out.println("Errormsg: Divisible by Zero ");
            System.out.println("inbuiltMsg: " + e.getMessage());

        }
    }
}