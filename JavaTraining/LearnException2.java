public class LearnException2
{
    public static void main(String[] args)
    {
        try{
            int[] aI = new int[4];
            for (int k = 0;k < 4; k++){
                aI[k] = k*2;
            }
            System.out.println( "index 1 is: " + aI[1]);
            System.out.println(" index 4 is: " + aI[4]);
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println( " Error: Accessing outside the length of int array is 4 " );
        }
        catch(Exception n){
            System.out.println( " General exception. " );
        }finally{
            System.out.println(" Finally - Real Madrid is best.");
        }
        System.out.println( " After catching error." );
    }
}