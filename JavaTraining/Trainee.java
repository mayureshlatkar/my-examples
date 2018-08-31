import java.io.Serializable;

public class Trainee implements Comparable<Trainee>, Serializable
{
    int regNo;
    String name;
    public Trainee(int regNo, String name)
    {
        this.regNo = regNo;
        this.name = name;
    }

    public int compareTo(Trainee tr)
    {
      //  System.out.println( " This object regno is " + this.regNo + " arg tr regno is: " + tr.regNo);
        int val = this.regNo - tr.regNo;
        return val;
    }
    public String toString()
    {
        String str = " Regno is : " + regNo + " name is: " + name;
        return str;
    }
}