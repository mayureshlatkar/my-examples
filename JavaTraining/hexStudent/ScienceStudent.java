package hexStudent;

public class ScienceStudent extends MyStudent
{
    double physicsM, chemistryM, mathsM;

    public ScienceStudent( String name, String standard, double physicsM, double chemistryM, double mathsM)
    {

        super(name, standard);
        this.physicsM = physicsM;
        this.chemistryM = chemistryM;
        this.mathsM = mathsM;
    }
    public double calcPercentage()
    {
        double marks = physicsM + chemistryM + mathsM;
        double percent = marks/3;
        return percent;
    }
}