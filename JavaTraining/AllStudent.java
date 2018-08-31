import hexStudent.*;

public class AllStudent
{
    public static void main(String[] args)
    {
        ScienceStudent sc1 = new ScienceStudent(" Mayuresh ", " SSC ",88,87,84);
        System.out.println( " percent of science of sc1 is: " + sc1.calcPercentage());
    }
}